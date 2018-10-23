package com.example.user.sci_map

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class InPhrajom : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_in_phrajom)
        val actionbar = supportActionBar
        actionbar!!.title = "SCI-MAP"

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
