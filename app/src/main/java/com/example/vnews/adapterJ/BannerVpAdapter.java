package com.example.vnews.adapterJ;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.vnews.R;
import com.example.vnews.modelJ.Banner;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class BannerVpAdapter extends PagerAdapter {
    private Context context;
    private ArrayList<Banner> arrayBanner;

    public BannerVpAdapter(Context context, ArrayList<Banner> arrayBanner) {
        this.context = context;
        this.arrayBanner = arrayBanner;
    }

    @Override
    public int getCount() {
        return arrayBanner.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.dong_banner, null);

        ImageView ivBanner = view.findViewById(R.id.ivBanner);
        TextView tvTitle = view.findViewById(R.id.tvTitle);
        TextView tvNgayDang = view.findViewById(R.id.tvNgayDang);

        Picasso.with(context).load(arrayBanner.get(position).getImg()).into(ivBanner);
        tvTitle.setText(arrayBanner.get(position).getTitle());
        tvNgayDang.setText(arrayBanner.get(position).getNgayDang());

        ViewPager vp = (ViewPager) container;
        vp.addView(view, 0);

        return view;
    }
    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {

        ViewPager vp = (ViewPager) container;
        View view = (View) object;
        vp.removeView(view);

    }
}

