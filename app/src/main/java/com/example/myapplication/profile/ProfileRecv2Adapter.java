package com.example.myapplication.profile;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemProfileMenuRecvBinding;
import com.example.myapplication.databinding.ItemProfilePopularRecvBinding;

import java.util.ArrayList;

public class ProfileRecv2Adapter extends RecyclerView.Adapter<ProfileRecv2Adapter.ViewHolder> {

    ItemProfilePopularRecvBinding binding;
    ArrayList<Profile2DTO> list;

    public ProfileRecv2Adapter(ArrayList<Profile2DTO> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemProfilePopularRecvBinding.inflate(inflater, parent, false);
        return new ViewHolder(binding);
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder h, int i) {
        h.binding.prRpName.setText(list.get(i).getName());
        h.binding.prRpContent.setText(list.get(i).getContent());
        h.binding.prRpCnt.setText(list.get(i).getNum());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ItemProfilePopularRecvBinding binding;

        public ViewHolder(@NonNull ItemProfilePopularRecvBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }

    }
}

