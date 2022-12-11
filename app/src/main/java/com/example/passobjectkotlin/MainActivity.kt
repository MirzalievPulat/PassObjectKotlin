package com.example.passobjectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import com.example.passobjectkotlin.model.User

class MainActivity : AppCompatActivity() {
    lateinit var text:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initviews()
    }
    fun initviews(){
        text = findViewById<TextView>(R.id.text)
        var button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            var user = User("Po'lat", "20")
            openSecondPage(user)
        }
    }

    var launchSecond = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()) { result ->
        if(result.resultCode == RESULT_OK){
            val data:Intent? = result.data
            var text2 = data!!.getStringExtra("result")
            text.text = text2
        }
    }

    fun openSecondPage(user:User){
        var intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("user",user)
        launchSecond.launch(intent)
    }
}