package com.anarchy.classifyview.sample.viewpager;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.anarchy.classifyview.R;
import com.anarchy.classifyview.databinding.FragmentViewpagerBinding;
import com.anarchy.classifyview.sample.normal.NormalFragment;

/**
 * Version 2.1.1
 * <p>
 * Date: 16/8/11 15:38
 * Author: zhendong.wu@shoufuyou.com
 * <p>
 * Copyright © 2014-2016 Shanghai Xiaotu Network Technology Co., Ltd.
 */
public class ViewPagerFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        FragmentViewpagerBinding binding = DataBindingUtil.inflate(inflater,R.layout.fragment_viewpager,container,false);
        binding.viewPager.setAdapter(new ViewPagerAdapter(getChildFragmentManager()));
        return binding.getRoot();
    }

    static class ViewPagerAdapter extends FragmentStatePagerAdapter{

        public ViewPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            return new NormalFragment();
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
