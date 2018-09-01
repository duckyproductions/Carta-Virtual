package com.example.b09s311est.myrestauranteforreal.app;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MenuActivity extends Activity {


    private String[] products = new String[]{"Entradas", "Platos Fuertes" , "Bebidas" , "Postres"};

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        ListView lv = findViewById(android.R.id.list);
        ListAdapter lA = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,products);
        lv.setAdapter(lA);

    }

}
