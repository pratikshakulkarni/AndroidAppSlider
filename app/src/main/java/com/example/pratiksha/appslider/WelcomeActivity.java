package com.example.pratiksha.appslider;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewParent;
import android.widget.Adapter;

public class WelcomeActivity extends AppCompatActivity {
    private ViewPager mPager;
    private MyAdapter myAdapter;
    private int[] layouts = {R.layout.slide1,R.layout.slide2,R.layout.slide3,R.layout.slide4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

       mPager = (ViewPager)findViewById(R.id.viewPager);
       myAdapter = new MyAdapter(layouts,this);
       mPager.setAdapter(myAdapter);
    }

}
