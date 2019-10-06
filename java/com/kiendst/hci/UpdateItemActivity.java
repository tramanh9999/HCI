package com.kiendst.hci;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.kiendst.hci.fragments.CatalogFragment;

public class UpdateItemActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_item);
    }


    public void backToPrevious(View view) {
        this.finish();
    }
    boolean isAppear = false;
    public void selectCatalog(View view) {
        if(isAppear== false){
            isAppear = true;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.catalogChoose);
            Fragment fragment = new CatalogFragment();
            loadFragent(fragment);
        }else{
            isAppear = false;
            FrameLayout frameLayout = (FrameLayout) findViewById(R.id.catalogChoose);
            Fragment fragment = new Fragment();
            loadFragent(fragment);
        }



    }

    private boolean loadFragent(Fragment fragment) {
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
