package com.example.dinnerdecider

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Collections

class MainActivity : AppCompatActivity() {
    var foodList = mutableListOf("Hamburger", "Pizza", "Mexican", "American", "Chinese")
    lateinit var tvFoodName:TextView
    lateinit var btnDecide: Button
    lateinit var btnAdd: Button
    lateinit var etNewFood: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvFoodName = findViewById(R.id.tvFoodName)
        btnDecide = findViewById(R.id.btnDecide)
        btnAdd = findViewById(R.id.btnAdd)
        etNewFood = findViewById(R.id.etNewFood)

        btnDecide.setOnClickListener { handleShuffle() }
        btnAdd.setOnClickListener {
            foodList.add(etNewFood.text.toString())
            etNewFood.text.clear()
        }
    }

    fun handleShuffle() {
        foodList.shuffle()
        tvFoodName.text = foodList[0]
    }





}