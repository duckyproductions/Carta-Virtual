package com.example.b09s311est.myrestauranteforreal.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.b09s311est.myrestauranteforreal.feature.R.layout.activity_main);
    }

    void  VerMapa (View v){
        Intent intencion =  new Intent(this, MapsActivity.class);
        startActivity(intencion);
    }

    void  VerMenu (View v){
        Intent intencion =  new Intent(this, MenuActivity.class);
        startActivity(intencion);
    }

    void  Pagar (View v){
        Intent intencion =  new Intent(this, PayActivity.class);
        startActivity(intencion);
    }

    void  VerMapaMesas (View v){

        String phone = "3005927346";
        String msg = "Hola";


        Uri envio = Uri.parse("smsto:" + phone);
        Intent contacto = new Intent(Intent.ACTION_SENDTO, envio);
        contacto.setPackage("com.whatsapp");
        contacto.putExtra(Intent.EXTRA_TEXT, msg);

        startActivity(Intent.createChooser(contacto, "Contactar"));
    }
}
