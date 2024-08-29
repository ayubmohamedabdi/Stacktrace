package com.example.stacktraceloggerapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize the string to avoid NullPointerException
        String str = "Hello, World!";
        str.length(); // Now this won't cause a NullPointerException

        setContentView(R.layout.activity_main);
    }
}
