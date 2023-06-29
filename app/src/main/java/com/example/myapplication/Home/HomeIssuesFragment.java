package com.example.myapplication.Home;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeIssuesBinding;

public class HomeIssuesFragment extends Fragment {

    FragmentHomeIssuesBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        binding = FragmentHomeIssuesBinding.inflate(inflater, container, false);
        return binding.getRoot();
    }
}