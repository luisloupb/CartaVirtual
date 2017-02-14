package com.example.b09s311est.chimbadeproyecto;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class Ubicacion extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ubicacion);
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
        LatLng poblado = new LatLng(6.213358, -75.572551);
        LatLng laureles = new LatLng(6.247330, -75.602043);
        LatLng envigado = new LatLng(6.170003, -75.588032);
        mMap.addMarker(new MarkerOptions().position(poblado).title("Marcador en El poblado"));
        mMap.addMarker(new MarkerOptions().position(laureles).title("Marcador en Laureles"));
        mMap.addMarker(new MarkerOptions().position(envigado).title("Marcador en Envigado"));

        mMap.moveCamera(CameraUpdateFactory.newLatLng(poblado));
        mMap.set
    }
}
