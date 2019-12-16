package com.learning.ecomerce

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_categories.view.*

class CategoriesAdapter (val context: Context, val itemList : ArrayList<Categories>) :
    RecyclerView.Adapter<CategoriesAdapter.ViewHolder>(){
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CategoriesAdapter.ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_categories, parent,false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: CategoriesAdapter.ViewHolder, position: Int) {
        holder.bindItems(itemList[position])
    }
    class ViewHolder(view : View) : RecyclerView.ViewHolder(view){
        fun bindItems(list : Categories){
            itemView.image.setImageResource(list.Image!!)
            itemView.text.text = list.title
        }
    }

}