package com.example.passobjectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import com.example.passobjectkotlin.model.User
import org.w3c.dom.Text

class SecondActivity : AppCompatActivity() {
    val TAG = SecondActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        initviews()
    }
    fun initviews(){
        val text = findViewById<TextView>(R.id.text)

        val user = intent.getParcelableExtra<User>("user")
        Log.d(TAG,user.toString())

        text.setText(user.toString())
    }
}