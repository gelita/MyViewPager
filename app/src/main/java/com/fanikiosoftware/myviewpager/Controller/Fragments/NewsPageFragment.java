package com.fanikiosoftware.myviewpager.Controller.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.fanikiosoftware.myviewpager.R;

public class NewsPageFragment extends Fragment {

    public NewsPageFragment(){
    }

    public static NewsPageFragment newInstance() {
        return (new NewsPageFragment());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_page_news, container, false);
    }
}