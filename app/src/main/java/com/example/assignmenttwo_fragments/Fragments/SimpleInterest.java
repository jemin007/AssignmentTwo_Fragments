package com.example.assignmenttwo_fragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.assignmenttwo_fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class SimpleInterest extends Fragment implements View.OnClickListener{

    private EditText etPrincipal, etTime, etRate;
    private Button btnSI;
    private TextView tvSI;


    public SimpleInterest() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_simple_interest, container, false);
        etPrincipal = view.findViewById(R.id.etPrincipal);
        etRate = view.findViewById(R.id.etRate);
        etTime = view.findViewById(R.id.etTime);

        btnSI = view.findViewById(R.id.btnSI);

        tvSI = view.findViewById(R.id.tvSI);

        btnSI.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        float p,t,r, SI;
        p = Float.parseFloat(etPrincipal.getText().toString());
        t = Float.parseFloat(etTime.getText().toString());
        r = Float.parseFloat(etRate.getText().toString());

        SI = (p * t * r)/100;
        
        tvSI.setText("Simple Interest: "+SI);


    }
}
