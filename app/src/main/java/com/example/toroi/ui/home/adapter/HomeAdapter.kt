package com.example.toroi.ui.home.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.toroi.databinding.IndiviewHomeCardsBinding
import com.glocal.centerpatient.ui.home.model.HomeCards

class HomeAdapter : RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private val items = ArrayList<HomeCards>()

    fun submitList(homeList: ArrayList<HomeCards>) {
        items.clear()
        notifyItemRangeRemoved(0, items.size)
        items.addAll(homeList)
        notifyItemRangeInserted(0, items.size)
    }


    inner class HomeViewHolder(private val binding: IndiviewHomeCardsBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(item: HomeCards) {
            with(binding) {
            }

        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val binding =
            IndiviewHomeCardsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int = items.size
}
