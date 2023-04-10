package com.example.loggingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    public static final String MY_TAG = "the_custom_message";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.i(MY_TAG,"onCreate Method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(MY_TAG,"onStart invoked");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.i(MY_TAG,"onResume invoked");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.i(MY_TAG,"onPause invoked");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(MY_TAG,"onStop invoked");
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(MY_TAG,"onRestart invoked");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(MY_TAG,"onDestroy invoked");
    }
}