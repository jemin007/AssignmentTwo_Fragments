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
public class Armstrong extends Fragment implements View.OnClickListener {
    private EditText etArmstrong;
    private Button btnArmstrong;
    private TextView tvArmstrong;

    public Armstrong() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_armstrong, container, false);
        etArmstrong = view.findViewById(R.id.etArmstrong);
        btnArmstrong = view.findViewById(R.id.btnArmstrong);
        tvArmstrong = view.findViewById(R.id.tvArmstrong);

        btnArmstrong.setOnClickListener(this);
        return view;
    }

            @Override
            public void onClick(View v) {

                int number, remainder, sum=0;
                int num = Integer.parseInt(etArmstrong.getText().toString());

                number = num;

                while (num>0){
                    remainder=num%10;
                    num=num/10;
                    sum = sum + (remainder*remainder*remainder);
                }

                if (number == sum){
                    tvArmstrong.setText("Armstrong Number!");
                }
                else
                {
                    tvArmstrong.setText("Not Armstrong!");
                }

            }
        }
