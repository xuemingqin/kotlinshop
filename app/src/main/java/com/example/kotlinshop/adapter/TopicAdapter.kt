package com.example.kotlinshop.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.PagerAdapter
import com.example.kotlinshop.R
import com.example.kotlinshop.common.loadUrl
import kotlinx.android.synthetic.main.fragment_home.view.*
import kotlinx.android.synthetic.main.layout_topic_item.view.*

class TopicAdapter (private val context: Context,private val list: List<String>):PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val rootView = LayoutInflater.from(context).inflate(R.layout.layout_topic_item, null)
        rootView.mTopicIv.loadUrl(list[position])
        container.addView(rootView)
        return rootView
    }
}

