package com.example.b09s311est.myrestauranteforreal.app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import java.util.ArrayList;

    public class PostresActivity extends Activity {
        private ListView lvItems;
        private Adaptador adaptador;
        ArrayList<Entidad> lista = new ArrayList<>();
        Entidad item;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_postres);

            lvItems = (ListView)findViewById(R.id.itemsPostres);

            item = new Entidad("Tiramizu..........$4000", "Porcion personal.");
            lista.add(item);
            item = new Entidad("Pastel...........$18000", "Para compartir.");
            lista.add(item);


            adaptador = new Adaptador(lista, this);
            lvItems.setAdapter(adaptador);
        }

    }
