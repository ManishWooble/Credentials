package com.example.credentials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.credentials.databinding.ActivitySocialMediaBinding;

import java.util.Objects;

public class Social_Media_Activity extends AppCompatActivity {
ActivitySocialMediaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySocialMediaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_button);
    }
}