package com.gelves.uriel.recipe_list

import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

/**
 * Created by Lucem on 07/12/2017.
 */
class Recipe  : AppCompatActivity(){
    companion object {
        val KEY_RECIPE = "11"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.recipe_layout)



        val recipe: Food = intent.getParcelableExtra(KEY_RECIPE)

        val txtIngred = findViewById<TextView>(R.id.txtr) as TextView
        val txtProced = findViewById<TextView>(R.id.txtt) as TextView
        val imgPic = findViewById<ImageView>(R.id.imageView) as ImageView
        txtIngred.append(recipe.r)
        txtProced.append(recipe.t)
        val drawable: Drawable = resources.getDrawable(recipe.e)
        imgPic.setImageDrawable(drawable)

        val toolbar = findViewById<Toolbar>(R.id.toolbar) as Toolbar
        toolbar.setTitleTextColor(Color.GRAY)
        toolbar.setBackgroundColor(Color.BLACK)
        toolbar.setSubtitleTextColor(Color.GRAY)
        toolbar.setSubtitle(recipe.q)

        setSupportActionBar(toolbar)
        if (getSupportActionBar() != null){
            getSupportActionBar()?.setDisplayHomeAsUpEnabled(true)
            getSupportActionBar()?.setDisplayShowHomeEnabled(true)
        }

    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        if (item.itemId == android.R.id.home) {
            finish()
        }

        return super.onOptionsItemSelected(item)
    }
}