package com.example.kosdimana;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class KosanAdapter extends RecyclerView.Adapter<KosanAdapter.ViewHolder> {

    private static final String TAG = "KosanAdapter";

    private Context mContext;
    private ArrayList<String> mImageNames = new ArrayList<>();
    private ArrayList<String> mImages = new ArrayList<>();
    private ArrayList<String> mImageAddress = new ArrayList<>();
    private ArrayList<String> mImageLocations = new ArrayList<>();
    private ArrayList<String> mImagePhones = new ArrayList<>();

    public KosanAdapter(Context mContext, ArrayList<String> mImageNames,
                        ArrayList<String> mImages, ArrayList<String> mImageAddress,
                        ArrayList<String> mImageLocations, ArrayList<String> mImagePhones) {
        this.mContext = mContext;
        this.mImageNames = mImageNames;
        this.mImages = mImages;
        this.mImageAddress = mImageAddress;
        this.mImageLocations = mImageLocations;
        this.mImagePhones = mImagePhones;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(mContext)
                .asBitmap()
                .load(mImages.get(position))
                .into(holder.image);

        holder.imageName.setText(mImageNames.get(position));
        holder.imageAddress.setText(mImageAddress.get(position));
        holder.imageLocation.setText(mImageLocations.get(position));
        holder.imagePhone.setText(mImagePhones.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: click on: " + mImageNames.get(position));
                Toast.makeText(mContext, mImageNames.get(position), Toast.LENGTH_SHORT).show();

                Log.d(TAG, "onClick: click on: " + mImageAddress.get(position));
                Toast.makeText(mContext, mImageAddress.get(position), Toast.LENGTH_SHORT).show();

                Log.d(TAG, "onClick: click on " + mImageLocations.get(position));
                Toast.makeText(mContext, mImageLocations.get(position), Toast.LENGTH_SHORT).show();

                Log.d(TAG, "onClick: click on: " + mImagePhones.get(position));
                Toast.makeText(mContext, mImagePhones.get(position), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, DetailActivity.class);
                intent.putExtra("image_url", mImages.get(position));
                intent.putExtra("image_name", mImageNames.get(position));
                intent.putExtra("image_address", mImageAddress.get((position)));
                intent.putExtra("image_locations", mImageLocations.get(position));
                intent.putExtra("image_phone", mImagePhones.get(position));

                mContext.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mImageNames.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView image;
        TextView imageName;
        TextView imageAddress;
        TextView imageLocation;
        TextView imagePhone;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            imageName = itemView.findViewById(R.id.image_name);
            imageAddress = itemView.findViewById(R.id.image_address);
            imageLocation = itemView.findViewById(R.id.image_locations);
            imagePhone = itemView.findViewById(R.id.image_phone);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }
}
