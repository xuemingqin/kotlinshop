package com.example.kotlinshop.utils

import android.content.Context
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.target.BitmapImageViewTarget
import com.bumptech.glide.request.target.CustomTarget
import com.bumptech.glide.request.target.SimpleTarget
import com.bumptech.glide.request.target.ViewTarget
import com.bumptech.glide.request.transition.Transition
import com.example.kotlinshop.R


object GlideUtlis {
    fun loadImage(context: Context, url: String, imageView: ImageView) {
        Glide.with(context).load(url).centerCrop().into(imageView)

    }

    fun loadImageFitCenter(context: Context, url: String, imageView: ImageView) {
        Glide.with(context).load(url).fitCenter().into(imageView)
    }

    // 当fragment或者activity失去焦点或者destroyed的时候，Glide会自动停止加载相关资源，确保资源不会被浪费
    fun loadUrlImage(context: Context, url: String, imageView: ImageView) {
        Glide.with(context).load(url).placeholder(R.drawable.icon_back).error(R.drawable.icon_back).centerCrop()
            .into(imageView)
    }
}