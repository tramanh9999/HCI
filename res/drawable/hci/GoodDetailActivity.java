package com.kiendst.hci;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.kiendst.hci.fragments.ProfileFragment;

public class GoodDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.good_detail);
    }

    public void backToPrevious(View view) {
        this.finish();
    }


    public void  clickToProfile(View view){
        Intent intent = new Intent(this, ProfileFragment.class);
        startActivity(intent);
    }
}
