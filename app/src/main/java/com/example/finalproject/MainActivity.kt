package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    lateinit var txtInput: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtInput = findViewById(R.id.dicebox)
        val dice = resources.getStringArray(R.array.dice_array)
        val dicemax = resources.getIntArray(R.array.dicemax)
        var button: Button = findViewById(R.id.button)

        var spinner: Spinner = findViewById(R.id.spinner)

        if (spinner != null) {
            val adapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_spinner_item, dice
            )
            spinner.adapter = adapter

            spinner.onItemSelectedListener = object :
                    AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity,
                            getString(R.string.selected_item) + " " +
                                    "" + dice[position], Toast.LENGTH_SHORT).show()
                    button.setOnClickListener {
                      val random = Random.nextInt(1, dicemax[position] + 1)
                        txtInput.text = random.toString()
                    }





                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }


            }
        }
    }
}

