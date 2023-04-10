package com.example.checkbox;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button submit_btn;
    CheckBox check1, check2, check3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AddListenerOnButton();
        AddListenerOnRiceCheckBox();
    }

    public void AddListenerOnRiceCheckBox() {
        check1 = (CheckBox) findViewById(R.id.checkBox);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);

        check1.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()) {
                            Toast.makeText(
                                    MainActivity.this,
                                    "Rice is Checked",
                                    Toast.LENGTH_LONG
                            ).show();
                        }
                    }
                }
        );
        check2.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()) {
                            Toast.makeText(
                                    MainActivity.this,
                                    "Dal is Checked",
                                    Toast.LENGTH_LONG
                            ).show();
                        }
                    }
                }
        );
        check3.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (((CheckBox)v).isChecked()) {
                            Toast.makeText(
                                    MainActivity.this,
                                    "Ragi is Checked",
                                    Toast.LENGTH_LONG
                            ).show();
                        }
                    }
                }
        );
    }

    public void AddListenerOnButton () {
        check1 = (CheckBox) findViewById(R.id.checkBox);
        check2 = (CheckBox) findViewById(R.id.checkBox2);
        check3 = (CheckBox) findViewById(R.id.checkBox3);
        submit_btn = (Button) findViewById(R.id.button);

        submit_btn.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        StringBuffer result = new StringBuffer();
                        result.append("Rice : ").append(check1.isChecked());
                        result.append("Dal : ").append(check2.isChecked());
                        result.append("Ragi : ").append(check3.isChecked());

                        Toast.makeText(MainActivity.this,
                                result.toString(),
                                Toast.LENGTH_LONG).show();
                    }
                }
        );
    }
}