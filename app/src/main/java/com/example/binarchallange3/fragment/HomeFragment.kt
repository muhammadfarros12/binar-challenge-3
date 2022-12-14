package com.example.binarchallange3.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.binarchallange3.adapter.AlphabetAdapter
import com.example.binarchallange3.databinding.FragmentHomeBinding
import com.example.binarchallange3.list
import com.example.binarchallange3.utils.OnItemClickCallback


class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding as FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)

        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.rcvAlphabet.apply {
            layoutManager = LinearLayoutManager(activity)

            val mAdapter = AlphabetAdapter(list)
            adapter = mAdapter
            mAdapter.setOnClickCallback(object : OnItemClickCallback {
                override fun onItemClicked(list: Array<String>) {
                    val action = HomeFragmentDirections.actionHomeFragmentToDetailFragment(list)
                    view.findNavController().navigate(action)
                }


            })

        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}