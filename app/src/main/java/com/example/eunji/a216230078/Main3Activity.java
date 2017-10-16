package com.example.eunji.a216230078;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);







            }


    public void onButtonClick(View v)
    {

        Intent i = new Intent(this, Main2Activity.class);
        this.startActivity(i);
    }
    public void Button9(View v)
    {

        Toast.makeText(this,"뚝딱뚝딱 개발중이에욤 ^,^",Toast.LENGTH_LONG).show();


    }
    public void Button10(View v){
        Toast.makeText(this,"pick ♥",Toast.LENGTH_LONG).show();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://store.naver.com/restaurants/detail?id=66929503"));
        startActivity(intent);
    }
}

