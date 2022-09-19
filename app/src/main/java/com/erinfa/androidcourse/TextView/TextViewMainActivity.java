package com.erinfa.androidcourse.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.erinfa.androidcourse.R;
import com.erinfa.androidcourse.databinding.ActivityTextViewMainBinding;

public class TextViewMainActivity extends AppCompatActivity {
   ActivityTextViewMainBinding binding;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_text_view_main);
        binding = ActivityTextViewMainBinding.inflate(getLayoutInflater());
        View view= binding.getRoot();
        setContentView(view);


    }
}