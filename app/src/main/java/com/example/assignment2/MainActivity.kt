package com.example.assignment2

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.textView)
        val textName = findViewById<EditText>(R.id.textName)
        val textEmail = findViewById<EditText>(R.id.textEmail)
        val spinner = findViewById<Spinner>(R.id.spinner)
        val textPw = findViewById<EditText>(R.id.textPw)
        val textPwConfirm = findViewById<EditText>(R.id.textPwConfirm)
        val arr = arrayOf("-Select Program-", "Information Science", "Computer Science", "Math & CS", "Data Science", "Other")
        val saveButton = findViewById<Button>(R.id.button)

        saveButton.setOnClickListener{
//            Toast.makeText(this,"PW: ${textPw.text.toString()}, PWConf: ${textPwConfirm.text.toString()}",Toast.LENGTH_SHORT).show()

            if(textName.text.isBlank()){
//                Toast.makeText(this,"You done goofed",Toast.LENGTH_SHORT).show()  //maybe use this for select program
                textName.setError("Please enter a name")
            }
            if(textEmail.text.isBlank()){
                textEmail.setError("Please enter an email")
            }
            if(textPw.text.isBlank()){
                textPw.setError("Please enter a valid password")
            }
            if(!(textPwConfirm.text.toString().equals(textPw.text.toString())) ){
                textPwConfirm.setError("Make sure passwords match")
            }


            if( !(textName.text.isBlank()) && !(textEmail.text.isBlank()) && !(textPw.text.isBlank())
                && (textPwConfirm.text.toString().equals(textPw.text.toString())) ){
            textView.text = "Welcome, ${textName.text.toString()} to the SignUpForm App"
            }
        }
        spinner.adapter = ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line, arr)
    }
}
fun setError(error: CharSequence): Unit {}
