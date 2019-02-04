package com.pingpong.dynamicfragmentcalendar.CalendarView

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.GridLayoutManager
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.pingpong.dynamicfragmentcalendar.Adapter.DateAdapter
import com.pingpong.dynamicfragmentcalendar.R
import kotlinx.android.synthetic.main.fragment_calendar.*
import java.util.*

class CalendarFragment() : Fragment(){
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_calendar,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        val calendar = Calendar.getInstance()
        val YEAR = arguments!!.getInt("YEAR")
        val MONTH = arguments!!.getInt("MONTH")
        Log.d("test",YEAR.toString())

        Setting(YEAR,MONTH);
        super.onActivityCreated(savedInstanceState)
    }

    private fun Setting(year: Int, month: Int) {
        val calendar = Calendar.getInstance()
        calendar.set(year, month, 1)

        val DateList = ArrayList<Int>()

        for (i in 1..calendar.get(Calendar.DAY_OF_WEEK) - 1) {
            DateList.add(0)
        }

        for (i in 1..calendar.getActualMaximum(java.util.Calendar.DATE)) {
            DateList.add(i)
        }

        recyclerview.layoutManager = GridLayoutManager(context,7)
        recyclerview.adapter = DateAdapter(DateList)
    }
}