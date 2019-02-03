package com.pingpong.dynamicfragmentcalendar.Adapter

import com.pingpong.dynamicfragmentcalendar.DataClass.Date
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.View.INVISIBLE
import android.view.View.VISIBLE
import android.view.ViewGroup
import com.pingpong.dynamicfragmentcalendar.R
import kotlinx.android.synthetic.main.date_view.view.*

class DateAdapter(val DateList : ArrayList<Int>) : RecyclerView.Adapter<DateViewHolder>(){
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): DateViewHolder {
        return DateViewHolder(LayoutInflater.from(p0.context).inflate(R.layout.date_view,p0,false))
    }

    override fun getItemCount(): Int {
        return DateList.size
    }

    override fun onBindViewHolder(holder: DateViewHolder, position: Int) {
        val date = DateList.get(position)
        if(date ==0){
            holder.Date.visibility = INVISIBLE
        }
        else{
            holder.Date.visibility = VISIBLE
            holder.Date.text = date.toString()
        }
    }

}

class DateViewHolder(date_view : View) : RecyclerView.ViewHolder(date_view){
    val Date = date_view.DateText
}