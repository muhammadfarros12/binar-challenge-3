package com.example.binarchallange3

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.binarchallange3.adapter.AlphabetAdapter
import com.example.binarchallange3.adapter.WordAdapter
import com.example.binarchallange3.databinding.FragmentDetailBinding

class DetailFragment(private val list: ArrayList<String>) : Fragment() {

    private var _binding: FragmentDetailBinding? = null
    private val binding get() = _binding as FragmentDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentDetailBinding.inflate(layoutInflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //val data = arguments?.getStringArrayList(AlphabetAdapter.EXTRA_ALPHABET)

        ///val mData = DetailFragmentArgs.fromBundle(arguments as Bundle).name

        binding.rcvWords.apply {
            adapter = WordAdapter(list)
            layoutManager = LinearLayoutManager(activity)
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}

