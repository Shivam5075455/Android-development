package com.example.memes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.memes.databinding.ActivityMainBinding;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        create a array for images
        int arr[] = {
                R.drawable.emotionaldamage,
                R.drawable.endofworld,
                R.drawable.googlemap,
                R.drawable.kyakaru,
                R.drawable.techsupport
        };
//set default image
        binding.imageView.setImageResource(arr[0]);
// change image on click button
        binding.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
        int temp = arr.length;
        Random random = new Random();
        int number = random.nextInt(temp);
                Toast.makeText(MainActivity.this, number+"", Toast.LENGTH_SHORT).show();
        binding.imageView.setImageResource(arr[number]);

            }
        });

    }
}