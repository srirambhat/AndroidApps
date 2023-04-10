package com.example.timepickerwithdialog;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static Button button_sbmt;
    static final int DIALOG_ID = 0;
    int hour_x;
    int min_x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showTimePicker();
    }

    @Override
    protected Dialog onCreateDialog(int id) {
        if (id == DIALOG_ID) {
            return new TimePickerDialog(MainActivity.this, kTimePickerListner, hour_x, min_x, false);
        } else
            return null;
    }

    protected TimePickerDialog.OnTimeSetListener kTimePickerListner =
            new TimePickerDialog.OnTimeSetListener() {
                @Override
                public void onTimeSet(TimePicker timePicker, int i, int i1) {
                    hour_x = i;
                    min_x = i1;
                    Toast.makeText(getBaseContext(), hour_x +" : " +min_x, Toast.LENGTH_SHORT).show();
                }
            };

    public void showTimePicker() {
        button_sbmt = (Button) findViewById(R.id.button);
        button_sbmt.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showDialog(DIALOG_ID);
                    }
                }
        );
    }
}