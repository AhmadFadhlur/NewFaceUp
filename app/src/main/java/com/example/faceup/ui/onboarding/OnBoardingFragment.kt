package com.example.faceup.ui.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.faceup.R
import com.example.faceup.databinding.FragmentOnBoardingBinding
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.floatingactionbutton.FloatingActionButton


class OnBoardingFragment : Fragment() {

    private var _binding: FragmentOnBoardingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentOnBoardingBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnOnBoarding.setOnClickListener {
            it.findNavController().navigate(R.id.action_onBoardingFragment_to_loginFragment)
        }
//        setBottomNav()
    }
//    private fun setBottomNav(){
//        val botAppbar = activity?.findViewById<BottomAppBar>(R.id.bottomAppBar)
//        botAppbar?.visibility = View.GONE
//        val floatButton = activity?.findViewById<FloatingActionButton>(R.id.fab_buttonCamera)
//        floatButton?.visibility = View.GONE
//    }
}