package com.example.i1.test_9;

/**
 * Created by i1 on 13.11.2016.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Tab_2 extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tab2, container, false);

        Button CatCafe = (Button)rootView.findViewById(R.id.button);
        CatCafe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CatCafeActivity.class);
                startActivity(intent);
            }
        });


        Button Kruivka = (Button)rootView.findViewById(R.id.button1);
        Kruivka.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), KruivkaActivity.class);
                startActivity(intent);
            }

        });

        Button medelin = (Button)rootView.findViewById(R.id.button2);
        medelin.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MedelinActivity.class);
                startActivity(intent);
            }

        });

        Button Bambetla = (Button)rootView.findViewById(R.id.button3);
        Bambetla.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), BambetiActivity.class);
                startActivity(intent);
            }

        });

        Button polarna = (Button)rootView.findViewById(R.id.button4);
        polarna.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), PolarnaActivity.class);
                startActivity(intent);
            }

        });

        return  rootView;

    }


}