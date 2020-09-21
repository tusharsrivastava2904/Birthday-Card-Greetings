package com.example.birthdaygreet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_birthday_greeting.*

class BirthdayGreetingActivity : AppCompatActivity() {

    companion object{
        //companion objects are like the STATIC VARIABLES which can be used at different places
        const val NAME_EXTRA = "name_extra"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_birthday_greeting)

        //receiving the name passed by MainActivity.kt
        //name: NAME_EXTRA is the same key to access name variable as passed in the MainActivity.kt
        val name = intent.getStringExtra(NAME_EXTRA)

        //setting values for TextView
        greetingsName.text = "Happy Birthday\n$name !"


    }
}