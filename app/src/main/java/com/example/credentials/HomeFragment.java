package com.example.credentials;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
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




        return binding.getRoot();
    }

//    public void showPopupMenu(View view) {
//
//        PopupMenu popupMenu=new PopupMenu(getContext(),view);
//        MenuInflater inflater=popupMenu.getMenuInflater();
//        inflater.inflate(R.menu.popupmenu,popupMenu.getMenu());
//
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                return onPopupMenuClick(item);
//            }
//
//        });
//        popupMenu.show();
//
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
//            popupMenu.setForceShowIcon(true);
//        }
//
//        int positionOfMenuItem=1;
//        MenuItem item = popupMenu.getMenu().getItem(positionOfMenuItem);
//        SpannableString s=new SpannableString("Logout");
//        s.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.Trash)),0,s.length(),0);
//        item.setTitle(s);
//    }


//
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