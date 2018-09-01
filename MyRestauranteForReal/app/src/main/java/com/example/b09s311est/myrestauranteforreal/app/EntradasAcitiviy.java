package com.example.b09s311est.myrestauranteforreal.app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import java.util.ArrayList;

    public class EntradasAcitiviy extends Activity {

        private ListView lvItems;
        private Adaptador adaptador;
        ArrayList<Entidad> lista = new ArrayList<>();
        Entidad item;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_entradas_acitiviy);

            lvItems = (ListView)findViewById(R.id.itemsEntradas);

            item = new Entidad("Cascos.........$5000", "Aros de Cebolla-");
            lista.add(item);
            item = new Entidad("Roscas.........$7000", "Papitas criollas.");
            lista.add(item);

            adaptador = new Adaptador(lista, this);
            lvItems.setAdapter(adaptador);
        }

    }
