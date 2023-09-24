package com.example.recyclerview.activites.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import com.example.recyclerview.activites.modalClass.ContactModal

class ContactListAdapter(private val context : Context, val contactList : List<ContactModal>) : RecyclerView.Adapter<ContactListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val layoutInflater : LayoutInflater = LayoutInflater.from(context)
        val view :View =  layoutInflater.inflate(R.layout.contact_layout,parent,false)
        return ViewHolder(view)

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        val contact = contactList[position]
        holder.textView1.text = contactList[position].name
        holder.textView2.text = contactList[position].bio
    }

    override fun getItemCount(): Int {
        Log.d("8825", "getItemCount: ${contactList.size} ")
        return contactList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView1 : TextView = itemView.findViewById(R.id.TextView1)
        val textView2 : TextView = itemView.findViewById(R.id.TextView2)
    }

}


