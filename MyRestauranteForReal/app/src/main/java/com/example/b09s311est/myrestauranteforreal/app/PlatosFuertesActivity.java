package com.example.b09s311est.myrestauranteforreal.app;

import android.os.Bundle;
import android.app.Activity;
import android.widget.ListView;
import java.util.ArrayList;


public class PlatosFuertesActivity extends Activity {
    private ListView lvItems;
    private Adaptador adaptador;
    ArrayList<Entidad> lista = new ArrayList<>();
    Entidad item;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_platos_fuertes);

        lvItems = (ListView)findViewById(R.id.itemsPlatosFuertes);

        item = new Entidad("Pasta..........$7000", "Rica pasta en salsa Bechamel.");
        lista.add(item);
        item = new Entidad("Res en Pimienta.......$10000", "Acompañado de papas y ensalada.");
        lista.add(item);
        item = new Entidad("Lasaña Trifasica.........$10000", "Queso ilimitado.");
        lista.add(item);

        adaptador = new Adaptador(lista, this);
        lvItems.setAdapter(adaptador);
    }

}