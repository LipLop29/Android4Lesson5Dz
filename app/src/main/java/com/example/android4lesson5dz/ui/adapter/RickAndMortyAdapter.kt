package com.example.android4lesson5dz.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android3lesson7dz.extention.setImage
import com.example.android4lesson5dz.databinding.ItemRickAndMortyBinding
import com.example.android4lesson5dz.models.ResultsItem

class RickAndMortyAdapter :
    ListAdapter<ResultsItem, RickAndMortyAdapter.ViewHolder>(diffUtil) {

    class ViewHolder(private val binding: ItemRickAndMortyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: ResultsItem?) {
            binding.itemImgPerson.setImage(item!!.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemRickAndMortyBinding.inflate(
                LayoutInflater.from(
                    parent.context
                ), parent, false
            )
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.onBind(getItem(position))
    }

    companion object {
        private val diffUtil = object : DiffUtil.ItemCallback<ResultsItem>() {
            override fun areItemsTheSame(
                oldItem: ResultsItem,
                newItem: ResultsItem
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: ResultsItem,
                newItem: ResultsItem
            ): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}