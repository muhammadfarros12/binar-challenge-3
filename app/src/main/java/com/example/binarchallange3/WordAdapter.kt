package com.example.binarchallange3

import android.content.Intent
import android.net.Uri
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.binarchallange3.databinding.ItemViewBinding

class WordAdapter(private val list: Array<String>): RecyclerView.Adapter<WordAdapter.CardViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordAdapter.CardViewHolder {
        val binding = ItemViewBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WordAdapter.CardViewHolder, position: Int) {
        holder.bind(list)
        holder.itemView.setOnClickListener {
            val uri = Uri.parse("https://www.google.com/search?q=${list[position]}")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            it.context.startActivity(intent)
        }
    }

    override fun getItemCount() = list.size

    class CardViewHolder(private val binding: ItemViewBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(list: Array<String>){
            binding.apply {
                btnText.text = list[position]
            }
        }
    }
}