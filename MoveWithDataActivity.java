package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MoveWithDataActivity extends AppCompatActivity implements View.OnClickListener {
    Button imageView, imageView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        ImageButton imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(this);

        ImageButton imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.imageView:
                Intent intent = new Intent(MoveWithDataActivity.this, food.class);
                startActivity(intent);
                break;

            case R.id.imageView2:
                Intent intent2 = new Intent(MoveWithDataActivity.this, beverage.class);
                startActivity(intent2);
                break;

        }
    }
}