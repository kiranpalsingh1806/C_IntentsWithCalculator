package com.example.c_intentswithcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addButton.setOnClickListener {

            val firstNumber =firstNumEditText.text.toString()
            val secondNumber = secondNumEditText.text.toString()
            val operatorSelected = "Addition"

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("firstNumber", firstNumber)
                it.putExtra("secondNumber", secondNumber)
                it.putExtra("operator", operatorSelected);
                startActivity(it)
            }
        }
        subtractButton.setOnClickListener {

            val firstNumber =firstNumEditText.text.toString()
            val secondNumber = secondNumEditText.text.toString()
            val operatorSelected = "Subtraction"

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("firstNumber", firstNumber)
                it.putExtra("secondNumber", secondNumber)
                it.putExtra("operator", operatorSelected);
                startActivity(it)
            }
        }

        multiplyButton.setOnClickListener {

            val firstNumber =firstNumEditText.text.toString()
            val secondNumber = secondNumEditText.text.toString()
            val operatorSelected = "Multiplication"

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("firstNumber", firstNumber)
                it.putExtra("secondNumber", secondNumber)
                it.putExtra("operator", operatorSelected);
                startActivity(it)
            }
        }

        divideButton.setOnClickListener {

            val firstNumber =firstNumEditText.text.toString()
            val secondNumber = secondNumEditText.text.toString()
            val operatorSelected = "Division"

            Intent(this, SecondActivity::class.java).also {
                it.putExtra("firstNumber", firstNumber)
                it.putExtra("secondNumber", secondNumber)
                it.putExtra("operator", operatorSelected);
                startActivity(it)
            }
        }
    }
}