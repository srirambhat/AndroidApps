package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends Activity {
    private ArrayList<HashMap<String, String>> list;
    public static final String FIRST_COLUMN="First";
    public static final String SECOND_COLUMN="Second";
    public static final String THIRD_COLUMN="Third";
    public static final String FOURTH_COLUMN="Fourth";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView=(ListView)findViewById(R.id.listView1);
        populateList();
        ListViewAdapter adapter=new ListViewAdapter(this, list);
        listView.setAdapter(adapter);
    }

    private void populateList() {
        // TODO Auto-generated method stub

        list=new ArrayList<HashMap<String,String>>();

        HashMap<String,String> hashmap=new HashMap<String, String>();
        hashmap.put(FIRST_COLUMN, "Allo messaging1");
        hashmap.put(SECOND_COLUMN, "google");
        hashmap.put(THIRD_COLUMN, "Free");
        hashmap.put(FOURTH_COLUMN, "App");
        list.add(hashmap);

        HashMap<String,String> hashmap2=new HashMap<String, String>();
        hashmap2.put(FIRST_COLUMN, "Allo messaging2");
        hashmap2.put(SECOND_COLUMN, "google");
        hashmap2.put(THIRD_COLUMN, "Free");
        hashmap2.put(FOURTH_COLUMN, "App");
        list.add(hashmap2);

        HashMap<String,String> hashmap3=new HashMap<String, String>();
        hashmap3.put(FIRST_COLUMN, "Allo messaging3");
        hashmap3.put(SECOND_COLUMN, "google");
        hashmap3.put(THIRD_COLUMN, "Free");
        hashmap3.put(FOURTH_COLUMN, "App");
        list.add(hashmap3);

        HashMap<String,String> hashmap4=new HashMap<String, String>();
        hashmap4.put(FIRST_COLUMN, "Allo messaging4");
        hashmap4.put(SECOND_COLUMN, "google");
        hashmap4.put(THIRD_COLUMN, "Free");
        hashmap4.put(FOURTH_COLUMN, "App");
        list.add(hashmap4);

        HashMap<String,String> hashmap5=new HashMap<String, String>();
        hashmap5.put(FIRST_COLUMN, "Allo messaging");
        hashmap5.put(SECOND_COLUMN, "google");
        hashmap5.put(THIRD_COLUMN, "Free");
        hashmap5.put(FOURTH_COLUMN, "App");
        list.add(hashmap5);

        HashMap<String,String> hashmap6=new HashMap<String, String>();
        hashmap6.put(FIRST_COLUMN, "Allo messaging");
        hashmap6.put(SECOND_COLUMN, "google");
        hashmap6.put(THIRD_COLUMN, "Free");
        hashmap6.put(FOURTH_COLUMN, "App");
        list.add(hashmap6);

        HashMap<String,String> hashmap7=new HashMap<String, String>();
        hashmap7.put(FIRST_COLUMN, "Allo messaging");
        hashmap7.put(SECOND_COLUMN, "google");
        hashmap7.put(THIRD_COLUMN, "Free");
        hashmap7.put(FOURTH_COLUMN, "App");
        list.add(hashmap7);

    }
}