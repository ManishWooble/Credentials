package com.example.credentials;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;

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

import com.example.credentials.databinding.FragmentBlogsBinding;


public class BlogsFragment extends Fragment {
    FragmentBlogsBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding=FragmentBlogsBinding.inflate(inflater, container, false);

        requireActivity().setTitle("Blogs");

        binding.menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup(v);
            }


        });

        return binding.getRoot();
    }

    private void showPopup(View v) {

        PopupMenu popupMenu=new PopupMenu(getActivity(),v);
        MenuInflater inflater=popupMenu.getMenuInflater();
        inflater.inflate(R.menu.popupmenu,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                return onPopupMenuClick(item) ;
            }
        });
        popupMenu.show();

        if (Build.VERSION.SDK_INT>=Build.VERSION_CODES.Q){
            popupMenu.setForceShowIcon(true);
        }

        int positionOfMenuItem=1;
        MenuItem item=popupMenu.getMenu().getItem(positionOfMenuItem);
        SpannableString s=new SpannableString("Move to Trash");
        s.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.Trash)),0,s.length(),0);
        item.setTitle(s);
    }

    private boolean onPopupMenuClick(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.edit:
                Toast.makeText(getActivity(), "Edit", Toast.LENGTH_SHORT).show();
                break;
            case R.id.trash:
                Toast.makeText(getActivity(), "Move to Trash", Toast.LENGTH_SHORT).show();
                break;
        }
return true;
    }

}