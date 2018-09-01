package com.example.b09s311est.myrestauranteforreal.app;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera

        LatLng bule = new LatLng(6.241727, -75.590057);
        mMap.addMarker(new MarkerOptions().position(bule).title("Marker in Bulevar"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(bule,17));
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

        LatLng café_Lebon = new LatLng(6.240388, -75.589402);
        mMap.addMarker(new MarkerOptions().position(café_Lebon).title("Marker in Café Lebon"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(café_Lebon,  17));
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

        LatLng cafetería_Diseño = new LatLng(6.239969, -75.589670);
        mMap.addMarker(new MarkerOptions().position(cafetería_Diseño).title("Marker in Cafetería Diseño"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(cafetería_Diseño,17));
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

        LatLng café_Derecho = new LatLng(6.243488, -75.590409);
        mMap.addMarker(new MarkerOptions().position(café_Derecho).title("Marker in Cafetería Derecho"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(café_Derecho,17));
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

        LatLng Restaurante_Bule = new LatLng(6.241689, -75.589664);
        mMap.addMarker(new MarkerOptions().position(Restaurante_Bule).title("Marker in Cafetería Derecho"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(Restaurante_Bule,17));
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

    }
}
