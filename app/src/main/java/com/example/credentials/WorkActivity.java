package com.example.credentials;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.PopupMenu;

import android.widget.SearchView;
import android.widget.Toast;


import com.example.credentials.databinding.ActivityWorkBinding;

import java.util.Objects;

public class WorkActivity extends AppCompatActivity {
ActivityWorkBinding binding;



    @SuppressLint("UseCompatLoadingForDrawables")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityWorkBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        ActionBar actionBar = getSupportActionBar();
        Objects.requireNonNull(actionBar).setBackgroundDrawable(getResources().getDrawable(R.drawable.action_bar_bakground));
        actionBar.setTitle("Works");

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_button);

        binding.work.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(WorkActivity.this, Work_viewer_Activity.class);

                startActivity(intent);
            }
        });

    }
    public void showPopupMenu(View view) {
        PopupMenu popupMenu=new PopupMenu(this,view);
        MenuInflater inflater=popupMenu.getMenuInflater();
        inflater.inflate(R.menu.popupmenu,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return onPopupMenuClick(item);
            }
        });
        popupMenu.show();

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            popupMenu.setForceShowIcon(true);
        }

        int positionOfMenuItem=1;
        MenuItem item = popupMenu.getMenu().getItem(positionOfMenuItem);
        SpannableString s=new SpannableString("Move to Trash");
        s.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.Trash)),0,s.length(),0);
        item.setTitle(s);
    }

    @SuppressLint("NonConstantResourceId")
    private boolean onPopupMenuClick(MenuItem item){
        switch (item.getItemId()){
            case R.id.edit:
                Intent intent=new Intent(WorkActivity.this, Edit_Work_Activity.class);
                startActivity(intent);
                break;
            case R.id.trash:
                Toast.makeText(this, "Move to Trash", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.search_menu,menu);
//        MenuItem menuItem=menu.findItem(R.id.action_search);
//        SearchView searchView=(SearchView) menuItem.getActionView();
//        searchView .setQueryHint("Type here to search");
//
//        searchView.setBackgroundResource(R.drawable.login_edittext_background);
//
//        searchView.setQueryHint("Type here to search");
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//            @Override
//            public boolean onQueryTextSubmit(String query) {
//                return false;
//            }
//
//            @Override
//            public boolean onQueryTextChange(String newText) {
//        arrayAdapter.getFilter().filter(newText);
//                return false;
//            }
//        });
//
//
//
//        return super.onCreateOptionsMenu(menu);
//    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.search_menu,menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}