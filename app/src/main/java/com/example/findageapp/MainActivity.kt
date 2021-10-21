package com.example.findageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_Click.setOnClickListener {
            val userInput = Integer.parseInt(ed_userDob.text.toString())
            val currentDate = Calendar.getInstance().get(Calendar.YEAR)

            val age = currentDate - userInput
            tv_youAGe.text = "Your Age is : $age"

        }

    }
}