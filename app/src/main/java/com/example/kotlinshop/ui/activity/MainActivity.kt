package com.example.kotlinshop.ui.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kotlinshop.R
import com.example.kotlinshop.ui.fragment.HomeFragment
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mBottomNavBar.checkCartBadge(20)
        mBottomNavBar.checkMsgBadge(false)
        initview()

        Observable.timer(2,TimeUnit.SECONDS)
            . observeOn(AndroidSchedulers.mainThread())
            .subscribe({mBottomNavBar.checkCartBadge(0)})

        Observable.timer(2,TimeUnit.SECONDS)
            . observeOn(AndroidSchedulers.mainThread())
            .subscribe({mBottomNavBar.checkMsgBadge(true)})

    }
    private fun initview(){
        val  manager=supportFragmentManager.beginTransaction()
        manager.replace(R.id.mContaier,HomeFragment()).commit()
    }

}
