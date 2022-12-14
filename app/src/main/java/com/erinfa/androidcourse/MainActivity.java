package com.erinfa.androidcourse;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.erinfa.androidcourse.TextView.TextViewMainActivity;
import com.erinfa.androidcourse.databinding.ActivityMainBinding;
import com.erinfa.androidcourse.databinding.ActivityTextViewMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_main);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        View view=binding.getRoot();
        setContentView(view);
        binding.TextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent textViewIntent=new Intent(MainActivity.this, TextViewMainActivity.class);
                startActivity(textViewIntent);



            }
        });
    }
}