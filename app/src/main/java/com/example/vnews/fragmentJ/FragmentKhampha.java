package com.example.vnews.fragmentJ;

import androidx.fragment.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.vnews.R;

public class FragmentKhampha extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d("asd", "khampha");
        View view = inflater.inflate(R.layout.fragment_khampha, container, false);
        return view;
    }
}
