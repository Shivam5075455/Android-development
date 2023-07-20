package com.example.font;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import java.lang.reflect.Type;

public class MainActivity extends AppCompatActivity {

    TextView english, hindi, urdu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        english = findViewById(R.id.tvEnglish);
        hindi = findViewById(R.id.tvHindi);
        urdu = findViewById(R.id.tvUrdu);

        Typeface englishFont = Typeface.createFromAsset(getAssets(), "fonts/english.ttf");
        english.setTypeface(englishFont);
    }
}