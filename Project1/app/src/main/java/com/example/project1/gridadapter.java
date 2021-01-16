package com.example.project1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class gridadapter extends ArrayAdapter<String> {
    private final Context context;
    private final String[] brands;
    private final Integer[] logos;
    public gridadapter(Context context, String[] brands, Integer[] logos){
        super(context,R.layout.custom_grid_item, brands);
        this.context= context;
        this.brands=brands;
        this.logos=logos;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater= (LayoutInflater)getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowview= inflater.inflate(R.layout.custom_grid_item, null, true);
        ImageView logoimg= rowview.findViewById(R.id.gridimg);
        TextView logtxt= rowview.findViewById(R.id.gridtxt);

        logtxt.setText(brands[position]);
        logoimg.setImageResource(logos[position]);
        return rowview;


    }
}
