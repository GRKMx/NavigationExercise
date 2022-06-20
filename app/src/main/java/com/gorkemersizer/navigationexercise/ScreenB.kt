package com.gorkemersizer.navigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.gorkemersizer.navigationexercise.databinding.FragmentScreenBBinding


class ScreenB : Fragment() {

    private lateinit var binding: FragmentScreenBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScreenBBinding.inflate( inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goYButton.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_screenB_to_screenY)
        }
    }

}