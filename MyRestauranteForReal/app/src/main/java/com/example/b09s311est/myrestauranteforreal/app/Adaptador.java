package com.example.b09s311est.myrestauranteforreal.app;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends BaseAdapter{
    private ArrayList<Entidad> listItems;
    private Context context;

    public Adaptador(ArrayList<Entidad> listItems, Context context){
        this.listItems = listItems;
        this.context = context;
    }

    @Override
    public int getCount(){return listItems.size();}

    @Override
    public Object getItem(int i){return listItems.get(i);}

    @Override
    public long getItemId(int i){return 0;}

    @Override
    public View getView(int i, View view, ViewGroup viewGroup){
        Entidad Item = (Entidad) getItem(i);
        view = LayoutInflater.from(context).inflate(R.layout.support_simple_spinner_dropdown_item, null);
        TextView tvTitulo = view.findViewById(android.R.id.title);
        TextView tvTexto = view.findViewById(android.R.id.text1);
        tvTitulo.setText(Item.GetTitulo());
        tvTexto.setText(Item.GetTexto());
        return view;
    }
}
