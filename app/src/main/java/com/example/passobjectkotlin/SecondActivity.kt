package com.example.passobjectkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
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
        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            openBack()
        }

        val user = intent.getParcelableExtra<User>("user")
        Log.d(TAG,user.toString())

        text.text = user.toString()
    }

    fun openBack(){
        val intent = Intent()
        intent.putExtra("result", "Thank You")
        setResult(RESULT_OK,intent)
        finish()
    }
}