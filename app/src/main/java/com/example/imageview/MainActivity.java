package com.example.imageview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

//        set the layout manager

    private RecyclerView.LayoutManager layoutManager ;

    private MyAdapter mAdapter;

    ArrayList<String> images = new ArrayList<>();
    ArrayList<String> image_names = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        load images
        initialImages();

//        Find the recyclerView
        recyclerView = findViewById(R.id.image_list);
        recyclerView.setHasFixedSize(true);

        layoutManager = new GridLayoutManager(this, 2, recyclerView.VERTICAL, false);
        recyclerView.setLayoutManager(layoutManager);

//        set the adapter
        mAdapter = new MyAdapter(images,image_names,this);
        recyclerView.setAdapter(mAdapter);
    }

//    method fetching images and their names

    private void initialImages(){
        images.add("https://opinionhall.com/wp-content/uploads/2018/07/weird-bug-makes-samsung-phones-text-random-photos-to-random-people.jpg");
        image_names.add("Joel");
        images.add("https://pbs.twimg.com/profile_images/645308753420533760/LVuQyAtK.jpg");
        image_names.add("George");
        images.add("https://www.sololearn.com/Icons/Avatars/827743.jpg");
        image_names.add("Ragit");
        images.add("http://chrisbusse.com/images/busse-256px.jpg");
        image_names.add("Bruse");
        images.add("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRaOJEAXM2Buo5zbtpLNnx35Whojg047RaVN9Wqh_cmoJaoqVoL");
        image_names.add("Meghane");
        images.add("https://lh6.googleusercontent.com/-CiKRizFmokk/AAAAAAAAAAI/AAAAAAAAbng/f8NkvgI4apw/photo.jpg");
        image_names.add("Lucas");
        images.add("https://css-weekly.com/wp-content/uploads/2015/01/martin-lenngren.jpg");
        image_names.add("Josh");
        images.add("https://www.rasmussen.edu/-/media/images/blog/authors/callie-malvik.jpg?h=256&w=256&la=en&hash=CAFC6D4BEC2F976BB6E02529C37C74652BFCA305");
        image_names.add("Helen");
        images.add("https://secure.gravatar.com/avatar/ab29f2af3d2ec0c24910490046d8736b?s=256&d=mm&r=g");
        image_names.add("Heidi");
        images.add("https://i.pinimg.com/474x/aa/70/78/aa7078671217cd09c09ee7add6e37376--handsome-boys-china.jpg");
        image_names.add("Chan");
        images.add("https://secure.gravatar.com/avatar/0cc9ac95914b9f88a81ab565d9c7925c?s=128&d=identicon&r=g");
        image_names.add("Carol");
        images.add("http://bhangrateamsforum.com/a/data/avatars/m/1/1144.jpg?1510629640");
        image_names.add("Raj");
        images.add("https://secure.gravatar.com/avatar/df7553a5f85677c904a27d102b09183d?s=256&d=mm&r=g");
        image_names.add("Nick");
        images.add("https://iapp.org/media/headshots/0011a00000DlO9KAAV.png");
        image_names.add("Greg");
    }
}
