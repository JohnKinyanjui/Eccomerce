package com.learning.ecomerce

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    val itemList = ArrayList<Categories>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        itemList.add(Categories(R.drawable.women, "Women"))
        itemList.add(Categories(R.drawable.men, "Men"))
        itemList.add(Categories(R.drawable.sports, "Spors"))
        itemList.add(Categories(R.drawable.men, "men"))

        val toolbar = findViewById<View>(R.id.toolbar) as Toolbar
        toolbar.inflateMenu(R.menu.nav)

        val recyclerView = findViewById<View>(R.id.recycler) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
        val adapter = CategoriesAdapter(this,itemList)
        recyclerView.adapter = adapter

    }
}
