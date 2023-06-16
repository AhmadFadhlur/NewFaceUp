package com.example.faceup.ui.profile

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.faceup.R
import com.example.faceup.databinding.FragmentProfileBinding
import com.example.faceup.ui.bottomsheet.product.adapter.ProductAdapter
import com.example.faceup.utils.Product
import com.google.android.material.bottomappbar.BottomAppBar
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ProfileFragment : Fragment() {

    private var _bindng : FragmentProfileBinding? = null
    private val binding get() = _bindng!!
    private val list = ArrayList<Product>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _bindng = FragmentProfileBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setBottomNav()
        setRvProduct ()
    }


    private fun getProductItem() : ArrayList<Product>{
        val namaProduct = "Acne"
        val description = "this type acne commonly happend to of us because cannon event"
        val gambar = R.drawable.crew
        val listProduct = ArrayList<Product>()

        for (i in 0..10){
            val product = Product(namaProduct,description,gambar)
            listProduct.add(product)
        }

        return listProduct
    }


    private fun setRvProduct (){
        list.addAll(getProductItem())
        binding.rvHistory.layoutManager = LinearLayoutManager(requireContext())
        val adapter= ProductAdapter(list)
        binding.rvHistory.adapter = adapter
    }

    private fun setBottomNav(){
        val botAppbar = activity?.findViewById<BottomAppBar>(R.id.bottomAppBar)
        botAppbar?.visibility = View.INVISIBLE
        val floatButton = activity?.findViewById<FloatingActionButton>(R.id.fab_buttonCamera)
        floatButton?.visibility = View.INVISIBLE
    }


}