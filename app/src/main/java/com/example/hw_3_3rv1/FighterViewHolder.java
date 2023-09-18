package com.example.hw_3_3rv1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class FighterViewHolder extends RecyclerView.ViewHolder {

    private ImageView ivPhoto;
    private TextView tvName;
    public FighterViewHolder(@NonNull View itemView) {
        super(itemView);

        ivPhoto = itemView.findViewById(R.id.im_photo);
        tvName = itemView.findViewById(R.id.tv_names);


    }
    public void bind(int fighterPhoto, String fighterName){
        ivPhoto.setImageDrawable(ContextCompat.getDrawable(ivPhoto.getContext(), fighterPhoto));
        tvName.setText(fighterName);
    }
}
