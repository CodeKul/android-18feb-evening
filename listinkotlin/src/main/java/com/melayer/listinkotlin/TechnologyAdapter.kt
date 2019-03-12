package com.melayer.listinkotlin

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class TechnologyAdapter(private val context: Activity,
                        private val listOfTech:Array<String>,
                        private val listOfImg:Array<Int>
                        ): ArrayAdapter<String>(context,R.layout.single_technology,listOfTech) {

    @SuppressLint("ViewHolder")
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater=context.layoutInflater
        val view=inflater.inflate(R.layout.single_technology,null,true)
        val txtTech=view.findViewById<TextView>(R.id.textViewTech)
        val imgTech=view.findViewById<ImageView>(R.id.imageViewTech)
        txtTech.text=listOfTech[position]
        imgTech.setImageResource(listOfImg[position])
        return view
    }
}