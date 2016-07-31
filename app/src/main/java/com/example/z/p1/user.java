package com.example.z.p1;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;

public class user extends FragmentActivity {
    private ViewPager mVPActivity;
    private gerenzhuye mFragment1;
    private woyaoxiadan mFragment2;
    private wodedingdan mFragment3;
    private zuixinhuodong mFragment4;
    private List<Fragment> mListFragment;
    private PagerAdapter mPgAdapter;
    private ImageButton mWeiXinImg;
    private ImageButton mAddressImg;
    private ImageButton mFrdImg;
    private ImageButton mSettingImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user);
        initView();
        initEvent();
    }

    private void initView() {

            mListFragment = new ArrayList<>();
            mVPActivity = (ViewPager) findViewById(R.id.id_viewpage);
            mFragment1 = new gerenzhuye();
            mFragment2 = new woyaoxiadan();
            mFragment3 = new wodedingdan();
            mFragment4 = new zuixinhuodong();
            mListFragment.add(mFragment1);
            mListFragment.add(mFragment2);
            mListFragment.add(mFragment3);
            mListFragment.add(mFragment4);
            mPgAdapter = new ViewPagerAdapter(getSupportFragmentManager(),
                    mListFragment);
            mVPActivity.setAdapter(mPgAdapter);
        // 初始化四个按钮
        mWeiXinImg = (ImageButton) findViewById(R.id.id_tab_settings_img1);
        mAddressImg = (ImageButton) findViewById(R.id.id_tab_settings_img2);
        mFrdImg = (ImageButton) findViewById(R.id.id_tab_settings_img3);
        mSettingImg = (ImageButton) findViewById(R.id.id_tab_settings_img4);

    }

    private void initEvent() {

       // mFragment1.setOnClickListener(this);
      //  mFragment2.setOnClickListener(this);
       // mFragment3.setOnClickListener(this);
      //  mFragment4.setOnClickListener(this);
        mVPActivity.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            /**
             *ViewPage左右滑动时
             */
            @Override
            public void onPageSelected(int arg0) {
                Log.d("user", "This is Debug.");

                int currentItem = mVPActivity.getCurrentItem();
                switch (currentItem) {

                    case 0:
                        resetImg();
                        mWeiXinImg.setImageResource(R.drawable.icon1);
                        break;
                    case 1:
                        Log.d("user", "This is Debug.");
                        resetImg();
                        mAddressImg.setImageResource(R.drawable.icon2);
                        break;
                    case 2:
                        resetImg();
                        mFrdImg.setImageResource(R.drawable.icon3);
                        break;
                    case 3:
                        resetImg();
                        mSettingImg.setImageResource(R.drawable.icon4);
                        break;
                    default:
                        break;
                }
            }

            @Override
            public void onPageScrolled(int arg0, float arg1, int arg2) {

            }

            @Override
            public void onPageScrollStateChanged(int arg0) {

            }
        });
    }


    public void showtab1()
    {
        mVPActivity.setCurrentItem(0);
        resetImg();
        mWeiXinImg.setImageResource(R.drawable.icon1);
    }
    public void showtab2()
    {
        //Toast.makeText(user.this, "" + "关于", Toast.LENGTH_SHORT).show();
        mVPActivity.setCurrentItem(1);
        resetImg();
        mWeiXinImg.setImageResource(R.drawable.icon2);
    }
    public void showtab3()
    {
        mVPActivity.setCurrentItem(2);
        resetImg();
        mWeiXinImg.setImageResource(R.drawable.icon3);
    }
    public void showtab4()
    {
        mVPActivity.setCurrentItem(3);
        resetImg();
        mWeiXinImg.setImageResource(R.drawable.icon4);
    }
    public void onClick(View arg0) {

        switch (arg0.getId()) {
            case R.id.id_tab_1:
                Log.d("user", "This is Debug.");
                mVPActivity.setCurrentItem(0);
                resetImg();
                mWeiXinImg.setImageResource(R.drawable.icon1);
                break;
            case R.id.id_tab_2:
                mVPActivity.setCurrentItem(1);
                resetImg();
                mAddressImg.setImageResource(R.drawable.icon2);
                break;
            case R.id.id_tab_3:
                mVPActivity.setCurrentItem(2);
                resetImg();
                mFrdImg.setImageResource(R.drawable.icon3);
                break;
            case R.id.id_tab_4:
                mVPActivity.setCurrentItem(3);
                resetImg();
                mSettingImg.setImageResource(R.drawable.icon4);
                break;
            default:
                break;
        }
    }

    private void resetImg() {
        mWeiXinImg.setImageResource(R.drawable.icon11);
        mAddressImg.setImageResource(R.drawable.icon22);
        mFrdImg.setImageResource(R.drawable.icon33);
        mSettingImg.setImageResource(R.drawable.icon44);
    }

}
