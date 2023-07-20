package com.example.tiktok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tiktok.databinding.ReelDesignBinding;

import org.jetbrains.annotations.NonNls;

import java.util.ArrayList;


public class Adapter extends RecyclerView.Adapter<Adapter.VideoHolder> {

    Context context;
    ArrayList<Model> modelArrayList = new ArrayList<>();

    public Adapter(Context context, ArrayList<Model> modelArrayList) {
        this.context = context;
        this.modelArrayList = modelArrayList;
    }

    @NonNull
    @Override
    public VideoHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType){
        View view = LayoutInflater.from(context).inflate(R.layout.reel_design, parent, false);
        return new VideoHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.VideoHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return modelArrayList.size();
    }


    public class  VideoHolder extends RecyclerView.ViewHolder(){
        ReelDesignBinding binding;
        public videoHolder(@NonNull view itemview){
            super(itemView);
            binding = ReelDesignBinding.bind(itemView);
        }

    }

}
