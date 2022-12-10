package com.example.passobjectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.passobjectkotlin.model.User

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }
    fun initviews(){
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            var user = User("Po'lat", "20")
            openSecondPage(user)
        }
    }
    fun openSecondPage(user:User){
        var intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("user",user)
        startActivity(intent)
    }
}