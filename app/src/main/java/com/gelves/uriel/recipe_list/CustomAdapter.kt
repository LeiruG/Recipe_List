package com.gelves.uriel.recipe_list

/**
 * Created by Lucem on 07/12/2017.
 */
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class CustomAdapter(val recipeList: ArrayList<Food>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtFood?.text = recipeList[position].q
        holder?.txtDesc?.text = recipeList[position].w

    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return recipeList.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txtFood = itemView.findViewById<TextView>(R.id.txtFood)
        val txtDesc = itemView.findViewById<TextView>(R.id.txtDesc)
    }
}