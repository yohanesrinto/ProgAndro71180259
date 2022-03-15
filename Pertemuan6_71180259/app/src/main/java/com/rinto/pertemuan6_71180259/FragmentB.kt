package com.rinto.pertemuan6_71180259

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rinto.pertemuan6_71180259.databinding.FragmentBBinding

class FragmentB : Fragment() {

    private lateinit var binding: FragmentBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnhalamantiga.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentB_to_halamanTigaActivity)
        }
    }
}