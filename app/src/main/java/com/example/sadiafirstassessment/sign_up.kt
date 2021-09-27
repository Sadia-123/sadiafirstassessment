package com.example.sadiafirstassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.TextView

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        Handler().postDelayed({movetoOtherScreen()},3000)
    }

    fun movetoOtherScreen() {
        var i= Intent(this, sign_in::class.java)
        startActivity(i)
        finish()
    }
}


