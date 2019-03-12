package com.melayer.recyclerviewdemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    var linearLayoutManager: RecyclerView.LayoutManager?=null
    val technologies = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby")

    val tech:MutableList<Int> ?=ArrayList()

    val techImages = arrayOf<Int>(
            R.drawable.ic_pikachu,
            R.drawable.ic_pikachu,
            R.drawable.ic_pikachu,
            R.drawable.ic_pikachu,
            R.drawable.ic_pikachu,
            R.drawable.ic_pikachu)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linearLayoutManager = LinearLayoutManager(applicationContext)
        recyclerTechnologies.layoutManager=linearLayoutManager
        val techAdapter=TechnologyAdapter(applicationContext,technologies,techImages)
        recyclerTechnologies.adapter=techAdapter

    }
}
