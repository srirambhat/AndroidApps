package com.example.seekbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static SeekBar seekbar;
    private static TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MySeekBar();
    }

    public void MySeekBar() {

        seekbar = (SeekBar) findViewById(R.id.seekBar);
        textview = (TextView) findViewById(R.id.textView);

        textview.setText("Covered: " +seekbar.getProgress() + " / " +seekbar.getMax());

        seekbar.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {
                    int progress_value;

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                        progress_value = i;
                        textview.setText("Covered: " +i + " / " +seekbar.getMax());
                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {
                        Toast.makeText(MainActivity.this, "Seek Bar Start Tracking: " +progress_value, Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        textview.setText("Covered: " +progress_value + " / " +seekbar.getMax());
                        Toast.makeText(MainActivity.this, "Seek Bar End Tracking: " +progress_value, Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
}