package com.example.finalproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.core.view.isVisible
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var total: Int = 0
    var subtotal: Int = 0
    var pos: Int = 0
    lateinit var txtInput: TextView
    lateinit var txtInput2: TextView
    lateinit var txtInput3: TextView
    lateinit var txtInput4: TextView
    lateinit var txtInput5: TextView
    lateinit var txtInput6: TextView
    lateinit var txtInput7: TextView
    lateinit var txtInput8: TextView
    lateinit var txtInput9: TextView
    lateinit var txtInput10: TextView
    lateinit var txtTotalInput: TextView
    lateinit var subTotalView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        //This large line of text will initalize all of the variables used for the screen
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txtInput = findViewById(R.id.dicebox)
        txtInput2 = findViewById(R.id.dicebox1)
        txtInput3 = findViewById(R.id.dicebox2)
        txtInput4 = findViewById(R.id.dicebox3)
        txtInput5 = findViewById(R.id.dicebox4)
        txtInput6 = findViewById(R.id.dicebox5)
        txtInput7 = findViewById(R.id.dicebox6)
        txtInput8 = findViewById(R.id.dicebox7)
        txtInput9 = findViewById(R.id.dicebox8)
        txtInput10 = findViewById(R.id.dicebox9)
        txtTotalInput = findViewById(R.id.Total)
        subTotalView = findViewById(R.id.subtotalview)
        val dice = resources.getStringArray(R.array.dice_array)
        val dicemax = resources.getIntArray(R.array.dicemax)
        val amofdice = resources.getStringArray(R.array.amofdice)
        var button: Button = findViewById(R.id.Roll)
        var button2: Button = findViewById(R.id.Clear)
        var image: ImageView = findViewById(R.id.imageView)
        var image2: ImageView = findViewById(R.id.imageView2)
        var image3: ImageView = findViewById(R.id.imageView3)
        var image4: ImageView = findViewById(R.id.imageView4)
        var image5: ImageView = findViewById(R.id.imageView5)
        var image6: ImageView = findViewById(R.id.imageView6)
        var image7: ImageView = findViewById(R.id.imageView7)
        var image8: ImageView = findViewById(R.id.imageView8)
        var image9: ImageView = findViewById(R.id.imageView9)
        var image10: ImageView = findViewById(R.id.imageView10)
        var spinner: Spinner = findViewById(R.id.spinner)
        var spinner2: Spinner = findViewById(R.id.spinner2)
        var totalText: TextView = findViewById(R.id.TotalText)
        var subTotalText: TextView = findViewById(R.id.subtotaltext)
        var switch: Switch = findViewById(R.id.Add)
        totalText.isVisible = false
        txtTotalInput.isVisible = false
        subTotalText.isVisible = false
        subTotalView.isVisible = false
        //This is the spinner to create the numbers that populate it
        if (spinner2 != null) {
            val adapter2 = ArrayAdapter(this, android.R.layout.simple_spinner_item, amofdice)
            spinner2.adapter = adapter2
        }
        spinner2.onItemSelectedListener = object :
                AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>,
                                        view: View, position: Int, id: Long) {
                Toast.makeText(this@MainActivity, getString(R.string.selected_item) + " " +
                        "" + amofdice[position], Toast.LENGTH_SHORT).show()
                //this will hide or show the images or text depending on the number shown
                if(position == 0){
                    txtInput.isVisible = true
                    image.isVisible = true
                    image2.isVisible = false
                    image3.isVisible = false
                    txtInput2.isVisible = false
                    txtInput3.isVisible = false
                    image4.isVisible = false
                    image5.isVisible = false
                    image6.isVisible = false
                    txtInput4.isVisible = false
                    txtInput5.isVisible = false
                    txtInput6.isVisible = false
                    image7.isVisible = false
                    image8.isVisible = false
                    image9.isVisible = false
                    image10.isVisible = false
                    txtInput7.isVisible = false
                    txtInput8.isVisible = false
                    txtInput9.isVisible = false
                    txtInput10.isVisible = false
                    pos = 0
                }
                else if(position == 1){
                    txtInput.isVisible = false
                    image.isVisible = false
                    image2.isVisible = true
                    image3.isVisible = true
                    txtInput2.isVisible = true
                    txtInput3.isVisible = true
                    image4.isVisible = false
                    image5.isVisible = false
                    image6.isVisible = false
                    txtInput4.isVisible = false
                    txtInput5.isVisible = false
                    txtInput6.isVisible = false
                    image7.isVisible = false
                    image8.isVisible = false
                    image9.isVisible = false
                    image10.isVisible = false
                    txtInput7.isVisible = false
                    txtInput8.isVisible = false
                    txtInput9.isVisible = false
                    txtInput10.isVisible = false
                    pos = 1
                }
                else if(position == 2){
                    txtInput.isVisible = false
                    image.isVisible = false
                    image2.isVisible = false
                    image3.isVisible = false
                    txtInput2.isVisible = false
                    txtInput3.isVisible = false
                    image4.isVisible = true
                    image5.isVisible = true
                    image6.isVisible = true
                    txtInput4.isVisible = true
                    txtInput5.isVisible = true
                    txtInput6.isVisible = true
                    image7.isVisible = false
                    image8.isVisible = false
                    image9.isVisible = false
                    image10.isVisible = false
                    txtInput7.isVisible = false
                    txtInput8.isVisible = false
                    txtInput9.isVisible = false
                    txtInput10.isVisible = false
                    pos = 2
                }
                else if(position == 3){
                    txtInput.isVisible = false
                    image.isVisible = false
                    image2.isVisible = false
                    image3.isVisible = false
                    txtInput2.isVisible = false
                    txtInput3.isVisible = false
                    image4.isVisible = false
                    image5.isVisible = false
                    image6.isVisible = false
                    txtInput4.isVisible = false
                    txtInput5.isVisible = false
                    txtInput6.isVisible = false
                    image7.isVisible = true
                    image8.isVisible = true
                    image9.isVisible = true
                    image10.isVisible = true
                    txtInput7.isVisible = true
                    txtInput8.isVisible = true
                    txtInput9.isVisible = true
                    txtInput10.isVisible = true
                    pos = 3
                }
            }
            //purposely does nothing
            override fun onNothingSelected(parent: AdapterView<*>) {
                // write code to perform some action
            }
        }


        //Second spinner used for selecting the dice and show you what you selected
        if (spinner != null)
        {
            val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, dice)
            spinner.adapter = adapter
        }

            spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(parent: AdapterView<*>,
                                            view: View, position: Int, id: Long) {
                    Toast.makeText(this@MainActivity, getString(R.string.selected_item) + " " +
                            "" + dice[position], Toast.LENGTH_SHORT).show()
                    //Switch event handling, will show the subtotal and total when on
                    switch.setOnClickListener {
                        if (switch.isChecked) {
                            totalText.isVisible = true
                            txtTotalInput.isVisible = true
                            subTotalText.isVisible = true
                            subTotalView.isVisible = true

                        } else {
                            totalText.isVisible = false
                            txtTotalInput.isVisible = false
                            subTotalText.isVisible = false
                            subTotalView.isVisible = false

                        }
                    }
                    //This will roll the dice and add to the total if the switch is enabled also dependent on the amount of dice
                    button.setOnClickListener {
                        if (pos == 0) {
                            val random = Random.nextInt(1, dicemax[position] + 1)
                            if (switch.isChecked) {
                                total = total + random
                                txtTotalInput.text = total.toString()
                            }
                            txtInput.text = random.toString()
                        }
                        else if(pos == 1){
                            val random = Random.nextInt(1, dicemax[position] + 1)
                            val random2 = Random.nextInt(1, dicemax[position] + 1)
                            if (switch.isChecked) {
                                total = total + random + random2
                                subtotal = random + random2
                                txtTotalInput.text = total.toString()
                                subTotalView.text = subtotal.toString()
                            }
                            txtInput2.text = random.toString()
                            txtInput3.text = random2.toString()
                        }
                        else if(pos == 2){
                            val random = Random.nextInt(1, dicemax[position] + 1)
                            val random2 = Random.nextInt(1, dicemax[position] + 1)
                            val random3 = Random.nextInt(1, dicemax[position] + 1)
                            if (switch.isChecked) {
                                total = total + random + random2 + random3
                                subtotal = random + random2 + random3
                                txtTotalInput.text = total.toString()
                                subTotalView.text = subtotal.toString()
                            }
                            txtInput4.text = random.toString()
                            txtInput5.text = random2.toString()
                            txtInput6.text = random3.toString()
                        }
                        else if (pos == 3){
                            val random = Random.nextInt(1, dicemax[position] + 1)
                            val random2 = Random.nextInt(1, dicemax[position] + 1)
                            val random3 = Random.nextInt(1, dicemax[position] + 1)
                            val random4 = Random.nextInt(1, dicemax[position] + 1)
                            if (switch.isChecked) {
                                total = total + random + random2 + random3 + random4
                                subtotal = random + random2 + random3 + random4
                                txtTotalInput.text = total.toString()
                                subTotalView.text = subtotal.toString()
                            }
                            txtInput7.text = random.toString()
                            txtInput8.text = random2.toString()
                            txtInput9.text = random3.toString()
                            txtInput10.text = random4.toString()
                        }
                    }
                    //This will clear the text
                    button2.setOnClickListener {
                        txtTotalInput.text = ""
                        total = 0
                    }
                    //This will switch the pictures background depending on dice amount and choice
                    if (position == 0) {
                        image.setBackgroundResource(R.drawable.d4)
                        image2.setBackgroundResource(R.drawable.d4)
                        image3.setBackgroundResource(R.drawable.d4)
                        image4.setBackgroundResource(R.drawable.d4)
                        image5.setBackgroundResource(R.drawable.d4)
                        image6.setBackgroundResource(R.drawable.d4)
                        image7.setBackgroundResource(R.drawable.d4)
                        image8.setBackgroundResource(R.drawable.d4)
                        image9.setBackgroundResource(R.drawable.d4)
                        image10.setBackgroundResource(R.drawable.d4)
                    } else if (position == 1) {
                        image.setBackgroundResource(R.drawable.d6)
                        image2.setBackgroundResource(R.drawable.d6)
                        image3.setBackgroundResource(R.drawable.d6)
                        image4.setBackgroundResource(R.drawable.d6)
                        image5.setBackgroundResource(R.drawable.d6)
                        image6.setBackgroundResource(R.drawable.d6)
                        image7.setBackgroundResource(R.drawable.d6)
                        image8.setBackgroundResource(R.drawable.d6)
                        image9.setBackgroundResource(R.drawable.d6)
                        image10.setBackgroundResource(R.drawable.d6)
                    } else if (position == 2) {
                        image.setBackgroundResource(R.drawable.d8)
                        image2.setBackgroundResource(R.drawable.d8)
                        image3.setBackgroundResource(R.drawable.d8)
                        image4.setBackgroundResource(R.drawable.d8)
                        image5.setBackgroundResource(R.drawable.d8)
                        image6.setBackgroundResource(R.drawable.d8)
                        image7.setBackgroundResource(R.drawable.d8)
                        image8.setBackgroundResource(R.drawable.d8)
                        image9.setBackgroundResource(R.drawable.d8)
                        image10.setBackgroundResource(R.drawable.d8)
                    } else if (position == 3) {
                        image.setBackgroundResource(R.drawable.d10)
                        image2.setBackgroundResource(R.drawable.d10)
                        image3.setBackgroundResource(R.drawable.d10)
                        image4.setBackgroundResource(R.drawable.d10)
                        image5.setBackgroundResource(R.drawable.d10)
                        image6.setBackgroundResource(R.drawable.d10)
                        image7.setBackgroundResource(R.drawable.d10)
                        image8.setBackgroundResource(R.drawable.d10)
                        image9.setBackgroundResource(R.drawable.d10)
                        image10.setBackgroundResource(R.drawable.d10)
                    } else if (position == 4) {
                        image.setBackgroundResource(R.drawable.d12)
                        image2.setBackgroundResource(R.drawable.d12)
                        image3.setBackgroundResource(R.drawable.d12)
                        image4.setBackgroundResource(R.drawable.d12)
                        image5.setBackgroundResource(R.drawable.d12)
                        image6.setBackgroundResource(R.drawable.d12)
                        image7.setBackgroundResource(R.drawable.d12)
                        image8.setBackgroundResource(R.drawable.d12)
                        image9.setBackgroundResource(R.drawable.d12)
                        image10.setBackgroundResource(R.drawable.d12)
                    } else if (position == 5) {
                        image.setBackgroundResource(R.drawable.d20)
                        image2.setBackgroundResource(R.drawable.d20)
                        image3.setBackgroundResource(R.drawable.d20)
                        image4.setBackgroundResource(R.drawable.d20)
                        image5.setBackgroundResource(R.drawable.d20)
                        image6.setBackgroundResource(R.drawable.d20)
                        image7.setBackgroundResource(R.drawable.d20)
                        image8.setBackgroundResource(R.drawable.d20)
                        image9.setBackgroundResource(R.drawable.d20)
                        image10.setBackgroundResource(R.drawable.d20)
                    } else if (position == 6) {
                        image.setBackgroundResource(R.drawable.d100)
                        image2.setBackgroundResource(R.drawable.d100)
                        image3.setBackgroundResource(R.drawable.d100)
                        image4.setBackgroundResource(R.drawable.d100)
                        image5.setBackgroundResource(R.drawable.d100)
                        image6.setBackgroundResource(R.drawable.d100)
                        image7.setBackgroundResource(R.drawable.d100)
                        image8.setBackgroundResource(R.drawable.d100)
                        image9.setBackgroundResource(R.drawable.d100)
                        image10.setBackgroundResource(R.drawable.d100)
                    }
                }
                //purposely does nothing
                override fun onNothingSelected(parent: AdapterView<*>) {
                    // write code to perform some action
                    //does nothing
                }


            }
        }
    }





