package com.example.credentials;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.credentials.databinding.FragmentBlogsBinding;


public class BlogsFragment extends Fragment {
    FragmentBlogsBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      binding=FragmentBlogsBinding.inflate(inflater, container, false);


        requireActivity().setTitle("Blogs");

        return binding.getRoot();
    }
}