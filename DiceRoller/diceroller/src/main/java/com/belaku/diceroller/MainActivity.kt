package com.belaku.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.view.animation.RotateAnimation
import kotlinx.android.synthetic.main.content_main.view.*


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)




        fab_roll_dice.setOnClickListener { view ->
            val randomNumber = (1..6).shuffled().first()



            imgv_dice.startAnimation(AnimationUtils.loadAnimation(this, R.anim.rotate))

            if (randomNumber == 1)
                imgv_dice.setImageResource(R.drawable.dice_1)
            else if (randomNumber == 2)
                imgv_dice.setImageResource(R.drawable.dice_2)
            else if (randomNumber == 3)
                imgv_dice.setImageResource(R.drawable.dice_3)
            else if (randomNumber == 4)
                imgv_dice.setImageResource(R.drawable.dice_4)
            else if (randomNumber == 5)
                imgv_dice.setImageResource(R.drawable.dice_5)
            else if (randomNumber == 6)
                imgv_dice.setImageResource(R.drawable.dice_6)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
