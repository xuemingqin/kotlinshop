package com.example.kotlinshop.presenter.view

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun error(text:String)
}