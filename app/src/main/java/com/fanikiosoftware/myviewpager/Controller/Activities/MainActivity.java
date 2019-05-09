package com.fanikiosoftware.myviewpager.Controller.Activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TableLayout;

import com.fanikiosoftware.myviewpager.Controller.Fragments.PageAdapter;
import com.fanikiosoftware.myviewpager.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //3 - Configure ViewPager
        this.configureViewPager();
    }

//  this method provides the connection between the ViewPager and the TabLayout
    private void configureViewPager() {
        // 1 - Get ViewPager from layout
        ViewPager pager = findViewById(R.id.activity_main_viewpager);
        // 2 - Set Adapter PageAdapter and glue it together
        pager.setAdapter(new PageAdapter(getSupportFragmentManager()));
//      get the TabLayout from the layout_main
        TabLayout tabs = findViewById(R.id.activity_main_tabs);
//      attach TabLayout and ViewPager
        tabs.setupWithViewPager(pager);
//      for the purpose of design, tabs have the same width
        tabs.setTabMode(TabLayout.MODE_FIXED);
        //Set Adapter PageAdapter and glue it together
    }
}