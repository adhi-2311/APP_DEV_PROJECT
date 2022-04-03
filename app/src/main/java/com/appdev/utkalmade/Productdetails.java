package com.appdev.utkalmade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Productdetails extends AppCompatActivity {

    ImageView img;
    TextView proName, proPrice, proDesc, proQty, proUnit;

    String name, price, desc, qty, unit;
    int image;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productdetails);
        Intent i = getIntent();

        name = i.getStringExtra("name");
        image = i.getIntExtra("image", R.drawable.second3);
        price = i.getStringExtra("price");
        desc = i.getStringExtra("desc");

        proName = findViewById(R.id.productName);
        proPrice = findViewById(R.id.prodPrice);
        proDesc = findViewById(R.id.prodDesc);
        img = findViewById(R.id.big_image);

        proName.setText(name);
        proPrice.setText(price);
        proDesc.setText(desc);
        img.setImageResource(image);

    }
}
