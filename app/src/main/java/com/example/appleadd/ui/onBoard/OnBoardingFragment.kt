package com.example.appleadd.ui.onBoard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.appleadd.R
import com.example.appleadd.databinding.FragmentOnBoardingBinding
import com.example.appleadd.model.OnBoard
import com.example.appleadd.ui.onBoard.adapter.OnBoardingAdapter
import com.example.appleadd.utilse.showToast

class OnBoardingFragment : Fragment() {
    private lateinit var binding : FragmentOnBoardingBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentOnBoardingBinding.inflate(inflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
      val adapter = OnBoardingAdapter(this :: onClick)
        binding.viewPager.adapter = adapter
    }
   private fun onClick (onBoard: OnBoard){

    }
            }

