package com.example.credentials;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.NavigationUI;


import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Gravity;
import android.view.LayoutInflater;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupMenu;
import android.widget.Toast;


import com.example.credentials.databinding.FragmentHomeBinding;


public class HomeFragment extends Fragment {
FragmentHomeBinding binding;


    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding=FragmentHomeBinding.inflate(getLayoutInflater(), container, false);


        requireActivity().setTitle("Home");




//        binding.menu.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                PopupMenu popupMenu=new PopupMenu(getContext(),v);
//                MenuInflater inflater=popupMenu.getMenuInflater();
//                inflater.inflate(R.menu.home_popupmenu,popupMenu.getMenu());
//
//                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//                    @Override
//                    public boolean onMenuItemClick(MenuItem item) {
//                        return onPopupMenuClick(item);
//                    }
//                });
//                popupMenu.show();
//
//                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//                    popupMenu.setForceShowIcon(true);
//                }
//
//                int positionOfMenuItem=1;
//                MenuItem item = popupMenu.getMenu().getItem(positionOfMenuItem);
//                SpannableString s=new SpannableString("Move to Trash");
//                s.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.Trash)),0,s.length(),0);
//                item.setTitle(s);
//
//
//            }
//        });
//
     return binding.getRoot();
   }




//    @SuppressLint("NonConstantResourceId")
//    private boolean onPopupMenuClick(MenuItem item) {
//        switch (item.getItemId()){
//            case R.id.setting:
//                Toast.makeText(getActivity(), "Setting", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.share:
//                Toast.makeText(getActivity(), "Share", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.social_media:
//                Toast.makeText(getActivity(), "Social Media", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.discover:
//                Toast.makeText(getActivity(), "Discover", Toast.LENGTH_SHORT).show();
//                break;
//            case R.id.logout:
//                Toast.makeText(getActivity(), "Logout", Toast.LENGTH_SHORT).show();
//                break;
//        }
//        return true;
//    }



}