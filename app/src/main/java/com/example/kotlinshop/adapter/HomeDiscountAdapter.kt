package com.example.kotlinshop.adapter

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlinshop.R
import com.example.kotlinshop.utils.GlideUtlis
import kotlinx.android.synthetic.main.layout_home_discount_item.view.*


class HomeDiscountAdapter(context: Context) : BaseRecyclerViewAdapter<String, HomeDiscountAdapter.ViewHolder>(context) {

    //加载item布局
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeDiscountAdapter.ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.layout_home_discount_item, parent, false)
        return ViewHolder(view)
    }

    //绑定数据
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        super.onBindViewHolder(holder, position)
        //加载图片
        GlideUtlis.loadUrlImage(mContext, dataList[position], holder.itemView.mGoodsIconIv)
        //静态假数据
        holder.itemView.mDiscountBeforeTv.text = "$1000"
        holder.itemView.mDiscountAfterTv.text = "$123"
    }

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        init {
            //设置TextView的样式
            view.mDiscountAfterTv.paint.isAntiAlias = true
            view.mDiscountBeforeTv.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG//;这个属性的字体有点模糊不清,中间加横线

        }
    }
}