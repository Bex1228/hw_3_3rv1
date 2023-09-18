package com.example.hw_3_3rv1;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FighterAdapter extends RecyclerView.Adapter<FighterViewHolder> {

    private ArrayList <Fighter> fighterList;

    public FighterAdapter(ArrayList<Fighter> fighterList) {
        this.fighterList = fighterList;
    }

    @NonNull
    @Override
    public FighterViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FighterViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_fighters, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FighterViewHolder holder, int position) {
        Fighter fighter = fighterList.get(position);
        holder.bind(fighter.getImageDrawable(), fighter.getName());
    }

    @Override
    public int getItemCount() {
        return fighterList.size();
    }
}
