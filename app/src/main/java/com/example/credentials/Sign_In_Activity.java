package com.example.credentials;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import com.example.credentials.databinding.ActivitySignInBinding;

import java.util.Objects;

public class Sign_In_Activity extends AppCompatActivity {
ActivitySignInBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        binding=ActivitySignInBinding.inflate(getLayoutInflater());

        Objects.requireNonNull(getSupportActionBar()).hide();


        binding.ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Sign_In_Activity.this, IntroActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }


}