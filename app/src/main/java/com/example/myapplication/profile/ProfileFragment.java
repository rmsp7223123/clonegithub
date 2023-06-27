package com.example.myapplication.profile;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;
import com.example.myapplication.databinding.FragmentProfileBinding;
import com.example.myapplication.databinding.ItemProfileMenuRecvBinding;

public class ProfileFragment extends Fragment {

    FragmentProfileBinding binding ;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentProfileBinding.inflate(inflater, container, false);
        binding.recvMenu.setAdapter(new ProfileRecv1Adapter());
        binding.recvMenu.setLayoutManager(new LinearLayoutManager(getContext()));



        return binding.getRoot();
    }
}