package com.example.haya_task02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val list = listOf("Red","Blue","Yellow","Mohammad","Majed","Haya","Red","Blue","Yellow","Mohammad","Majed","Haya","Red","Blue","Yellow","Mohammad","Majed","Haya","Red","Blue","Yellow","Mohammad","Majed","Haya")

        val myRV = findViewById<RecyclerView>(R.id.rvMain)
        myRV.adapter = ListViewAdapter(list)
        myRV.layoutManager = LinearLayoutManager(this)
    }
}