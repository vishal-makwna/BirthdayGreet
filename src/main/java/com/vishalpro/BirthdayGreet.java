package com.vishalpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BirthdayGreet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birthday_greet);

        Intent intent = getIntent();
        String name = intent.getStringExtra(MainActivity.NAME);
        TextView textView = findViewById(R.id.BirthdayGreet);
        textView.setText("Happy Birthday "+name);

    }
}