package com.example.i1.test_9;

/**
 * Created by i1 on 13.11.2016.
 */

import android.content.Intent;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Tab_1 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab1, container, false);


        Button HightCastle = (Button)rootView.findViewById(R.id.button);
        HightCastle.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CastleActivity.class);
                startActivity(intent);
            }
        });


        Button Opera = (Button)rootView.findViewById(R.id.button1);
        Opera.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OperaActivity.class);
                startActivity(intent);
            }

    });

        Button Ratusha = (Button)rootView.findViewById(R.id.button2);
        Ratusha.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), RatushaActivity.class);
                startActivity(intent);
            }

        });

        Button HomeTeaher = (Button)rootView.findViewById(R.id.button3);
        HomeTeaher.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), HomeTeacherActivity.class);
                startActivity(intent);
            }

        });

        Button Olga_Elizaveta = (Button)rootView.findViewById(R.id.button4);
        Olga_Elizaveta.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), OlgaAndElizavetaActivity.class);
                startActivity(intent);
            }

        });


        Button Assumption_curch = (Button)rootView.findViewById(R.id.button5);
        Assumption_curch.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AssumpytionChurchActivity.class);
                startActivity(intent);
            }

        });


        Button Latin = (Button)rootView.findViewById(R.id.button6);
        Latin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), LatinCathdralActivity.class);
                startActivity(intent);
            }

        });


        Button Apteka = (Button)rootView.findViewById(R.id.button7);
        Apteka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AptekaMuseumActivity.class);
                startActivity(intent);
            }

        });


        return  rootView;

}


}