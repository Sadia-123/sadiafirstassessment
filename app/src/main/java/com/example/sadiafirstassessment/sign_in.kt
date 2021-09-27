package com.example.sadiafirstassessment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Patterns
import android.widget.TextView
import java.util.regex.Matcher
import java.util.regex.Pattern
import android.R
import android.os.Handler
import android.view.View
import android.content.Intent as ContentIntent
import java.lang.Override as Override1


class sign_in : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.sadiafirstassessment.R.layout.activity_sign_in)
        Handler().postDelayed({movetoOtherScreen()},3000)
    }

    fun movetoOtherScreen() {
        var i= android.content.Intent(this, UserdetailActivity::class.java)
        startActivity(i)
        finish()
    }
}







