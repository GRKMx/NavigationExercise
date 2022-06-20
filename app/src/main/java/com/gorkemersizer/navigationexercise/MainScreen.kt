package com.gorkemersizer.navigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import com.gorkemersizer.navigationexercise.databinding.ActivityMainBinding
import com.gorkemersizer.navigationexercise.databinding.FragmentMainScreenBinding


class MainScreen : Fragment() {

    private lateinit var binding: FragmentMainScreenBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainScreenBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goAButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainScreen_to_screenA)
        }

        binding.goXButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_mainScreen_to_screenX)
        }

    }

}