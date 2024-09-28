package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.delay
import java.util.Random


class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView
    private lateinit var rollButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.roll_button)
        diceImage = findViewById(R.id.diceRollerImage)
        rollButton.setOnClickListener{
            Toast.makeText(this, "Rolling....",Toast.LENGTH_SHORT).show()
            rollDice()
        }

    }

    private fun rollDice() {
            val randomValue = Random().nextInt(6) + 1
            val drawableRecourse = when (randomValue) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                else -> R.drawable.dice_6
            }
            diceImage.setImageResource(drawableRecourse)
    }
}