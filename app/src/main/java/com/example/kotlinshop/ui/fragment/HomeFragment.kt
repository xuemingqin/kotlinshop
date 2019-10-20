package com.example.kotlinshop.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.chen.baselibrary.widgets.BannerImageLoader
import com.example.chen.kotlinshop.common.*
import com.example.kotlinshop.R
import com.example.kotlinshop.adapter.HomeDiscountAdapter
import com.youth.banner.BannerConfig
import com.youth.banner.Transformer
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBanner()
        initNews()
        initDiscount()
    }

    private fun initDiscount() {
        val manager = LinearLayoutManager(context)
        manager.orientation = LinearLayoutManager.HORIZONTAL
        mHomeDiscountRv.layoutManager = manager
        val discountAdapter = HomeDiscountAdapter(activity!!)
        //适配器绑定
        mHomeDiscountRv.adapter = discountAdapter
        discountAdapter.setData(
            mutableListOf(
                HOME_DISCOUNT_ONE,
                HOME_DISCOUNT_TWO,
                HOME_DISCOUNT_THREE,
                HOME_DISCOUNT_FOUR,
                HOME_DISCOUNT_FIVE
            )
        )
    }

    private fun initNews() {
       mNewFlipper.setData(arrayOf("夏日炎炎，第一波福利还有30秒到达战场", "新用户立领1000元优惠券"))
    }

    private fun initBanner() {
        mHomeBanner.setImageLoader(BannerImageLoader())
        mHomeBanner.setImages(listOf(HOME_BANNER_ONE, HOME_BANNER_TWO, HOME_BANNER_THREE, HOME_BANNER_FOUR))
        mHomeBanner.setBannerAnimation(Transformer.Accordion)//动画
        mHomeBanner.setDelayTime(2000)//时间
        //设置指示器位置（当banner模式中有指示器时右下角）
        mHomeBanner.setIndicatorGravity(BannerConfig.RIGHT)
        mHomeBanner.start()
    }
}