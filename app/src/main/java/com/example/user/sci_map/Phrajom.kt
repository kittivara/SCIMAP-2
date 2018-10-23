package com.example.user.sci_map

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import kotlinx.android.synthetic.main.activity_phrajom.*
import kotlinx.android.synthetic.main.content_main.*
import java.util.*

class Phrajom : AppCompatActivity() {

    lateinit var optionFloor : Spinner
    lateinit var resultFloor : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_phrajom1)

        val actionbar = supportActionBar
        actionbar!!.title = "SCI-MAP"

        actionbar.setDisplayHomeAsUpEnabled(true)
        actionbar.setDisplayHomeAsUpEnabled(true)

        btnSearch.setOnClickListener {
            val intent = Intent(this,InPhrajom::class.java)
            startActivity(intent)
        }

        optionFloor = findViewById(R.id.sp_floor) as Spinner

        resultFloor = findViewById(R.id.tv_floor) as TextView


        val floor = arrayOf("1", "2", "3", "4", "5", "6")



        optionFloor.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,floor)
        optionFloor.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(parent: AdapterView<*>?) {
                resultFloor.text = "Please Select an Option"
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                resultFloor.text = floor.get(position)

            }
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
