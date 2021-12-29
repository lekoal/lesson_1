package com.example.lesson_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)

        val myExample = ExampleDataClass("29.12.2021", 15)

        button.setOnClickListener {
            Toast.makeText(this, "''PUSH ME'' button is pressed", Toast.LENGTH_SHORT).show()
            textView1.text = myExample.myDate
            textView2.text = myExample.myCount.toString()
        }
    }
}