package com.example.haya_task02

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.haya_task02.databinding.ItemRowBinding

class ListViewAdapter(val list: List<String>) : RecyclerView.Adapter<ListViewAdapter.ItemViewHolder>() {
    class ItemViewHolder (val binding: ItemRowBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            ItemRowBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = list[position]

        holder.binding.apply {
            textView.text = item
        }
    }

    override fun getItemCount(): Int = list.size

}
