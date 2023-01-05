package com.example.credentials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.credentials.databinding.ActivitySettingBinding;

import java.util.Objects;

public class SettingActivity extends AppCompatActivity {

    ActivitySettingBinding binding;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivitySettingBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_bakground));
        actionBar.setTitle("");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_button);


        spantext();
    }

    private void spantext() {
        //Checkbox
        Spannable wordtoSpan1 = new SpannableString(binding.logout.getText().toString());


        int lengthOfString1=binding.logout.getText().toString().length();

        wordtoSpan1.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.Trash)), lengthOfString1-6, lengthOfString1, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);

        binding.logout.setText(wordtoSpan1);


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            onBackPressed();

        }

        switch (item.getItemId()) {
            case R.id.FAQ:
                Toast.makeText(this, "FAQ", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.setting_menu,menu);
        return true;
    }

//    @Override
//    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.setting:
//                Toast.makeText(this, "FAQ", Toast.LENGTH_SHORT).show();
//                break;
//        }
//        return true;
//    }


}