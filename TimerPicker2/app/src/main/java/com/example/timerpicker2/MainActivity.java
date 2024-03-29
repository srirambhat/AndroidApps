package com.example.timerpicker2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static TimePicker tp;
    private static Button btn;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTime();
    }

    public void showTime() {
        tp = (TimePicker) findViewById(R.id.analogClock);
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(getBaseContext(),tp.getCurrentHour() + ":" + tp.getCurrentMinute(),Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}