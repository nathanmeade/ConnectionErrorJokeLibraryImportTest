package com.meadetechnologies.connectionerrorjokelibraryimporttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.meadetechnologies.connectionerrorjoke.ConnectionErrorJoke
import com.meadetechnologies.connectionerrorknockknockjokes.ConnectionErrorKnockKnockJokes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textView = findViewById<TextView>(R.id.textView)
        //textView.text = ConnectionErrorJoke.getJoke()
        textView.text = ConnectionErrorKnockKnockJokes.getKnockKnockJoke()
    }
}
