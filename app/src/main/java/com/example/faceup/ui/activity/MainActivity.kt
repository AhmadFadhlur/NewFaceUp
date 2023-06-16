package com.example.faceup.ui.activity

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.widget.Button
import android.widget.Toast
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.example.faceup.R
import com.example.faceup.databinding.ActivityMainBinding
import com.example.faceup.ui.detail.DetailFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class MainActivity : AppCompatActivity() {
    lateinit var binding  : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navView: BottomNavigationView = findViewById(R.id.nav_view)
        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fragContainerView) as NavHostFragment
        val navController = navHostFragment.navController
        val appBarConfiguration = AppBarConfiguration.Builder(
            R.id.homePage,
            R.id.profileFragment
        ).build()

        setupActionBarWithNavController(navController, appBarConfiguration)
        navView.setupWithNavController(navController)
        navController.addOnDestinationChangedListener { _, destination, _ ->
            when (destination.id) {
                R.id.registerFragment -> hideBottomNav(true)
                R.id.onBoardingFragment -> hideBottomNav(true)
                R.id.loginFragment -> hideBottomNav(true)
                R.id.splashScreenFragment -> hideBottomNav(true)
                else -> hideBottomNav(false)
            }
        }

        setCamera()
    }

    private fun hideBottomNav(hide: Boolean) {
        if (hide) {
            binding.navView.visibility = View.GONE
        } else {
            binding.navView.visibility = View.VISIBLE
        }
    }

    private fun setCamera(){
//        binding.fabButtonCamera.setOnClickListener {
//
//            MaterialAlertDialogBuilder(this)
//                .setTitle("Warning")
//                .setMessage("Please Take Close Picture")
//                .setNeutralButton("Cancel") { dialog, which ->
//                    // Respond to neutral button press
//                }
//                .setNegativeButton("decline") { dialog, which ->
//                    // Respond to negative button press
//                }
//                .setPositiveButton("Accept") { dialog, which ->
//                    Toast.makeText(this, "Fragment", Toast.LENGTH_LONG).show()
////                    val fragmentManager = supportFragmentManager
////                    val fragment = DetailFragment() // Ganti dengan Fragment yang ingin ditampilkan
////                    val fragmentTransaction = fragmentManager.beginTransaction()
////                    fragmentTransaction.replace(R.id.fragmentContainer, fragment) // Ganti R.id.fragmentContainer dengan ID kontainer di layout tempat Fragment akan ditempatkan
////                    fragmentTransaction.commit()
////                findNavController().navigate(R.id.detailFragment2)
//                }
//                .show()
//        }

    }

    private fun customDialog(){
        val dialog = Dialog(this)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.custom_dialog)

        val btnOk = dialog.findViewById<Button>(R.id.buttonOke)
        btnOk.setOnClickListener{
            dialog.dismiss()
        }
        dialog.show()
    }


}