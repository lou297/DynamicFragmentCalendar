package com.pingpong.dynamicfragmentcalendar.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import com.pingpong.dynamicfragmentcalendar.CalendarView.CalendarFragment

class ViewPagerAdapter(FM : FragmentManager) : FragmentPagerAdapter(FM) {
    override fun getItem(p0: Int): Fragment {
        return CalendarFragment()
    }

    override fun getCount(): Int {
        return 1
}

}