package com.example.kosdimana;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView intentCall;
    private static final String TAG = "DetailActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        intentCall = findViewById(R.id.image_call);
        intentCall.setOnClickListener(this);

        Log.d(TAG, "onCreate: started.");

        getIncomingIntent();
    }

    private void getIncomingIntent() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intnts.");
        if (getIntent().hasExtra("image_url") && getIntent().hasExtra("image_name")
                && getIntent().hasExtra("image_address")) {
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String imageUrl = getIntent().getStringExtra("image_url");
            String imageName = getIntent().getStringExtra("image_name");
            String imageAddress = getIntent().getStringExtra("image_address");

            setImage(imageUrl, imageName, imageAddress);
        }
    }

    private void setImage(String imageUrl, String imageName, String imageAddress) {
        Log.d(TAG, "setImage: setting to image and name to widgets.");

        TextView name = findViewById(R.id.image_descrpition);
        name.setText(imageName);
        TextView address = findViewById(R.id.image_address);
        address.setText(imageAddress);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(image);

    }

    @Override
    public void onClick(View v) {
        //Dial
        Intent implicit = new Intent(Intent.ACTION_DIAL);
        implicit.setData(Uri.parse("tel:082312345644"));
        startActivity(implicit);
    }
}
