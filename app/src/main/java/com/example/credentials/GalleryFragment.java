package com.example.credentials;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.credentials.databinding.FragmentGalleryBinding;


public class GalleryFragment extends Fragment {
    FragmentGalleryBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

      binding=FragmentGalleryBinding.inflate(inflater, container, false);

        requireActivity().setTitle("Gallery");

        return binding.getRoot();
    }
}