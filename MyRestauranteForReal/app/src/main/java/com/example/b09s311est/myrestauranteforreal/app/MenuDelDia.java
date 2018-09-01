package com.example.b09s311est.myrestauranteforreal.app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import java.util.ArrayList;


    public class MenuDelDia extends Activity {
        private ListView lvItems;
        private Adaptador adaptador;
        ArrayList<Entidad> lista = new ArrayList<>();
        Entidad item;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_menu_del_dia);

            lvItems = (ListView)findViewById(R.id.itemsMenuDelDia);

            item = new Entidad("Opcion 1............$12000", "Por asignar.");
            lista.add(item);
            item = new Entidad("Opcion 2............$12000", "Por asignar.");
            lista.add(item);

            adaptador = new Adaptador(lista, this);
            lvItems.setAdapter(adaptador);
        }

    }
