package com.example.isee;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView imgProducts, imgShopping, imgGuide, imgMoney;
    ImageView imglogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgGuide=findViewById(R.id.imgGuideMe);
        imgProducts=findViewById(R.id.imgProducts);
        imgShopping=findViewById(R.id.imgShopping);
        imglogin=findViewById(R.id.imgLogin);
        imgMoney=findViewById(R.id.imgMoney);
        imgMoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(), MainActivityMoney.class);
                startActivity(intent);
            }
        });
        imglogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),MainActivityLogin.class);
                startActivity(intent);
            }
        });
        imgGuide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivityGuideMe.class);
                startActivity(intent);
            }
        });
        imgShopping.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),MainActivityShopping.class);
                startActivity(intent);
            }
        });
        imgProducts.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivityProducts.class);
                startActivity(intent);
            }
        });

    }
}