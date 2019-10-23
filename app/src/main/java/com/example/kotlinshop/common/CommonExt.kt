package com.example.kotlinshop.common


import android.widget.ImageView
import com.example.kotlinshop.utils.GlideUtlis

fun ImageView.loadUrl(url: String) {
    GlideUtlis.loadUrlImage(context, url, this)
}