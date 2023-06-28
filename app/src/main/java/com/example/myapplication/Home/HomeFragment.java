package com.example.myapplication.Home;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {

    FragmentHomeBinding binding;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentHomeBinding.inflate(inflater, container, false);

        binding.imgvPlus.setOnClickListener(v -> {
            startActivity(new Intent(this.getContext(), HomePlusActivity.class));
        });
        binding.svSearch.setOnClickListener(v -> {
            startActivity(new Intent(this.getContext(), HomeSearchActivity.class));
        });
        binding.imgvMore.setOnClickListener(v -> {
            startActivity(new Intent(this.getContext(), HomeMoreActivity.class));
        });
        binding.issues.setOnClickListener(v -> {
            startActivity(new Intent(this.getContext(), HomeIssuesActivity.class));
        });

        return binding.getRoot();
    }
}