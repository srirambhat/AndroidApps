package com.example.radiobuttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static RadioGroup radio_g;
    private static RadioButton radio_but;
    private static Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        onClickListenerButtiib();
    }

    public void onClickListenerButtiib() {
        radio_g = (RadioGroup) findViewById(R.id.radioGroup);
        submit = (Button) findViewById(R.id.button2);

        submit.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        int SelectedID = radio_g.getCheckedRadioButtonId();

                        radio_but = (RadioButton) findViewById(SelectedID);
                        Toast.makeText(MainActivity.this, radio_but.getText().toString(), Toast.LENGTH_SHORT).show();
                    }
                }
        );
    }
}