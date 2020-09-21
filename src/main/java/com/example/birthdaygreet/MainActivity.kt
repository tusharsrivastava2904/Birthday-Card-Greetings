package com.example.birthdaygreet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    fun CreateButton(view: View) {

        val name = nameEdit.editableText.toString()

        //displaying entered name as toast
//        Toast.makeText(this,"name is $name",Toast.LENGTH_LONG).show()

        //displaying a normal toast
//         Toast.makeText(this,"Button was clicked",Toast.LENGTH_LONG).show()

        //using intent to pass data from one Activity to another
        val intent = Intent(this,BirthdayGreetingActivity::class.java)
        //passing the name using intent to the BirthdayGreetingActivity.kt
        // BirthdayGreetingActivity.NAME_EXTRA gives us the companion object NAME_EXTRA created in BirthdayGreetingActivity.kt
        //putExtra() passes the values in "Key:value pairs"
        intent.putExtra(BirthdayGreetingActivity.NAME_EXTRA, name)
        startActivity(intent)

    }
}