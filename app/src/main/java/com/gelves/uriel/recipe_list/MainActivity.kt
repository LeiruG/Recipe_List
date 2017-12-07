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
        users.add(UserModel.User("Curry", "Rustle up a spicy supper using fish, vegetables or meat and a blend of rich flavours."))
        users.add(UserModel.User("Baked Potato", "Perfect your spud technique then pile our filling ideas high. "))
        users.add(UserModel.User("Fish Pie", "Inspiration for a mash-topped seafood bake."))



        var adapter = CustomAdapter(users)

        rv.adapter = adapter
    }
}
