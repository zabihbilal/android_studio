package com.example.testing_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMulti : Button
    lateinit var btnDiv : Button
    lateinit var etA: EditText
    lateinit var etB: EditText
    lateinit var resultTv: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
//            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
//            insets
//        }
        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_subtraction)
        btnMulti = findViewById(R.id.btn_multiplication)
        btnDiv = findViewById(R.id.btn_division)
        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)
        resultTv = findViewById(R.id.result_tv)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMulti.setOnClickListener(this)
        btnDiv.setOnClickListener(this)

    }

    override fun onClick(v: View?) {

//        var a = etA.text.toString().toDouble()
//        var b = etB.text.toString().toDouble()

        var a1 = etA.text.toString()
        var b1 = etB.text.toString()

        if (!isNumber(a1) || !isNumber(b1)) {
            resultTv.text = "Please enter valid numbers"
            return
        }

        var a = a1.toDouble()
        var b = b1.toDouble()

        var result = 0.0

        when(v?.id){
            R.id.btn_add -> {
                result = a+b
            }
            R.id.btn_subtraction -> {
                result = a-b
            }
            R.id.btn_multiplication -> {
                result = a*b
            }
            R.id.btn_division -> {
                result = a/b
            }
        }
//        resultTv.text = "Result is $result"
        resultTv.setText("Result is $result")
    }

    private fun isNumber(input: String): Boolean {
        return input.matches("-?\\d+(\\.\\d+)?".toRegex())
    }

}