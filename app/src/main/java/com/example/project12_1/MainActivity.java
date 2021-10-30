package com.example.project12_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_add = findViewById(R.id.add_btn);
        Button remove_btn = findViewById(R.id.remove_btn);
        ListView listView = findViewById(R.id.listview);
         ArrayList<String> midList = new ArrayList<String>();
         ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,midList);
        EditText editItem = findViewById(R.id.editItem);
        listView.setAdapter(adapter);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                midList.add(editItem.getText().toString());
                adapter.notifyDataSetChanged();
                editItem.setText("");

            }
        });

        remove_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                midList.remove(midList.size()-1);
                adapter.notifyDataSetChanged();

            }
        });
    }

}