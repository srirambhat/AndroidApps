package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.i("Sriram:", "in SecondActivity.onCreate()");
        Toast.makeText(this, "In SecondActivity", Toast.LENGTH_SHORT).show();
    }
}