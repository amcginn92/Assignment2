package com.example.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val textName = findViewById<EditText>(R.id.textName)
        val textEmail = findViewById<EditText>(R.id.textEmail)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val textPw = findViewById<EditText>(R.id.textPw)
        val textPwConfirm = findViewById<EditText>(R.id.textPwConfirm)
        val arr = arrayOf("-Select Program-", "Information Science", "Computer Science", "Math & CS", "Data Science", "Other")

        spinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, arr)
    }
}