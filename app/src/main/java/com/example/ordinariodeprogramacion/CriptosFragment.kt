package com.example.ordinariodeprogramacion

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ordinariodeprogramacion.databinding.FragmentCriptosBinding

class CriptosFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding = FragmentCriptosBinding.inflate(inflater, container, false)

        val criptosListAdapter = CriptoListAdapter(criptosList)

        binding.recyclerCriptosList.layoutManager = LinearLayoutManager(context)
        binding.recyclerCriptosList.adapter = criptosListAdapter

        return binding.root
    }
}