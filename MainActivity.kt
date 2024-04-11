package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val send_button = findViewById<Button>(R.id.submit)
        val send_name = findViewById<EditText>(R.id.name)
        val send_email = findViewById<EditText>(R.id.email)
        val send_dob = findViewById<EditText>(R.id.dob)

        send_button.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("name", send_name.text.toString())
            bundle.putString("email", send_email.text.toString())
            bundle.putString("dob", send_dob.text.toString())

            val intent = Intent(this, Second_activity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
        val buttonDark = findViewById<Button>(R.id.dark)
        val buttonRead = findViewById<Button>(R.id.read)
        val layout = findViewById<ConstraintLayout>(R.id.main)

        buttonRead.setOnClickListener {
            layout.setBackgroundResource(R.color.CanaryYellow)
            Toast.makeText(applicationContext, "READ MODE ON....!", Toast.LENGTH_SHORT).show()
        }
        buttonDark.setOnClickListener {
            layout.setBackgroundResource(R.color.black)
            Toast.makeText(applicationContext, "DARK MODE ON.....!", Toast.LENGTH_SHORT).show()
        }
    }
}