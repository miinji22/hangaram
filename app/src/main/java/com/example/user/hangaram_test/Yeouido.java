package com.example.user.hangaram_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Yeouido extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yeouido);
    }
    public void onBackButtonClicked(View v){
        //Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_LONG).show();
        //토스트 띄우기
        finish();
    }
}