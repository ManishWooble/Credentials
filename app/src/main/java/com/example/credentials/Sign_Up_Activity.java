package com.example.credentials;


import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;

import android.view.View;


import com.example.credentials.databinding.ActivitySignUpBinding;

import java.util.Objects;

public class Sign_Up_Activity extends AppCompatActivity {
ActivitySignUpBinding binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).hide();


        
        spantext();



        binding.gotoSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Sign_Up_Activity.this, Sign_In_Activity.class));
            }
        });

       binding.ivBack.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent=new Intent(Sign_Up_Activity.this, IntroActivity.class);
               startActivity(intent);
               finish();
           }
       });
    }



    private void spantext() {

        //Checkbox
        Spannable wordtoSpan1 = new SpannableString(binding.checkbox.getText().toString());
        StyleSpan boldStyle1 = new StyleSpan(Typeface.BOLD);

        int lengthOfString1=binding.checkbox.getText().toString().length();

        wordtoSpan1.setSpan(new ForegroundColorSpan(Color.WHITE), lengthOfString1-18, lengthOfString1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        binding.checkbox.setText(wordtoSpan1);

        // GotoSign in
        Spannable wordtoSpan2 = new SpannableString(binding.gotoSignIn.getText().toString());
        StyleSpan boldStyle2 = new StyleSpan(Typeface.BOLD);

        int lengthOfString2=binding.gotoSignIn.getText().toString().length();

        wordtoSpan2.setSpan(new ForegroundColorSpan(Color.WHITE), lengthOfString2-7, lengthOfString2, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        binding.gotoSignIn.setText(wordtoSpan2);


    }



}