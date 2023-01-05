package com.example.credentials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;


import com.example.credentials.databinding.ActivityWorkViewerBinding;

import java.util.Objects;

public class Work_viewer_Activity extends AppCompatActivity {
ActivityWorkViewerBinding binding;
    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWorkViewerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_bakground));
        actionBar.setTitle("Work");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_button);

    }

    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.popupmenu,menu);

        if(menu instanceof MenuBuilder){
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        int positionOfMenuItem=1;
        MenuItem item = menu.getItem(positionOfMenuItem);
        SpannableString s=new SpannableString("Move to Trash");
        s.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.Trash)),0,s.length(),0);
        item.setTitle(s);

        return true;
    }
    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            onBackPressed();
        }

        switch (item.getItemId()) {
            case R.id.edit:
                Intent intent=new Intent(Work_viewer_Activity.this, Edit_Work_Activity.class);
                startActivity(intent);
                break;

            case R.id.trash:
                Toast.makeText(this, "Move to Trash", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

//    @Override
//    public boolean onSupportNavigateUp() {
//        onBackPressed();
//        return true;
//    }
}