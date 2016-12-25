package com.example.i1.test_9;

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
        setContentView(R.layout.activity_maps2);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    private void addMarker(){
        if (null != mMap) {
            mMap.addMarker(new MarkerOptions()
                          .position(new LatLng(0, 0))
                          .title("Marker")
                          .draggable(true));
        }
    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
        LatLng lviv = new LatLng(49.838, 24.029);
        mMap.addMarker(new MarkerOptions().position(lviv).title("Marker in Lviv"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(lviv, 12));
    }
}
