package com.example.credentials;



import androidx.appcompat.app.AppCompatActivity;


import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;



import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

import com.example.credentials.databinding.ActivityImageViewerBinding;

import java.util.Objects;

public class Image_Viewer_Activity extends AppCompatActivity {
ActivityImageViewerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityImageViewerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        registerForContextMenu(binding.menu);

        setSupportActionBar(binding.appBar);

        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);

        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_back_button);



//binding.btnRegister.setOnClickListener(new View.OnClickListener() {
//    @Override
//    public void onClick(View v) {
//        PopupMenu popupMenu=new PopupMenu(getApplicationContext(),v);
//        MenuInflater inflater=popupMenu.getMenuInflater();
//        inflater.inflate(R.menu.popupmenu, popupMenu.getMenu());
//        popupMenu.show();
//        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
//            @Override
//            public boolean onMenuItemClick(MenuItem item) {
//                switch (item.getItemId()){
//                    case R.id.edit:
//                        Toast.makeText(Image_Viewer_Activity.this, "Edit", Toast.LENGTH_SHORT).show();
//                        break;
//                    case R.id.trash:
//                        Toast.makeText(Image_Viewer_Activity.this, "Trash", Toast.LENGTH_SHORT).show();
//                        break;
//                }
//                return false;
//            }
//        });
//
//    }
//});



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

    private boolean onPopupMenuClick(MenuItem item){
         switch (item.getItemId()){
             case R.id.edit:
                 Toast.makeText(this, "Edit", Toast.LENGTH_SHORT).show();
                 break;
             case R.id.trash:
                 Toast.makeText(this, "Move to Trash", Toast.LENGTH_SHORT).show();
                 break;
         }
        return true;
    }


//    @Override
//    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
//        super.onCreateContextMenu(menu, v, menuInfo);
//        MenuInflater inflater=new MenuInflater(this);
//        inflater.inflate(R.menu.popupmenu,menu);
//    }
}
