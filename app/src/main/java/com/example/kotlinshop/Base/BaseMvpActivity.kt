package com.example.kotlinshop.Base

import com.example.kotlinshop.presenter.view.BasePresenter
import com.example.kotlinshop.presenter.view.BaseView

class BaseMvpActivity<T:BasePresenter<*>>:BaseActivity(),BaseView{
    override fun showLoading() {

    }

    override fun hideLoading() {
    }

    override fun error(text: String) {
    }
    lateinit var mPresenter: T
}