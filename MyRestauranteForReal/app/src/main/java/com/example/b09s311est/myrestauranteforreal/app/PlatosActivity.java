package com.example.b09s311est.myrestauranteforreal.app;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class PlatosActivity extends ListActivity {

    private ListAdapter mAdapter = null;

    public class Node
    {
        public String mTitle;
        public String mDescription;
        public Integer mImageResource;
    }

    //ArrayList
    private static ArrayList<Node> mArray = new ArrayList<Node>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        setData();

       // mAdapter = new MyAdapter( this );
        setListAdapter( mAdapter);

    }

    protected void onListItemClick(ListView l , View v , int position , long id)
    {
       // Toast.makeText(this, testValues[position], Toast.LENGTH_SHORT).show();
    }


    private void setData()
    {
        mArray.clear();

        Node myNode = new Node();

        //Plato 1
     ///   myNode.mTitle = this.getResources().getString(R.string.title1):
    }
}
