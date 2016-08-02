package com.example.z.p1;

import java.util.ArrayList;
import java.util.List;
import android.os.Bundle;
import android.app.Activity;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.z.p1.R;

public class user extends Activity implements
        android.view.View.OnClickListener {

    private ViewPager mViewPager;// 用来放置界面切换
    private PagerAdapter mPagerAdapter;// 初始化View适配器
    private List<View> mViews = new ArrayList<>();// 用来存放Tab01-04
    // 四个Tab，每个Tab包含一个按钮
    private LinearLayout mTabWeiXin;
    private LinearLayout mTabAddress;
    private LinearLayout mTabFrd;
    private LinearLayout mTabSetting;

    // 四个按钮
    private ImageButton mWeiXinImg;
    private ImageButton mAddressImg;
    private ImageButton mFrdImg;
    private ImageButton mSettingImg;

    @Override

    //  LayoutInflater mLayoutInflater = LayoutInflater.from(this);
    // LinearLayout layout1 = (LinearLayout)findViewById(R.id.gerenzhuye);


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.user);

        initView();
        initViewPage();
        initEvent();
    }

    private void initEvent() {
        mTabWeiXin.setOnClickListener(this);
        mTabAddress.setOnClickListener(this);
        mTabFrd.setOnClickListener(this);
        mTabSetting.setOnClickListener(this);
        mViewPager.setOnPageChangeListener(new OnPageChangeListener() {
            /**
             *ViewPage左右滑动时
             */
            @Override
            public void onPageSelected(int arg0) {
                int currentItem = mViewPager.getCurrentItem();
                //   mViewPager.setCurrentItem(currentItem);
                switch (currentItem) {
                    case 0:
                        resetImg();
                        mWeiXinImg.setImageResource(R.drawable.icon1);
                        break;
                    case 1:
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

    /**
     * 初始化设置
     */
    private void initView() {
        mViewPager = (ViewPager) findViewById(R.id.id_viewpage);
        // 初始化四个LinearLayout
        mTabWeiXin = (LinearLayout) findViewById(R.id.id_tab_1);
        mTabAddress = (LinearLayout) findViewById(R.id.id_tab_2);
        mTabFrd = (LinearLayout) findViewById(R.id.id_tab_3);
        mTabSetting = (LinearLayout) findViewById(R.id.id_tab_4);
        // 初始化四个按钮
        mWeiXinImg = (ImageButton) findViewById(R.id.id_tab_settings_img1);
        mAddressImg = (ImageButton) findViewById(R.id.id_tab_settings_img2);
        mFrdImg = (ImageButton) findViewById(R.id.id_tab_settings_img3);
        mSettingImg = (ImageButton) findViewById(R.id.id_tab_settings_img4);
    }

    /**
     * 初始化ViewPage
     */
    private void initViewPage() {

        // 初始化四个布局
        LayoutInflater mLayoutInflater = LayoutInflater.from(this);
        View tab01 = mLayoutInflater.inflate(R.layout.gerenzhuye, null);
        View tab02 = mLayoutInflater.inflate(R.layout.woyaoxiadan, null);
        View tab03 = mLayoutInflater.inflate(R.layout.wodedingdan, null);
        View tab04 = mLayoutInflater.inflate(R.layout.zuixinhuodong, null);

        mViews.add(tab01);
        mViews.add(tab02);
        mViews.add(tab03);
        mViews.add(tab04);

        // 适配器初始化并设置

        mPagerAdapter = new PagerAdapter() {

            @Override
            public void destroyItem(ViewGroup container, int position,
                                    Object object) {
                container.removeView(mViews.get(position));

            }

            @Override
            public Object instantiateItem(ViewGroup container, int position) {
                View view = mViews.get(position);
                container.addView(view);
                return view;
            }

            @Override
            public boolean isViewFromObject(View arg0, Object arg1) {

                return arg0 == arg1;
            }

            @Override
            public int getCount() {

                return mViews.size();
            }
        };
        //   mViews.setAdapter(mPagerAdapter);
        mViewPager.setAdapter(mPagerAdapter);
    }


    /**
     * 判断哪个要显示，及设置按钮图片
     */
    @Override
    public void onClick(View arg0) {

        switch (arg0.getId()) {
            case R.id.id_tab_1:
                mViewPager.setCurrentItem(0);
                resetImg();
                mWeiXinImg.setImageResource(R.drawable.icon1);
                break;
            case R.id.id_tab_2:
                mViewPager.setCurrentItem(1);
                resetImg();
                mAddressImg.setImageResource(R.drawable.icon2);
                break;
            case R.id.id_tab_3:
                mViewPager.setCurrentItem(2);
                resetImg();
                mFrdImg.setImageResource(R.drawable.icon3);
                break;
            case R.id.id_tab_4:
                mViewPager.setCurrentItem(3);
                resetImg();
                mSettingImg.setImageResource(R.drawable.icon4);
                break;
            default:
                break;
        }
    }

    /**
     * 把所有图片变暗
     */
    private void resetImg() {
        mWeiXinImg.setImageResource(R.drawable.icon11);
        mAddressImg.setImageResource(R.drawable.icon22);
        mFrdImg.setImageResource(R.drawable.icon33);
        mSettingImg.setImageResource(R.drawable.icon44);
    }

}