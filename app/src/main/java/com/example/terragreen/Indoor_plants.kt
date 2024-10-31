package com.example.terragreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Indoor_plants : Fragment() {
    lateinit var  recyclerView: RecyclerView
    lateinit var  data:ArrayList<DataIndoorClass>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val  view=inflater.inflate(R.layout.fragment_indoor_plants, container, false)
        recyclerView=view.findViewById(R.id.indoor_plant_recyclers)
        data=ArrayList()
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))
        data.add(DataIndoorClass(R.drawable.three,"The Banyan Tree ","28 to 40 ft","This is a very Big Tree "))

        recyclerView.adapter=AdapterIndoor(requireContext(),data)
        recyclerView.layoutManager=LinearLayoutManager(context,LinearLayoutManager.VERTICAL,false)




        return  view
    }

}