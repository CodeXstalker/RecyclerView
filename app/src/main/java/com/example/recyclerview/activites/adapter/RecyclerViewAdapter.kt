package com.example.recyclerview.activites.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.activities.modalClass.ContactModal

class RecyclerViewAdapter(private val context: Context, private val list: List<ContactModal>) : RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var layoutInflater : LayoutInflater = LayoutInflater.from(context)
        var view : View = layoutInflater.inflate(R.layout.contact_layout,parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.textView1.text = list[position].name
        holder.textView2.text = list[position].bio
    }



    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1 : TextView = itemView.findViewById(R.id.TextView1)
        val textView2 : TextView = itemView.findViewById(R.id.TextView2)



    }
}