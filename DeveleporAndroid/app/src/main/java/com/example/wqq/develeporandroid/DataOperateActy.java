package com.example.wqq.develeporandroid;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.wqq.develeporandroid.fragmenthoem.Frag01;
import com.example.wqq.develeporandroid.fragmenthoem.Frag02;
import com.example.wqq.develeporandroid.fragmenthoem.Frag03;

import java.util.ArrayList;

public class DataOperateActy extends BaseActivity {
    private ViewPager viewPager;
    private ArrayList<Fragment> arylFrgs;
    private Frag01 frg01;
    private Frag02 frag02;
    private Frag03 frag03;
    private fragmentPagerAdapter fragmentPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_operate);
        back();
        iniView();
    }

    public void iniView() {
        viewPager = (ViewPager) findViewById(R.id.vp);
        arylFrgs = new ArrayList<>();
        frg01 = new Frag01();
        frag02 = new Frag02();
        frag03 = new Frag03();
        arylFrgs.add(frg01);
        arylFrgs.add(frag02);
        arylFrgs.add(frag03);
        fragmentPagerAdapter=new fragmentPagerAdapter(getSupportFragmentManager(),arylFrgs);
        viewPager.setAdapter(fragmentPagerAdapter);


    }
    public class fragmentPagerAdapter extends FragmentPagerAdapter implements ViewPager.OnPageChangeListener{
    private ArrayList<Fragment> arrayListfrg;
        public fragmentPagerAdapter(FragmentManager fragmentManager,ArrayList<Fragment> arrayListfrg) {
          super(fragmentManager);
            this.arrayListfrg=arrayListfrg;
            ;
        }

        @Override
        public Fragment getItem(int position) {
            return arrayListfrg.get(position);
        }

        @Override
        public int getCount() {
            return arrayListfrg.size();
        }


        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    }
}