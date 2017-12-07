package com.gelves.uriel.recipe_list

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rv = findViewById<RecyclerView>(R.id.rView)

        rv.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)
        val users = ArrayList<UserModel.User>()
        users.add(UserModel.User("Paul", "Mr"))
        users.add(UserModel.User("Jane", "Miss"))
        users.add(UserModel.User("John", "Dr"))



        var adapter = CustomAdapter(users)

        rv.adapter = adapter
    }
}
