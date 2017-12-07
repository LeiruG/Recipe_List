package com.gelves.uriel.recipe_list

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by Lucem on 07/12/2017.
 */

class CustomAdapter(val userList: ArrayList<UserModel.User>): RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        holder?.txtFood?.text = userList[position].food
        holder?.txtDesc?.text = userList[position].desc
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(v);
    }

    override fun getItemCount(): Int {
        return userList.size
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val txtFood = itemView.findViewById<TextView>(R.id.txtFood)
        val txtDesc = itemView.findViewById<TextView>(R.id.txtDesc)
    }

}