package com.example.implicitintentsreceiver

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = intent
        val uri = intent.data
        if (uri != null) {
            val uri_string = getString(R.string.uri_label) + uri.toString()
            val textView: TextView = findViewById(R.id.text_uri_message)
            textView.text = uri_string;
        }
    }
}