package com.example.buttonapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var butMinus:Button
    lateinit var butPlus:Button
    lateinit var num:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var updatedNum:Int=0
        butMinus=findViewById(R.id.butMinus)
        butPlus=findViewById(R.id.butPlus)
        num=findViewById(R.id.tvNum)

        butPlus.setOnClickListener(){
            updatedNum++
            num.text= updatedNum.toString()
        }
        butMinus.setOnClickListener(){
            updatedNum--
            num.text= updatedNum.toString()
        }

    }
}