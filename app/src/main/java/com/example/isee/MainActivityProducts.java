package com.example.isee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import classes.detecterProduits;

public class MainActivityProducts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_products);
        detecterProduits Produits=new detecterProduits();
        Context context=getApplicationContext();
        Produits.detected(context);

    }
}