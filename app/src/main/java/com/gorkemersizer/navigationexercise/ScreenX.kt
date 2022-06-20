package com.gorkemersizer.navigationexercise

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.gorkemersizer.navigationexercise.databinding.FragmentScreenXBinding


class ScreenX : Fragment() {

    private lateinit var binding: FragmentScreenXBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScreenXBinding.inflate( inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.goYButton2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_screenX_to_screenY)
        }
    }

}