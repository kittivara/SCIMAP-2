package com.example.user.sci_map;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Phrajom1 extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner s1;
    Spinner s2;
    private ImageButton btnSearch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phrajom);
        getSupportActionBar().setTitle("SCI-MAP");
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        s1 = (Spinner)findViewById(R.id.sp_floor);
        s2 = (Spinner)findViewById(R.id.sp_room);

        s1.setOnItemSelectedListener(this);
        btnSearch = (ImageButton) findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View v){
                openAcctivity2();
            }
        });
    }
    public void openAcctivity2(){
        Intent intent = new Intent(this, InPhrajom.class);
        startActivity(intent);
    }


    @Override
    public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        String[] state = null;
        if(arg2==0){
            state = new String[]{"101", "102", "103"};
        }
        if(arg2==1){
            state = new String[]{"201", "202", "203"};
        }
        ArrayAdapter<String> adt = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,state);
        s2.setAdapter(adt);
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public void onClick(View arg0){
        String selectfloor=s1.getSelectedItem().toString();
        String state=s2.getSelectedItem().toString();

    }
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if(id == android.R.id.home){
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }

}
