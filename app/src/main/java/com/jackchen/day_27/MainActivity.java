package com.jackchen.day_27;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.jackchen.day_27.parallax.animation.ParallaxFragment;
import com.jackchen.day_27.parallax.animation.ParallaxViewPager;

public class MainActivity extends AppCompatActivity {

    // 2.2.1 先把布局 和 fragment 创建好
    private ParallaxViewPager mParallaxViewPager ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        mParallaxViewPager = (ParallaxViewPager)findViewById(R.id.parallax_vp) ;

        // 在这里直接给一个方法，获取一个布局数组，一定要采用最简便的方式让别人来使用
        mParallaxViewPager.setLayoutId(getSupportFragmentManager() ,
                new int[]{R.layout.fragment_page_first , R.layout.fragment_page_second , R.layout.fragment_page_third});

    }
}
