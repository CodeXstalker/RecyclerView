package com.example.recyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ModalClass
import com.example.recyclerview.R

class MyAdapter(val contact: List<ModalClass>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    //Create a view-holder, which store view
    //layoutInflater turn the xml file in kotlin objects

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.contact_layout, parent, false)
        return MyViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView1.text = contact[position].title
        holder.textView2.text = contact[position].description

    }

    override fun getItemCount(): Int {
        return contact.size
    }

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var textView1 = itemView.findViewById<TextView>(R.id.TextView1)
        var textView2 = itemView.findViewById<TextView>(R.id.TextView2)

    }
}


