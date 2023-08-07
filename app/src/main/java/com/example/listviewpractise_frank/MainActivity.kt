package com.example.listviewpractise_frank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractise_frank.datas.Student

class MainActivity : AppCompatActivity() {

    val mStudentList = ArrayList<Student> ()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("코딩디처지니", 1988))
        mStudentList.add(Student("남궁민", 2000))
        mStudentList.add(Student("김용수", 1900))
        mStudentList.add(Student("원빈초이", 1800))
        mStudentList.add(Student("성빈파크", 1850))
        mStudentList.add(Student("형샘킴", 1899))
        mStudentList.add(Student("현성김", 1901))
        mStudentList.add(Student("성민쩐", 1956))




    }
}