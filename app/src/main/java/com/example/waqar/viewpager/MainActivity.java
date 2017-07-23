package com.example.waqar.viewpager;


import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager= (ViewPager) findViewById(R.id.viewPager);
        FragmentManager fm=getSupportFragmentManager();
        FragmentAdapter fa=new FragmentAdapter(fm);
        viewPager.setAdapter(fa);
    }
}
