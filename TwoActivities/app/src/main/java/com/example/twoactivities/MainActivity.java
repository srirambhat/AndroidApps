package com.example.twoactivities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static Button button_sbm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButton();
        onClickListenerButton2();
        Log.i("Sriram:", "in MainActivity.onCreate()");
        Toast.makeText(this, "In MainActivity", Toast.LENGTH_SHORT).show();
    }

    public void onClickListenerButton () {
        button_sbm = (Button) findViewById(R.id.button);

        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".SecondActivity");
                        startActivity(intent);
                    }
                }
        );
    }

    public void onClickListenerButton2 () {
        button_sbm = (Button) findViewById(R.id.button2);

        button_sbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(".ThirdActivity");
                        startActivity(intent);
                    }
                }
        );
    }
}