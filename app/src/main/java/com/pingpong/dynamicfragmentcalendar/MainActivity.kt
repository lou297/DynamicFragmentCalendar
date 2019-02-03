package com.pingpong.dynamicfragmentcalendar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import com.pingpong.dynamicfragmentcalendar.Adapter.ViewPagerAdapter
import com.pingpong.dynamicfragmentcalendar.CalendarView.CalendarFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ViewPager.adapter = ViewPagerAdapter(supportFragmentManager)
    }
}
