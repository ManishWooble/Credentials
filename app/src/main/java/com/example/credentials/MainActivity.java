package com.example.credentials;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.credentials.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
ActivityMainBinding binding;

    private ActionBarDrawerToggle toggle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBar);

      Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);


        NavController navController= Navigation.findNavController(MainActivity.this,R.id.frame_layout);
        NavigationUI.setupWithNavController(binding.bottomNavigation, navController);

        toggle=new ActionBarDrawerToggle(this,binding.drawerLayout,R.string.start, R.string.close);
        toggle.getDrawerArrowDrawable().setColor(getResources().getColor(R.color.white));
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        binding.navigationDrawer.setNavigationItemSelectedListener(this);    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        toggle.onOptionsItemSelected(item);
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

            case R.id.navigation_projects:
                Toast.makeText(this, "Projects", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {
        super.onPointerCaptureChanged(hasCapture);
    }
}