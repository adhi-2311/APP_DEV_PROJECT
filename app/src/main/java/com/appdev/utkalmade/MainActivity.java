package com.appdev.utkalmade;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.appdev.utkalmade.adapter.ProductAdapter;
import com.appdev.utkalmade.adapter.ProductCategoryAdapter;
import com.appdev.utkalmade.model.ProductCategory;
import com.appdev.utkalmade.model.Products;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ProductCategoryAdapter productCategoryAdapter;
    RecyclerView productCatRecycler, prodItemRecycler;
    ProductAdapter productAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ProductCategory> productCategoryList = new ArrayList<>();
        productCategoryList.add(new ProductCategory(1, "Trending"));
        productCategoryList.add(new ProductCategory(2, "Most Popular"));
        productCategoryList.add(new ProductCategory(3, "All Handloom Products"));
        productCategoryList.add(new ProductCategory(4, "Lacquer Work"));
        productCategoryList.add(new ProductCategory(5, "Stone Carvings"));
        productCategoryList.add(new ProductCategory(6, "Pottery"));

        setProductRecycler(productCategoryList);

        List<Products> productsList = new ArrayList<>();
        productsList.add(new Products(1, "Patachitra of Naya Village", "1 PC", "$ 17.00","Patachitra of Naya village", R.drawable.card1, R.drawable.second1));
        productsList.add(new Products(2, "Durga Patachitra", "1 PC", "$ 25.00", "Odisha Patachitra depicting Goddess Durga",R.drawable.card2, R.drawable.second2));
        productsList.add(new Products(1, "Medinipur Patachitra", "1 PC", "$ 17.00", "Goddess Durga and her family in Medinipur Patachitra",R.drawable.card3, R.drawable.second3));
        productsList.add(new Products(2, "Radha Krishna Patachitra", "1 PC", "$ 25.00","Odisha Patachitra depicting Radha Krishna", R.drawable.card4, R.drawable.second4));

        setProdItemRecycler(productsList);

    }

    private void setProductRecycler(List<ProductCategory> productCategoryList){

        productCatRecycler = findViewById(R.id.cat_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        productCatRecycler.setLayoutManager(layoutManager);
        productCategoryAdapter = new ProductCategoryAdapter(this, productCategoryList);
        productCatRecycler.setAdapter(productCategoryAdapter);

    }

    private void setProdItemRecycler(List<Products> productsList){

        prodItemRecycler = findViewById(R.id.product_recycler);
        RecyclerView.LayoutManager layoutManager= new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        prodItemRecycler.setLayoutManager(layoutManager);
        productAdapter = new ProductAdapter(this, productsList);
        prodItemRecycler.setAdapter(productAdapter);

    }

}
