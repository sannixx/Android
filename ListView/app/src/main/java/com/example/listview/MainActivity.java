package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String myContent[] = {"Line1", "Line2", "Line3", "Line4"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            this.getSupportActionBar().hide();
        } catch (NullPointerException e) {
            Log.d("ActionBar",e.getMessage());
        }
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.lv1);
        ArrayAdapter adapter = new ArrayAdapter(MainActivity.this, android.R.layout.simple_expandable_list_item_1, myContent);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, myContent[position] + "", Toast.LENGTH_SHORT).show();
            }
        });

    }


}
