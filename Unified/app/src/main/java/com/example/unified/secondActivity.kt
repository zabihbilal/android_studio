package com.example.unified

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val app1 = findViewById<ImageView>(R.id.img_app1)
        val app2 = findViewById<ImageView>(R.id.img_app2)
        val app3 = findViewById<ImageView>(R.id.img_app3)

        val back2btn = findViewById<Button>(R.id.back_2)

        app1.setOnClickListener{
            val intent = Intent(this, thirdActivity::class.java)

            startActivity(intent)
        }

        back2btn.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)

            startActivity(intent)
        }


    }
}