package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static ListView list;
    private static String[] NAMES = {"Tom", "Mark", "John", "Jack", "Peter"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListShow();
    }

    public void ListShow() {
        list = (ListView) findViewById(R.id.mylist1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(MainActivity.this, R.layout.name_list, NAMES);
        list.setAdapter(adapter);
        list.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String Value = (String) list.getItemAtPosition(i);
                        Toast.makeText(MainActivity.this, "Position: " + i +" Value: "+ Value, Toast.LENGTH_SHORT).show();

                    }
                }
        );
    }
}