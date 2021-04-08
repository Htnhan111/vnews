package com.example.vnews.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.vnews.R

class Fragment_khampha: Fragment() {

    override fun onCreateView(inflater : LayoutInflater, container : ViewGroup?, savedInstanceState : Bundle?) : View {
        val view = inflater.inflate(R.layout.fragment_khampha, container, false)
        return view
    }
}