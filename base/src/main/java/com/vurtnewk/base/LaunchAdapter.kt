package com.vurtnewk.base

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.vurtnewk.base.databinding.ItemClassEntityBinding
import com.vurtnewk.basemodule.ClassEntity

/**
 * @author VurtneWk
 * 2022/2/10
 */
class LaunchAdapter() : ListAdapter<ClassEntity, LaunchAdapter.ViewHolder>(COMPARATOR) {

    companion object {
        val COMPARATOR = object : DiffUtil.ItemCallback<ClassEntity>() {
            override fun areItemsTheSame(oldItem: ClassEntity, newItem: ClassEntity): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ClassEntity, newItem: ClassEntity): Boolean {
                return oldItem == newItem
            }
        }
    }

    class ViewHolder(val binding: ItemClassEntityBinding) : RecyclerView.ViewHolder(binding.root) {

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val binding = ItemClassEntityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolder(binding)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val context = holder.binding.root.context
        val item = getItem(position)
        holder.binding.tvClassName.setOnClickListener {
            val intent = Intent(context, item.clazz)
            context.startActivity(intent)
        }
        holder.binding.tvClassName.text = item.name
    }
}