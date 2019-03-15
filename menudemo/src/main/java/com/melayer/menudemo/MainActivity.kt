package com.melayer.menudemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {

        val menuInflater:MenuInflater= menuInflater
        menuInflater.inflate(R.menu.menu,menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {

        when(item?.itemId)
        {
            R.id.setting ->
            {
                Toast.makeText(this,"setting",Toast.LENGTH_SHORT).show()
            }
            R.id.user ->
            {
                Toast.makeText(this,"profile",Toast.LENGTH_SHORT).show()
            }
            R.id.logout ->
            {
                Toast.makeText(this,"logout",Toast.LENGTH_SHORT).show()
                finish()
            }


        }

        return super.onOptionsItemSelected(item)
    }
}
