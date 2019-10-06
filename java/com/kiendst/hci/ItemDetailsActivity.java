package com.kiendst.hci;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ItemDetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_detail);
    }


    public  void clickToUpdate(View view){
        Intent intent = new Intent(this, UpdateItemActivity.class);
        startActivity(intent);
    }
}
