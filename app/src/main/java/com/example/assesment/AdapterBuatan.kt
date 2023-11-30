package com.example.assesment

import com.example.assesment.R
import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class AdapterBuatan (private val context: Activity,
                     private val arrayList: ArrayList<datauser>) : ArrayAdapter<datauser>(context,
    R.layout.instagram_layout,arrayList){

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val inflater:LayoutInflater = LayoutInflater.from(context)
        val view : View = inflater.inflate(R.layout.instagram_layout, null)
        val imageView : ImageView = view.findViewById(R.id.contact_image)
        val username : TextView = view.findViewById(R.id.contact_name)
        val tempat : TextView = view.findViewById(R.id.place_name)

        imageView.setImageResource(arrayList[position].imgid)
        username.text = arrayList[position].name
        tempat.text = arrayList[position].tempat
        return view
    }

}
