package com.example.terragreen

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterIndoor(val context: Context,  private val data: ArrayList<DataIndoorClass> , private val listener: AdapterView.OnItemClickListener) :
    RecyclerView.Adapter<AdapterIndoor.InnerClass>() {
    interface  OnItemClickListener {
        fun onItemClick(item:DataIndoorClass)
    }
    inner class InnerClass(view: View) : RecyclerView.ViewHolder(view) {

        val txt_name: TextView =view.findViewById(R.id.ind_plant_name)
        val txt_details:TextView =view.findViewById(R.id.ind_plant_details)
        val txt_size:TextView=view.findViewById(R.id.ind_plant_height)
        val image:ImageView=view.findViewById(R.id.ind_image)


    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerClass {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.indoor_plant_items, parent, false)

        return InnerClass(view)
    }

    override fun onBindViewHolder(holder: InnerClass, position: Int) {
        holder.txt_name.text = data[position].plant_name
        holder.txt_details.text=data[position].plant_details
        holder.txt_size.text=data[position].plant_size
        holder.image.setImageResource(data[position].image)

        holder.itemView.setOnClickListener {


        }

    }

    override fun getItemCount(): Int {
        return data.size
    }



}

