package com.example.assignmenttwo_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.assignmenttwo_fragments.Fragments.AreaOfCircle;
import com.example.assignmenttwo_fragments.Fragments.Armstrong;
import com.example.assignmenttwo_fragments.Fragments.Automorphic;
import com.example.assignmenttwo_fragments.Fragments.Palindrome;
import com.example.assignmenttwo_fragments.Fragments.SimpleInterest;
import com.example.assignmenttwo_fragments.Fragments.Swapping;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnArea, btnPalindrome, btnSI, btnArmstrong, btnAuto, btnSwap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnArea=findViewById(R.id.btnArea);
        btnArmstrong = findViewById(R.id.btnArmstrong);
        btnAuto = findViewById(R.id.btnAuto);
        btnPalindrome = findViewById(R.id.btnPalindrome);
        btnSI = findViewById(R.id.btnSI);
        btnSwap = findViewById(R.id.btnSwap);

        btnArea.setOnClickListener(this);
        btnArmstrong.setOnClickListener(this);
        btnAuto.setOnClickListener(this);
        btnPalindrome.setOnClickListener(this);
        btnSI.setOnClickListener(this);
        btnSwap.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        switch (v.getId()) {
            case R.id.btnArea:
                AreaOfCircle areaOfCircle = new AreaOfCircle();
                fragmentTransaction.replace(R.id.fragmentContainer, areaOfCircle);
                fragmentTransaction.commit();
                break;

            case R.id.btnPalindrome:
                Palindrome palindrome= new Palindrome();
                fragmentTransaction.replace(R.id.fragmentContainer, palindrome);
                fragmentTransaction.commit();
                break;

            case R.id.btnSI:
                SimpleInterest simpleInterest= new SimpleInterest();
                fragmentTransaction.replace(R.id.fragmentContainer, simpleInterest);
                fragmentTransaction.commit();
                break;

            case R.id.btnArmstrong:
                Armstrong armstrong= new Armstrong();
                fragmentTransaction.replace(R.id.fragmentContainer, armstrong);
                fragmentTransaction.commit();
                break;

            case R.id.btnAuto:
                Automorphic automorphic= new Automorphic();
                fragmentTransaction.replace(R.id.fragmentContainer, automorphic);
                fragmentTransaction.commit();
                break;

            case R.id.btnSwap:
                Swapping swapping= new Swapping();
                fragmentTransaction.replace(R.id.fragmentContainer, swapping);
                fragmentTransaction.commit();
                break;

        }

    }


}
