package com.example.fragmentapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String MY_TAG = "Sriram:";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ChangeFragment(View Vw) {
        Fragment frag;

        Log.i(MY_TAG,"Change Fragment");
        if (Vw == findViewById(R.id.button1)) {
            Log.i(MY_TAG,"Button 1");
            frag = new FragmentOne();
            androidx.fragment.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_place, frag);
            ft.commit();
        }
        if (Vw == findViewById(R.id.button2)) {
            Log.i(MY_TAG,"Button2");
            frag = new FragmentTwo();
            androidx.fragment.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            ft.replace(R.id.fragment_place, frag);
            ft.commit();
        }

    }
}