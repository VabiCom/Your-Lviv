package com.example.i1.test_9;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by i1 on 13.11.2016.
 */

public class Tab_3 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab3, container, false);

        Button panorama = (Button)rootView.findViewById(R.id.button);
        panorama.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PanoramaActivity.class);
                startActivity(intent);
            }
        });


        Button george = (Button)rootView.findViewById(R.id.button1);
        george.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), GeorgeActivity.class);
                startActivity(intent);
            }

        });

        Button warsaw = (Button)rootView.findViewById(R.id.button2);
        warsaw.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), WarsawActivity.class);
                startActivity(intent);
            }

        });

        Button lh = (Button)rootView.findViewById(R.id.button3);
        lh.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), Lh_HotelActivity.class);
                startActivity(intent);
            }

        });

        Button kupava = (Button)rootView.findViewById(R.id.button4);
        kupava.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KupavaActivity.class);
                startActivity(intent);
            }

        });


        Button lviv = (Button)rootView.findViewById(R.id.button5);
        lviv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LvivActivity.class);
                startActivity(intent);
            }

        });


        Button dnister = (Button)rootView.findViewById(R.id.button6);
        dnister.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), DnisterActivity.class);
                startActivity(intent);
            }

        });


        Button leopolis = (Button)rootView.findViewById(R.id.button7);
        leopolis.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LeopolisActivity.class);
                startActivity(intent);
            }

        });


        Button vena = (Button)rootView.findViewById(R.id.button8);
        vena.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), VenaActivity.class);
                startActivity(intent);
            }

        });
        return  rootView;

    }


}