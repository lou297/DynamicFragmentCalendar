package com.pingpong.dynamicfragmentcalendar

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentManager
import android.util.Log
import com.pingpong.dynamicfragmentcalendar.Adapter.ViewPagerAdapter
import com.pingpong.dynamicfragmentcalendar.Adapter.ViewPagerAdapter.Companion.CalendarFragmentList
import com.pingpong.dynamicfragmentcalendar.CalendarView.CalendarFragment
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        InitializeFragmentList()
        ViewPager.adapter = ViewPagerAdapter(supportFragmentManager)
        ViewPager.currentItem=12
    }

    private fun InitializeFragmentList(){
        for(i in 0 .. 24){
            //25개월의 달력을 미리 생성한다.
            val Calendar = Calendar.getInstance()
            val ThisYear = Calendar.get(java.util.Calendar.YEAR)
            val ThisMonth = Calendar.get(java.util.Calendar.MONTH)

            var setYear = ThisYear
            var setMonth = ThisMonth + i - 12

            while(setMonth<0 || setMonth>11){
                if(setMonth<0) {
                    setMonth += 12
                    setYear--
                }
                if(setMonth>11) {
                    setMonth -= 12
                    setYear++
                }
            }
            val Frags = CalendarFragment()
            Frags.apply {
                arguments = Bundle().apply {
                    putInt("YEAR",setYear)
                    putInt("MONTH",setMonth)
                }
            }
            Log.d("test","sdfsdf")
            CalendarFragmentList.add(Frags)
        }
    }
}
