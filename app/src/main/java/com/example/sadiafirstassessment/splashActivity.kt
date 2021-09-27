package com.example.sadiafirstassessment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.content.ContextCompat.startActivity

class splashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.actvity_splash)

        Handler().postDelayed({movetoOtherScreen()},3000)
    }

    fun movetoOtherScreen() {
        var i= Intent(this, sign_up::class.java)
        startActivity(i)
        finish()
    }
    }

