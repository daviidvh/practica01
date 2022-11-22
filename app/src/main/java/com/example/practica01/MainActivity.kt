package com.example.practica01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    private var onCreate = 0
    private var onStart = 1
    private var onResume = 2
    private var onPause = 3
    private var onRestart = 4
    private var onStop = 5
    private var onDestroy = 6
    var t: String? =null
    var txt1: EditText?=null
    var txt2: EditText?=null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("onCreate $onCreate")
    }

    override fun onStart() {
        super.onStart()
        setContentView(R.layout.activity_main)
        println("onStart $onStart")
    }


    override fun onResume() {
        super.onResume()
        setContentView(R.layout.activity_main)
        println("onResume $onResume")
    }
    override fun onPause() {
        super.onPause()
        setContentView(R.layout.activity_main)
        println("onPause $onPause")
    }

    override fun onRestart() {
        super.onRestart()
        setContentView(R.layout.activity_main)
        println("onRestart $onRestart")
    }
    override fun onStop() {
        super.onStop()
        setContentView(R.layout.activity_main)
        println("onStop $onStop")
    }
    override fun onDestroy() {
        super.onDestroy()
        setContentView(R.layout.activity_main)
        println("onDestroy $onDestroy")
    }

    override fun onSaveInstanceState(guardarEstado: Bundle)  {
        super.onSaveInstanceState(guardarEstado)
        txt1 = findViewById (R.id.editText)
        t = txt1!!.text.toString();
        guardarEstado.putString("text1", t);


        txt2 = findViewById (R.id.editText2)
        t = txt2!!.text.toString();
        guardarEstado.putString("text2", t);


    }

    override fun onRestoreInstanceState(recuperarEstado: Bundle) {
        super.onRestoreInstanceState(recuperarEstado)
        t = recuperarEstado.getString("text1")
        txt1!!.setText(t)

        t = recuperarEstado.getString("text2")
        txt2!!.setText(t)
    }
}

