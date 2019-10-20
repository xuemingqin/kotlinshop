package com.example.kotlinshop.adapter

import android.content.Context

import androidx.recyclerview.widget.RecyclerView
import java.text.ParsePosition

abstract class BaseRecyclerViewAdapter<T, VH : RecyclerView.ViewHolder>(var mContext: Context) :
    RecyclerView.Adapter<VH>() {
    var mItemClickListener: OnItemClickListener<T>? = null
    //数据集合
    var dataList: MutableList<T> = mutableListOf()

    // 设置数据
    fun setData(sources: MutableList<T>) {
        dataList = sources
        notifyDataSetChanged()
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.itemView.setOnClickListener {
            mItemClickListener?.let {
                it!!.onItemClick(dataList[position], position)
            }
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    // ItemClick事件声明
    interface OnItemClickListener<in T> {
        fun onItemClick(item: T, position: Int)
    }

    fun setOnItemClickListener(listener: OnItemClickListener<T>) {
        this.mItemClickListener = listener
    }
}