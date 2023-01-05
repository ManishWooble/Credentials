package com.example.credentials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.annotation.SuppressLint;

import android.content.Intent;

import android.os.Bundle;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;



import com.example.credentials.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
ActivityMainBinding binding;

    private ActionBarDrawerToggle toggle;


    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_bakground));


        NavController navController= Navigation.findNavController(MainActivity.this,R.id.frame_layout);
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);


        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        toggle=new ActionBarDrawerToggle(this,binding.drawerLayout,R.string.start, R.string.close);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        binding.navigationDrawer.setNavigationItemSelectedListener(this);
         }

    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        toggle.onOptionsItemSelected(item);

        switch (item.getItemId()) {
            case R.id.setting:
               startActivity(new Intent(MainActivity.this,SettingActivity.class));
                break;

            case R.id.share:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                break;

            case R.id.social_media:
                startActivity(new Intent(MainActivity.this,Social_Media_Activity.class));
                break;

            case R.id.discover:
                Toast.makeText(this, "Discover", Toast.LENGTH_SHORT).show();
                break;

            case R.id.logout:
                Toast.makeText(this, "Logout", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }


    @SuppressLint("RestrictedApi")
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.home_popupmenu,menu);

        if(menu instanceof MenuBuilder){
            MenuBuilder m = (MenuBuilder) menu;
            m.setOptionalIconsVisible(true);
        }
        int positionOfMenuItem=4;
        MenuItem item = menu.getItem(positionOfMenuItem);
        SpannableString s=new SpannableString("Logout");
        s.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.Trash)),0,s.length(),0);
        item.setTitle(s);

        return true;
    }



    @SuppressLint("NonConstantResourceId")
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.navigation_profile:
                startActivity(new Intent(MainActivity.this,ProfileActivity.class));
                break;

            case R.id.navigation_template:
                Toast.makeText(this, "Template", Toast.LENGTH_SHORT).show();
                break;

            case R.id.navigation_edit_portfolio:
                startActivity(new Intent(MainActivity.this,Edit_Portfolio_Activity.class));
                break;

            case R.id.navigation_email_signature:
                Toast.makeText(this, "E-mail Signature", Toast.LENGTH_SHORT).show();
                break;

            case R.id.navigation_works:
                startActivity(new Intent(MainActivity.this, WorkActivity.class));
                break;
        }
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }


}