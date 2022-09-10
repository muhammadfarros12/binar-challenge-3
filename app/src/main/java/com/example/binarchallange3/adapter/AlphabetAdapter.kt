package com.example.binarchallange3.adapter

import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.binarchallange3.DetailFragment
import com.example.binarchallange3.MainActivity
import com.example.binarchallange3.R
import com.example.binarchallange3.databinding.ItemViewBinding
import com.example.binarchallange3.model.AlphabetModel
import com.example.binarchallange3.utils.OnItemClickCallback

class AlphabetAdapter(private val list: ArrayList<AlphabetModel>) :
    RecyclerView.Adapter<AlphabetAdapter.CardViewHolder>() {


    var onItemClicked: OnItemClickCallback? = null


    class CardViewHolder(private val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(list: AlphabetModel) {
            binding.btnText.text = list.alphabet

            binding.btnText.setOnClickListener {
                val activity = itemView.context as MainActivity
                activity.setWordFragment(DetailFragment(list.word))
            }
        }
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        // onItemClicked?.let { holder.bind(list[position], it) }
        holder.bind(list[position])
    }

    fun setOnClickCallback(onItemClicked: OnItemClickCallback){
        this.onItemClicked = onItemClicked
    }


    override fun getItemCount() = list.size

    companion object {
        val EXTRA_ALPHABET = "extra_alphabet"
    }

}
