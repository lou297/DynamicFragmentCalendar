package com.pingpong.dynamicfragmentcalendar.Adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter
import android.util.Log
import com.pingpong.dynamicfragmentcalendar.CalendarView.CalendarFragment

class ViewPagerAdapter(FM : FragmentManager) : FragmentPagerAdapter(FM) {
    companion object {
        var CalendarFragmentList : ArrayList<Fragment> = ArrayList()
    }
    override fun getItem(p0: Int): Fragment {
        Log.d("test","???")
        return CalendarFragmentList.get(p0)
    }

    override fun getCount(): Int {
        return CalendarFragmentList.size
    }

}