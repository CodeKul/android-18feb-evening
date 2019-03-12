package com.melayer.simplevalueresorces

import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtFullName.setText(resources.getString(R.string.name))
        edtFullName.textSize = resources.getDimension(R.dimen.textSize)
        edtFullName.setTextColor(ContextCompat.getColor(this@MainActivity, R.color.colorAccent))
    }

    }
