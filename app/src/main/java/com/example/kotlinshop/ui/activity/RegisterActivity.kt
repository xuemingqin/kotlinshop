package com.example.kotlinshop.ui.activity

import android.app.Activity
import android.os.Bundle
import com.example.kotlinshop.R
import kotlinx.android.synthetic.main.activity_register.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class RegisterActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        initView()
    }

    private fun initView() {

        mRegisterBtn.onClick {

        }

    }

    fun isBtnEnable(): Boolean {
        return mMobileEt.text.isNotEmpty().not() &&
             mVerifyCodeEt.text.isNotEmpty().not() &&
                mPwdEt.text.isNotEmpty().not() &&
                mPwdConfirmEt.text.isNotEmpty().not()
    }

}