package com.example.listviewpractise_frank.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.example.listviewpractise_frank.datas.Student

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<Student>) : ArrayAdapter<Student>(mContext, resId, mList) {
}