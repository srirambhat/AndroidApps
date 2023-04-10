package com.example.datepicker;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    private static Button btn;
    static int day_x, month_x, year_x;
    static final int DIALOG_ID = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Calendar cal = Calendar.getInstance();
        year_x = cal.get(Calendar.YEAR);
        month_x = cal.get(Calendar.MONTH);
        day_x = cal.get(Calendar.DAY_OF_MONTH);

        showDialogonBtnClick();
    }

    @Override
    protected Dialog onCreateDialog (int ID) {
        if (ID == DIALOG_ID) {
            return new DatePickerDialog(MainActivity.this, kDatePickerListener, year_x, month_x, day_x);
        } else
            return null;
    }

    private DatePickerDialog.OnDateSetListener kDatePickerListener =
            new DatePickerDialog.OnDateSetListener() {
                @Override
                public void onDateSet(DatePicker datePicker, int i, int i1, int i2) {
                    year_x = i;
                    month_x = i1 + 1;
                    day_x = i2;
                    Toast.makeText(MainActivity.this, day_x +" / " +month_x + " / " + day_x, Toast.LENGTH_SHORT).show();
                }
            };

    public void showDialogonBtnClick() {
        btn = (Button) findViewById(R.id.button);

        btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        showDialog(DIALOG_ID);

                    }
                }
        );
    }

}