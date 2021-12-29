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

        val button1: Button = findViewById(R.id.button1)
        val button2: Button = findViewById(R.id.button2)
        val textView1: TextView = findViewById(R.id.textView1)
        val textView2: TextView = findViewById(R.id.textView2)

        val myExample = ExampleDataClass("29.12.2021", 15)

        val myObject = ExampleObjectSingleton

        button1.setOnClickListener {
            Toast.makeText(this, "''PUSH ME'' button 1 is pressed", Toast.LENGTH_SHORT).show()
            textView1.text = "Data class date: " + myExample.myDate
            textView2.text = "Data class count: " + myExample.myCount.toString()
        }

        button2.setOnClickListener {
            Toast.makeText(this, "''PUSH ME'' button 2 is pressed", Toast.LENGTH_SHORT).show()
            myObject.classCopy(myExample)
            textView1.text = "Object class date: " + myObject.getMyDate()
            textView2.text = "Object class count: " + myObject.getMyCount()
        }

    }
}