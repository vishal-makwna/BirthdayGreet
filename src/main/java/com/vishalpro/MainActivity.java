package com.vishalpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
        public static final String NAME = "androidx.appcompat.app.AppCompatActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void CreateBirthdayCard(View view){

        EditText nameInput = findViewById(R.id.nameInput);
//
//        //method to get text to String
        String name = nameInput.getText().toString();
//        String name1 = nameInput.getEditableText().toString();
//
       Toast.makeText(this, "name is "+name, Toast.LENGTH_LONG).show();

        Intent intent = new Intent(this,BirthdayGreet.class);
        intent.putExtra(NAME,name);
        startActivity(intent);


    }
}