package com.melayer.recyclerviewdemo

import android.content.Context
import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.view.LayoutInflater
import android.widget.Toast


class TechnologyAdapter(private val context: Context,
                        private val listOfTech:Array<String>,
                        private val listOfImg:Array<Int>) :
        RecyclerView.Adapter<TechnologyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): TechnologyAdapter.ViewHolder {
        val view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.single_recycler_item, parent, false)
        return TechnologyAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listOfTech.size
    }

    override fun onBindViewHolder(holder: TechnologyAdapter.ViewHolder, position: Int) {
        holder.technologyName().text=listOfTech[position]
        holder.technologyImage().setImageResource(listOfImg[position])
        holder.technologyCard().setOnClickListener {
            Toast.makeText(context,""+position,Toast.LENGTH_SHORT).show()
        }
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)
    {

        fun technologyName():TextView
        {
            return itemView.findViewById(R.id.txtTech)
        }
        fun technologyImage():ImageView
        {
            return itemView.findViewById(R.id.imgTech)
        }
        fun technologyCard():CardView
        {
            return itemView.findViewById(R.id.cardTech)
        }


    }
}