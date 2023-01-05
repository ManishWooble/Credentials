package com.example.credentials;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;

import com.example.credentials.databinding.ActivitySocialMediaBinding;

import java.util.Objects;

public class Social_Media_Activity extends AppCompatActivity {
ActivitySocialMediaBinding binding;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySocialMediaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_bakground));
        actionBar.setTitle("Social Media");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_button);
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}