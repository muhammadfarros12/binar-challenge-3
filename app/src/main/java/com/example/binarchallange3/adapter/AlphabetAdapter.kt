package com.example.binarchallange3.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.binarchallange3.AlphabetModel
import com.example.binarchallange3.databinding.ItemViewBinding
import com.example.binarchallange3.utils.OnItemClickCallback

class AlphabetAdapter(private val list: ArrayList<AlphabetModel>) :
    RecyclerView.Adapter<AlphabetAdapter.CardViewHolder>() {

    var onItemClicked: OnItemClickCallback? = null

    class CardViewHolder(private val binding: ItemViewBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(list: AlphabetModel, onItemClicked: OnItemClickCallback) {
            binding.btnText.text = list.alphabet

            binding.btnText.setOnClickListener {
                onItemClicked.onItemClicked(list.word)
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
        onItemClicked?.let { holder.bind(list[position], it) }
//        holder.itemView.setOnClickListener {
//            val mBundle = Bundle()
//            mBundle.putStringArray(EXTRA_ALPHABET, list[position].word)
//            it.findNavController().navigate(R.id.action_homeFragment_to_detailFragment, mBundle)
//        }
    }

    fun setOnClickCallback(onItemClicked: OnItemClickCallback) {
        this.onItemClicked = onItemClicked
    }


    override fun getItemCount() = list.size

//    companion object {
//        val EXTRA_ALPHABET = "extra_alphabet"
//    }

}
