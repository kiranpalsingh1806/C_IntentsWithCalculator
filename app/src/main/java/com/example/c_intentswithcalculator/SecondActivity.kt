package com.example.c_intentswithcalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val firstNum = intent.getStringExtra("firstNumber")
        val secondNum = intent.getStringExtra("secondNumber")
        val operator = intent.getStringExtra("operator")

        val num1 = Integer.parseInt(firstNum);
        val num2 = Integer.parseInt(secondNum);
        val num3:Int;

        if(operator == "Addition") {
            num3 = num1 + num2;
        } else if(operator == "Subtraction") {
            num3 = num1 - num2;
        } else if(operator == "Multiplication") {
            num3 = num1 * num2;
        } else {
            num3 = num1 / num2;
        }

        val answer = "$num3"
        firstNumTextView.text = "First Number: $num1"
        secondNumTextView.text = "Second Number: $num2"
        operatorTextView.text = "Operator: $operator"
        calculateTextView.text = answer

        backButton.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}