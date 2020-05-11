package com.example.kotlinshop

import com.example.kotlinshop.presenter.view.BaseView


interface RegisterView: BaseView {
    fun onRegisterResult(result:String)
}