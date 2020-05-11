package com.example.kotlinshop.presenter.view

class BasePresenter <T:BaseView>{
    lateinit var mView: T
}