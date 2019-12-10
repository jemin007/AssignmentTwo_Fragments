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
public class Swapping extends Fragment implements View.OnClickListener{

    private Button btnSwap;
    private EditText etFirst, etSecond;
    private TextView tvSwap;

    public Swapping() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_swapping, container, false);
        etFirst = view.findViewById(R.id.etFirst);
        etSecond =view.findViewById(R.id.etSecond);
        btnSwap = view.findViewById(R.id.btnSwap);
        tvSwap =view.findViewById(R.id.tvSwap);

        btnSwap.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int x = Integer.parseInt(etFirst.getText().toString());
        int y = Integer.parseInt(etSecond.getText().toString());

        x =x +y;
        y = x-y;
        x = x-y;

        tvSwap.setText("The numbers after swapping is "+ x + "," +y);

    }
}
