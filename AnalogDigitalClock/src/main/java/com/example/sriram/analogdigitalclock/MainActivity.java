package com.example.sriram.analogdigitalclock;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.TtsSpan;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.Button;
import android.widget.DigitalClock;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    private static Button buttonSbm;
    private static DigitalClock digital;
    private static AnalogClock analog;
    TimePicker tp;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        OnButtonClickListener();
    }

    public void OnButtonClickListener() {
        buttonSbm = (Button) findViewById(R.id.button);
        digital = (DigitalClock) findViewById(R.id.digitalClock);
        analog = (AnalogClock) findViewById(R.id.analogClock);

        buttonSbm.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (digital.getVisibility() == DigitalClock.GONE) {
                            digital.setVisibility(DigitalClock.VISIBLE);
                            analog.setVisibility(AnalogClock.GONE);
                        } else {
                            analog.setVisibility(AnalogClock.VISIBLE);
                            digital.setVisibility(DigitalClock.GONE);
                        }
                    }
                }
        );

    }
}