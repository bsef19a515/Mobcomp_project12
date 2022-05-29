package com.example.myapplication11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> GroceryList = new ArrayList<>();
    ListView listView;
    Button btn;
    EditText txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        GroceryList.add("Apple");
//        GroceryList.add("Banana");
//        GroceryList.add("Desi Ghee");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1,
                GroceryList);
        listView = findViewById(R.id.listview);
        listView.setAdapter(arrayAdapter);

        txt=findViewById(R.id.textView2);

        btn=findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                GroceryList.add(txt.getText().toString());
                arrayAdapter.notifyDataSetChanged();
            }
        });




    }

}