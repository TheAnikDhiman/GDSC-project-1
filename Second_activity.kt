package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Second_activity : AppCompatActivity() {

    lateinit var receiver_name : TextView
    lateinit var receiver_email: TextView
    lateinit var receiver_dob : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        receiver_name= findViewById(R.id.text1)
        receiver_email=findViewById(R.id.text2)
        receiver_dob=findViewById(R.id.text3)

        val bundle= intent.extras
        if (bundle != null){
            receiver_name.text = "Name = ${bundle.getString("name")}"
            receiver_email.text = "E-mail = ${bundle.getString("email")}"
            receiver_dob.text = "Date of Birth = ${bundle.getString("dob")}"
        }
   }
}