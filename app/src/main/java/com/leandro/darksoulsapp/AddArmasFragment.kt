package com.leandro.darksoulsapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.leandro.darksoulsapp.databinding.FragmentAddArmasBinding
import com.leandro.darksoulsapp.databinding.FragmentArmasBinding

class AddArmasFragment : Fragment() {

    private lateinit var binding: FragmentAddArmasBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return binding.root
    }
}