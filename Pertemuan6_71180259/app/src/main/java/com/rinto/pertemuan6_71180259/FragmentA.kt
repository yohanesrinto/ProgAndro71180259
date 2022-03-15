package com.rinto.pertemuan6_71180259

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rinto.pertemuan6_71180259.databinding.FragmentABinding

class FragmentA : Fragment() {

    private lateinit var binding: FragmentABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentABinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.btnhalamandua.setOnClickListener {
            findNavController().navigate(R.id.action_fragmentA_to_halamanDuaActivity)
        }
    }
}