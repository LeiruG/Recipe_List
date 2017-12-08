package com.gelves.uriel.recipe_list

import android.content.Context
import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
/**
 * Created by Lucem on 07/12/2017.
 */
class CustomAdapter(val userList: ArrayList<UserModel.User>, context: Context) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    var ucontext = context

    override fun onBindViewHolder(holder: ViewHolder?, position: Int) {
        val user : UserModel.User = userList[position]
        holder?.textFood?.text = user.food
        holder?.textDesc?.text = user.desc
        holder!!.textFood.text = "Name: "+ user.food
        holder.textDesc.text = "Description: "+user.desc


        holder.onItemClick(object :ItemClick{
            override fun onItemClick(view: View, pos: Int) {
                if (pos == 0 ) {
                    val intent = Intent(ucontext, Foodq::class.java)
                    ucontext.startActivity(intent);
                }

                if (pos == 1 ) {
                    val intent = Intent(ucontext, Foodw::class.java)
                    ucontext.startActivity(intent);
                }

                if (pos == 2 ) {
                    val intent = Intent(ucontext, Foode::class.java)
                    ucontext.startActivity(intent);
                }

            }    })

    }


    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(parent?.context).inflate(R.layout.item_layout, parent,false)
        return ViewHolder(v)
    }


    override fun getItemCount(): Int {
        return userList.size
    }


    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView), View.OnClickListener {
        override fun onClick(v: View?) {
            this.uItemClick!!.onItemClick(v!!, adapterPosition)
        }

        val textFood: TextView
        val textDesc: TextView
        val linearLayout: LinearLayout
        var uItemClick: ItemClick?=null

        init {
            textFood = itemView.findViewById<TextView>(R.id.txtFood)
            textDesc = itemView.findViewById<TextView>(R.id.txtDesc)
            linearLayout = itemView.findViewById<LinearLayout>(R.id.L_Layout)
            itemView.setOnClickListener(this)
        }

        fun onItemClick(itemClickListener: ItemClick){
            this.uItemClick = itemClickListener
        }
    }


}