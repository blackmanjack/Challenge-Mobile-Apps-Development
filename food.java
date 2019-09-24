package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class food extends AppCompatActivity {

    private static MoveWithDataActivity onClickLi;


    public static void setOnClickListener(MoveWithDataActivity onClickListener) {
        food.onClickLi = onClickListener;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food);


    }
}
