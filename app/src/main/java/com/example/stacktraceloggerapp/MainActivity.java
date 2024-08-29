package com.example.stacktraceloggerapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        String str = null;
        str.length(); // This will give us a NullPointerException


        setContentView(R.layout.activity_main);
    }
}
