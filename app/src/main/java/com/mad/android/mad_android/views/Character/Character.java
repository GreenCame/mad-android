package com.mad.android.mad_android.views.Character;

import android.support.design.widget.AppBarLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.mad.android.mad_android.R;

import com.mad.android.mad_android.views.ViewPagerAdapter;

public class Character extends AppCompatActivity {

    private android.support.design.widget.TabLayout TabLayoutId;
    private AppBarLayout AppBarId;
    private ViewPager ViewPagerId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        TabLayoutId = (android.support.design.widget.TabLayout) findViewById(R.id.TabLayoutId);
        AppBarId = (AppBarLayout) findViewById(R.id.AppBarId);
        ViewPagerId = (ViewPager) findViewById(R.id.ViewPagerId);

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new Ability(), "Abilities");
        adapter.AddFragment(new Attribute(), "Attributes");
        adapter.AddFragment(new Equipment(), "Equipment");

        ViewPagerId.setAdapter(adapter);
        TabLayoutId.setupWithViewPager(ViewPagerId);
    }
}
