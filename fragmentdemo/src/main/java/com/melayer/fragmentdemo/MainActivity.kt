package com.melayer.fragmentdemo

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.app.FragmentTransaction

class MainActivity : AppCompatActivity() {

    @SuppressLint("CommitTransaction")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragmentTransaction:FragmentTransaction = supportFragmentManager.beginTransaction()
        fragmentTransaction.add(R.id.frameLayout,BlankFragment())
        fragmentTransaction.commit()

    }
}
