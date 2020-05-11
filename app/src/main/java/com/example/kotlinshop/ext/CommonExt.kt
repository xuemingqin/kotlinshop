package com.example.kotlinshop.ext

import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import com.example.kotlinshop.DefaultTextWatcher
import com.example.kotlinshop.utils.GlideUtlis

fun ImageView.loadUrl(url: String) {
    GlideUtlis.loadUrlImage(context, url, this)
}
fun Button.enable(et:EditText,method:()-> Boolean){
    val btn=this
    et.addTextChangedListener(object : DefaultTextWatcher(){
        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            btn.isEnabled=method()
        }
    })
}