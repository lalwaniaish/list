package com.example.aishlalwani.list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView lis;
    String[] names = {"a","b","c"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lis = (ListView) findViewById(R.id.list);
        ArrayAdapter arr = new ArrayAdapter(this,android.R.layout.simple_list_item_1,names);
        lis.setAdapter(arr);

        lis.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int position = i;
                String Selecteditem = lis.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),"Selected item is  " + Selecteditem + "  at position " + position,Toast.LENGTH_SHORT ).show();
            }
        });
    }
}
