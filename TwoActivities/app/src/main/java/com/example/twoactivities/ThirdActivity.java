package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        Log.i("Sriram:", "in ThirdActivity.onCreate()");
        Toast.makeText(this, "In Third Activity", Toast.LENGTH_SHORT).show();
    }
}