package com.example.credentials;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;


import com.example.credentials.databinding.ActivityEditPortfolioBinding;

import java.util.Objects;

public class Edit_Portfolio_Activity extends AppCompatActivity {
ActivityEditPortfolioBinding binding;
    String designation;
    String[] item1 ,item2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityEditPortfolioBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_button);



        item1 = new String[]{"Choose your Profession", "Student", "Software Developer", "Video Editor", "Researcher",
                "Marketing Strategist", "Architect", "Fashion Designer", "CEO/Founder", "Other"};


     binding.professionCategory.setAdapter(new ArrayAdapter<String>(this,R.layout.spinner_list,item1));



        binding.professionCategory.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                designation=binding.professionCategory.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });



        item2=new String[]{"Add Links", "Wooble Links", "Whatsapp Link", "LinkedIn Link", "Instagram Link", "Twitter Link", "Youtube Link"};


        binding.addLinks.setAdapter(new ArrayAdapter<String>(this, R.layout.spinner_list,item2));

        binding.addLinks.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                designation=binding.addLinks.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


        SpannableString content = new SpannableString( binding.more.getText().toString() ) ;
        content.setSpan( new UnderlineSpan(), 0, content.length(), 0) ;
        binding.more.setText(content);
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}