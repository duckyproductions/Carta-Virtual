package com.example.b09s311est.myrestauranteforreal.app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;

import java.util.ArrayList;

    public class BebidasActivity extends Activity {
        private ListView lvItems;
        private Adaptador adaptador;
        ArrayList<Entidad> lista = new ArrayList<>();
        Entidad item;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_bebidas);

            lvItems = (ListView)findViewById(R.id.itemsBebidas);

                item = new Entidad("Jugos Naturales.....$9000", "Mora, Mandarina, Uva");
            lista.add(item);
            item = new Entidad("Limonadas...........$3500", "Limon, Coco , Cereza");
            lista.add(item);

            adaptador = new Adaptador(lista, this);
            lvItems.setAdapter(adaptador);
        }

    }
