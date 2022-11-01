package com.example.indianculture;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity
{
    ListView listView;
    AutoCompleteTextView autoCompleteTextView;
    ArrayList<String> arrThings = new ArrayList<>();
    ArrayList<String> arrAutoCompleteText = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.list);
        autoCompleteTextView = findViewById(R.id.autoComTxt);

        arrThings.add("Indian Famous Things");  //like Banarasi sari  //temple
        arrThings.add("Indian Heritage"); //temple,gretting,bird national , national antham,Scriptures,symbol,fruit
        arrThings.add("Indian Food");
        arrThings.add("Indian Costume");
        arrThings.add("Indian Tourism");
        arrThings.add("Indian Holly Places");
        arrThings.add("Indian Good Places");
        arrThings.add("Festivals of India");
        arrThings.add("Indian Celebration Days");
        arrThings.add("Indian Travelling");
        arrThings.add("Indian Fruits");
        arrThings.add("Indian Families");
        arrThings.add("Dance of Indian");
        arrThings.add("Indian Languages");
        arrThings.add("Material Arts Of India");
        arrThings.add("Indian Cuisine");
        arrThings.add("Epics and Mythology");
        arrThings.add("Indian Marriage");
        arrThings.add("Indian Players");
        arrThings.add("Indians Achievement");
        arrThings.add("Indian Army");
        arrThings.add("Indian Ideals");
        arrThings.add("Indian Parks");

        ArrayAdapter<String> arrAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,arrThings);

        listView.setAdapter(arrAdapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position>=0)
                {
                    Toast.makeText(MainActivity.this,"Clicked..",Toast.LENGTH_SHORT).show();
                }
            }
        });


        arrAutoCompleteText.add("Indian Famous Things");  //like Banarasi sari  //temple
        arrAutoCompleteText.add("Indian Heritage"); //temple,gretting,bird national , national antham,Scriptures,symbol,fruit
        arrAutoCompleteText.add("Indian Food");
        arrAutoCompleteText.add("Indian Costume");
        arrAutoCompleteText.add("Indian Tourism");
        arrAutoCompleteText.add("Indian Holly Places");
        arrAutoCompleteText.add("Indian Good Places");
        arrAutoCompleteText.add("Festivals of India");
        arrAutoCompleteText.add("Indian Celebration Days");
        arrAutoCompleteText.add("Indian Travelling");
        arrAutoCompleteText.add("Indian Fruits");
        arrAutoCompleteText.add("Indian Families");
        arrAutoCompleteText.add("Dance of Indian");
        arrAutoCompleteText.add("Indian Languages");
        arrAutoCompleteText.add("Material Arts Of India");
        arrAutoCompleteText.add("Indian Cuisine");
        arrAutoCompleteText.add("Epics and Mythology");
        arrAutoCompleteText.add("Indian Marriage");
        arrAutoCompleteText.add("Indian Players");
        arrAutoCompleteText.add("Indians Achievement");
        arrAutoCompleteText.add("Indian Army");
        arrAutoCompleteText.add("Indian Ideals");
        arrAutoCompleteText.add("Indian Parks");


        ArrayAdapter<String> arrayAdapter1 = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,arrAutoCompleteText);

        autoCompleteTextView.setAdapter(arrayAdapter1);
        autoCompleteTextView.setThreshold(1);


    }
}