package com.example.user.sci_map

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class SpalshActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceStates: Bundle?) {
        super.onCreate(savedInstanceStates)
        setContentView(R.layout.content_splash)

        val background = object : Thread() {
            override fun run() {
                try {
                    Thread.sleep(5000 )
                    val intent = Intent(baseContext, MainActivity::class.java)
                    startActivity(intent)
                }
                catch (e: Exception) {
                    e.printStackTrace()
                }
            }
        }
        background.start()
    }
}