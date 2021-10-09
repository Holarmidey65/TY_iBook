package com.showtyclef.ty_ibook

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.showtyclef.ty_ibook.databinding.FragmentSplashScreentwoBinding



class splash_screentwo : Fragment() {

    private var _binding: FragmentSplashScreentwoBinding? = null
    private val binding get() = _binding!!
    private lateinit var navCon: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSplashScreentwoBinding.inflate(inflater, container, false)
        navCon = NavHostFragment.findNavController(this)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.btnProceed.setOnClickListener {
            Toast.makeText(requireActivity(), "Welcome", Toast.LENGTH_LONG).show()
        }

    }
}