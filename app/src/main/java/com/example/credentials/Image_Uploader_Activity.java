package com.example.credentials;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.credentials.databinding.ActivityImageUploaderBinding;

import java.util.Objects;

public class Image_Uploader_Activity extends AppCompatActivity {
ActivityImageUploaderBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityImageUploaderBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_button);
    }
}