package com.example.user.hangaram_test;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {
    //Adapter adapter;
    //ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //viewPager = (ViewPager) findViewById(R.id.view);
        //adapter = new Adapter(this);
        //viewPager.setAdapter(adapter);
    }
    public void onBackButtonClicked(View v){
        //Toast.makeText(getApplicationContext(), "Back", Toast.LENGTH_LONG).show();
        //토스트 띄우기
        finish();
    }

    public void onButton2Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Gangseo.class);
        startActivity(intent);
    }
    public void onButton3Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Gwangnaru.class);
        startActivity(intent);
    }
    public void onButton4Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Nanji.class);
        startActivity(intent);
    }
    public void onButton5Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Ttukseom.class);
        startActivity(intent);
    }
    public void onButton6Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Mangwon.class);
        startActivity(intent);
    }
    public void onButton7Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Banpo.class);
        startActivity(intent);
    }
    public void onButton8Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Yangwha.class);
        startActivity(intent);
    }
    public void onButton9Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Yeouido.class);
        startActivity(intent);
    }
    public void onButton10Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Ichon.class);
        startActivity(intent);
    }
    public void onButton11Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Jamsil.class);
        startActivity(intent);
    }
    public void onButton12Clicked(View v){
        Intent intent = new Intent(getApplicationContext(), Jamwon.class);
        startActivity(intent);
    }

    //이벤트 페이지 연결하기
    public void onButton14Clicked(View v) {
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bamdokkaebi.org/"));
        startActivity(myIntent);
    }



}
