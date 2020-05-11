package com.example.kotlinshop.ui.activity

import android.app.Activity
import android.os.Bundle
import com.example.kotlinshop.R
import com.example.kotlinshop.utils.UserPrefsUtils
import kotlinx.android.synthetic.main.activity_setting.*

class settingActivity:Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)

        mLogoutBtn.setOnClickListener {
            UserPrefsUtils.putUserInfo(null)
            finish()
        }
    }
}