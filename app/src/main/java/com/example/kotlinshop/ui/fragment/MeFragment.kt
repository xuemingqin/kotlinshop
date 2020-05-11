package com.example.kotlinshop.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment
import com.example.kotlinshop.R
import com.example.kotlinshop.common.ProviderConstant
import com.example.kotlinshop.common.isLogined
import com.example.kotlinshop.ext.loadUrl
import com.example.kotlinshop.ui.activity.LoginActivity
import com.example.kotlinshop.ui.activity.UserInfoActivity
import com.example.kotlinshop.ui.activity.settingActivity
import com.example.kotlinshop.utils.AppPrefsUtils
import kotlinx.android.synthetic.main.fragment_me.*
import org.jetbrains.anko.support.v4.startActivity

class MeFragment : Fragment(), View.OnClickListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_me, null)
    }


    override fun onStart() {
        super.onStart()
        loadData()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        mUserIconIv.setOnClickListener(this)
        mUserNameTv.setOnClickListener(this)
        mSettingTv.setOnClickListener(this)
    }

    private fun loadData() {

        if (isLogined()) {
            val userIcon = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_ICON)
            userIcon?.let{
                mUserIconIv.loadUrl(it)}
            mUserNameTv.text = AppPrefsUtils.getString(ProviderConstant.KEY_SP_USER_NAME)
        } else {
            mUserIconIv.setImageResource(R.drawable.icon_default_user)
            mUserNameTv.text = getString(R.string.un_login_text)
        }
    }




    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.mUserIconIv, R.id.mUserNameTv -> {
                if( isLogined()){
                    startActivity<UserInfoActivity>()
                } else {
                    startActivity<LoginActivity>()
                }
            }
            R.id.mSettingTv ->{
                startActivity<settingActivity>()
            }
        }


    }

}