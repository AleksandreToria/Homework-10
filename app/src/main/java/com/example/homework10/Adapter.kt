package com.example.homework10

import android.annotation.SuppressLint
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.homework10.databinding.ItemBinding

class Adapter(private val dataList: List<Data>) : RecyclerView.Adapter<Adapter.ViewHolder>() {
    @SuppressLint("UseSwitchCompatOrMaterialCode")
    class ViewHolder(binding: ItemBinding) : RecyclerView.ViewHolder(binding.root) {
        val icon = binding.icon
        val text = binding.text
        val secondText = binding.secondText
        val arrow = binding.arrow
        val switch = binding.darkModeSwitch
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = dataList[position]

        holder.icon.setImageResource(data.icon)
        holder.text.text = data.text
        holder.secondText.text = data.secondText
        holder.arrow.setImageResource(data.arrow)

        if (data.hasSwitch) {
            holder.switch.visibility = View.VISIBLE
        } else {
            holder.switch.visibility = View.GONE
        }

        if (position == dataList.lastIndex)
            holder.text.setTextColor(Color.parseColor("#F05454"))
        else
            holder.text.setTextColor(Color.WHITE)

    }
}