package com.example.storyboard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage : ImageView
    lateinit var diceImage1 : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        diceImage = findViewById(R.id.dice_image)
        diceImage1 = findViewById(R.id.dice_image2)
        val rollButton: Button = findViewById(R.id.button_first2)
        val rollButton1: Button = findViewById(R.id.button_first3)
        rollButton.setOnClickListener { rollDice()}
        rollButton1.setOnClickListener { resetButton() }
        }

    private fun rollDice(){
        diceImage.setImageResource(getDiceImage())
        diceImage1.setImageResource(getDiceImage())
        Toast.makeText(this, "You rolled the dice", Toast.LENGTH_SHORT).show()
    }

    private fun getDiceImage() : Int {
        val randomInt = (1..6). random()
        return when (randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
    }
    private fun resetButton(){
        diceImage.setImageResource(R.drawable.dice_1)
        diceImage1.setImageResource(R.drawable.dice_1)
        Toast.makeText(this, "You reset the dice", Toast.LENGTH_SHORT).show()
    }
    }