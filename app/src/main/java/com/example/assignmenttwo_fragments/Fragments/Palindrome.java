package com.example.assignmenttwo_fragments.Fragments;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.assignmenttwo_fragments.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Palindrome extends Fragment implements View.OnClickListener {

    private Button btnPalindrome;
    private EditText txtPalindrome;

    public Palindrome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_palindrome, container, false);
        txtPalindrome=view.findViewById(R.id.txtPalindrome);
        btnPalindrome=view.findViewById(R.id.btnPalindrome);

        btnPalindrome.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        int originalNum, lastDigit, sum=0;
        int num = Integer.parseInt(txtPalindrome.getText().toString());
        originalNum = num;

        while (originalNum>0)
        {
            lastDigit = originalNum%10;
            sum=(sum*10)+lastDigit;
            originalNum = originalNum/10;
        }

        if (sum == num)
        {
            Toast.makeText(getActivity(),"Palindrome" , Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(getActivity(),"Not Palindrome ", Toast.LENGTH_SHORT).show();
        }



    }
}
