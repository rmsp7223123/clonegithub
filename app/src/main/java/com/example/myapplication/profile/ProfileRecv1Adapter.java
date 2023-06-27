package com.example.myapplication.profile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.databinding.ItemProfileMenuRecvBinding;

public class ProfileRecv1Adapter extends RecyclerView.Adapter<ProfileRecv1Adapter.ViewHolder> {

    ItemProfileMenuRecvBinding binding;

    public ProfileRecv1Adapter(ItemProfileMenuRecvBinding binding) {
        this.binding = binding;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        binding = ItemProfileMenuRecvBinding.inflate(inflater, parent, false );
        return new ProfileRecv1Adapter.ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 3;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ItemProfileMenuRecvBinding binding;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }

        public ViewHolder(ItemProfileMenuRecvBinding binding) {
            super(binding.getRoot());
            this.binding =binding;
        }
    }
}
