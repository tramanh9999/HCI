package com.kiendst.hci;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.kiendst.hci.adapters.SliderAdapter;
import com.kiendst.hci.fragments.AddNewItemFragment;
import com.kiendst.hci.fragments.CatalogFragment;
import com.kiendst.hci.fragments.ChattingFragment;
import com.kiendst.hci.fragments.HomeFragment;
import com.kiendst.hci.fragments.NotificationFragment;
import com.kiendst.hci.fragments.ProfileFragment;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.IndicatorView.draw.controller.DrawController;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView bottom_navigation = findViewById(R.id.bottom_navigation);
        bottom_navigation.setOnNavigationItemSelectedListener(this);
        loadFragent(new HomeFragment());// Default fragment load


    }


    public void clickToOpenChat(View view) {
        Intent intent = new Intent(this, ChattingActivity.class);
        startActivity(intent);
    }

    private boolean loadFragent(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }


    public void nhapmagiamgia(View view) {

        Toast.makeText(this, "Giao dịch thành công", Toast.LENGTH_LONG).show();
        TextView soluong = findViewById(R.id.num);


        int num = Integer.parseInt(soluong.getText().toString()) - 1;
        soluong.setText(num + "");


        EditText nhapma= findViewById(R.id.nhapma);
        nhapma.setText("");
    }


    public void clickToViewGood(View view) {
        Intent intent = new Intent(this, GoodDetailActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.navigation_addNew:
                fragment = new AddNewItemFragment();
                break;
            case R.id.navigation_notification:
                fragment = new NotificationFragment();
                break;
            case R.id.navigation_chatting:
                fragment = new ChattingFragment();
                break;
            case R.id.navigation_profile:
                fragment = new ProfileFragment();
                break;
            default:
                fragment = new HomeFragment();
        }
        return loadFragent(fragment);
    }

    public void   thongtinsanpham(View view) {
        Intent intent = new Intent(this, ItemDetailsActivity.class);
        startActivity(intent);
    }
    public void clickToAddNew(View view) {
        Intent intent = new Intent(this, ItemDetailsActivity.class);
        Toast.makeText(this, "Thêm mới thành công !", Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    boolean isAppear = false;

    public void selectCatalog(View view) {
        if (isAppear == false) {
            isAppear = true;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.catalogChoose_add);
            Fragment fragment = new CatalogFragment();
            loadFragmentCatalog(fragment);
        } else {
            isAppear = false;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.catalogChoose_add);
            Fragment fragment = new Fragment();
            loadFragmentCatalog(fragment);
        }


    }

    private boolean loadFragmentCatalog(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.catalogChoose, fragment)
                    .commit();
            return true;
        }
        return false;
    }


}
