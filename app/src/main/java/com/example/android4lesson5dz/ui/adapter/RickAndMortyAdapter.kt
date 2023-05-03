package com.example.android4lesson5dz.ui.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.android4lesson5dz.databinding.ItemRickAndMortyBinding
import com.example.android4lesson5dz.extention.setImage
import com.example.android4lesson5dz.models.CharacterAndLocationModel

class RickAndMortyAdapter :
    ListAdapter<CharacterAndLocationModel, RickAndMortyAdapter.ViewHolder>(diffUtil) {

    class ViewHolder(private val binding: ItemRickAndMortyBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(item: CharacterAndLocationModel?) {
            binding.itemPersonImg.setImage(item!!.character.image)
            binding.itemNameTv.text = item.character.name
            binding.itemDimensionTv.text = item.location.dimension
            binding.itemTypeTv.text = item.location.type
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
        private val diffUtil = object : DiffUtil.ItemCallback<CharacterAndLocationModel>() {
            override fun areItemsTheSame(
                oldItem: CharacterAndLocationModel,
                newItem: CharacterAndLocationModel
            ): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(
                oldItem: CharacterAndLocationModel,
                newItem: CharacterAndLocationModel
            ): Boolean {
                return oldItem.id == newItem.id
            }
        }
    }
}