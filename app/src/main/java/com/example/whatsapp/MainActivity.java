package com.example.whatsapp;

import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity <viewpager> extends AppCompatActivity {

    private Toolbar mToolbar;
private viewpager myviewpager;
private TabLayout mytablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mToolbar=(Toolbar) findViewById(R.id.main_page_toolbar);
                setSupportActionBar(mToolbar);
                        getSupportActionBar().setTitle("whatsapp");


    }
}
