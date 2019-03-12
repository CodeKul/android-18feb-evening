package com.melayer.listinkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val technologies = arrayOf<String>("C","C++","Java",".Net","Kotlin","Ruby")

    val techImages = arrayOf<Int>(
            R.drawable.java,
            R.drawable.java,
            R.drawable.java,
            R.drawable.java,
            R.drawable.java,
            R.drawable.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showList()
    }

    private fun showList() {

        val adapter_tech = TechnologyAdapter(this, technologies, techImages)
        listOfTechnologies.adapter = adapter_tech

    }

}
