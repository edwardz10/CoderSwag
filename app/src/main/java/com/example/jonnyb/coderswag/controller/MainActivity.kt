package com.example.coderswag.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.jonnyb.coderswag.R
import com.example.jonnyb.coderswag.adapters.CategoryAdapter
import com.example.jonnyb.coderswag.model.Category
import com.example.jonnyb.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter (this, DataService.categories)
        categoryListView.adapter = adapter
    }
}