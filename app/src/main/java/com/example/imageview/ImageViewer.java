package com.example.imageview;

import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class ImageViewer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        getIncomingImage();

    }

    private void getIncomingImage(){
        if(getIntent().hasExtra("image")){
            String imageUrl = getIntent().getStringExtra("image");

            ImageView image = findViewById(R.id.image_view);
            Glide.with(this)
                        .asBitmap()
                        .load(imageUrl)
                        .into(image);

        }
    }
}
