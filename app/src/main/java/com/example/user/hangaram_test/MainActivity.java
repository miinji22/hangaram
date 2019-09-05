package com.example.user.hangaram_test;

//import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.user.hangaram.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onButton1Clicked(View v) {
        //Toast 띄우기
        Toast.makeText(getApplicationContext(), "시작 버튼이 눌렸어요.", Toast.LENGTH_LONG).show();
    }

    //public void onClick (View view) {
    //  Intent i = new Intent(this, onClickActivity.class);
    //startActivity(i);
    //}
    public void onButton2Clicked(View v) {
        //웹페이지 열기
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.naver.com"));
        startActivity(myIntent);

    }
    public void onButton3Clicked(View v) {
        //전화걸기
        Intent myIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("tel:010-2077-9408"));
        startActivity(myIntent);
    }
    public void onButton4Clicked(View v) {
        //메뉴화면으로 이동 - 스크린이동
        Intent intent = new Intent(getApplicationContext(), MenuActivity.class);
        startActivity(intent);
    }

}