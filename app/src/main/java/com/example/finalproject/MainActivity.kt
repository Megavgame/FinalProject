package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var total: Int = 0
    lateinit var txtInput: TextView
    lateinit var txtTotalInput: TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtInput = findViewById(R.id.dicebox)
        txtTotalInput = findViewById(R.id.Total)
        val dice = resources.getStringArray(R.array.dice_array)
        val dicemax = resources.getIntArray(R.array.dicemax)
        var button: Button = findViewById(R.id.Roll)
        var button2: Button = findViewById(R.id.Clear)
        var image: ImageView = findViewById(R.id.imageView)
        var spinner: Spinner = findViewById(R.id.spinner)
        var totalText: TextView = findViewById(R.id.TotalText)
        var switch: Switch = findViewById(R.id.Add)




        if (spinner != null) {
            val adapter = ArrayAdapter(
                    this,
                    android.R.layout.simple_spinner_item, dice
            )
            spinner.adapter = adapter
            totalText.isVisible = false
            txtTotalInput.isVisible = false

            spinner.onItemSelectedListener = object :
                    AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity, getString(R.string.selected_item) + " " +
                                    "" + dice[position], Toast.LENGTH_SHORT).show()
                    switch.setOnClickListener {
                        if(switch.isChecked) {
                            totalText.isVisible = true
                            txtTotalInput.isVisible = true
                        }else{
                            totalText.isVisible = false
                            txtTotalInput.isVisible = false
                        }
                    }
                    button.setOnClickListener {
                        val random = Random.nextInt(1, dicemax[position] + 1)
                        if(switch.isChecked){
                            total = total + random
                            txtTotalInput.text = total.toString()

                        }
                        txtInput.text = random.toString()
                    }
                    button2.setOnClickListener{
                        txtTotalInput.text = ""
                        total = 0
                    }
                    if(position == 0){
                        image.setBackgroundResource(R.drawable.d4)
                    }else if(position == 1){
                        image.setBackgroundResource(R.drawable.d6)
                    }else if(position == 2){
                        image.setBackgroundResource(R.drawable.d8)
                    }else if(position == 3){
                        image.setBackgroundResource(R.drawable.d10)
                    }else if(position == 4){
                        image.setBackgroundResource(R.drawable.d12)
                    }else if(position == 5){
                        image.setBackgroundResource(R.drawable.d20)
                    }else if(position == 6){
                        image.setBackgroundResource(R.drawable.d20)
                    }

                }
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                }


            }
        }
    }
}

