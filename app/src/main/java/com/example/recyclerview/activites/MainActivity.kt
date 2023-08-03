package com.example.recyclerview.activites

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.ModalClass
import com.example.recyclerview.R
import com.example.recyclerview.adapter.MyAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var contactList : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        contactList = findViewById(R.id.ContactList)

        contactList.layoutManager = LinearLayoutManager(this)

        val modalClassObjects = mutableListOf<ModalClass>()
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))
        modalClassObjects.add(ModalClass("hello", "how are yout"))

        contactList.adapter = MyAdapter(modalClassObjects)
    }
}