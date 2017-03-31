package com.huangjifeng.fragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setDefaultFragment();


    }

    private void setDefaultFragment() {
        android.app.FragmentManager fragmentManger = getFragmentManager();
        FragmentTransaction transaction = fragmentManger.beginTransaction();

    }

    public void onButtonClick(View view) {
        switch (view.getId()) {
            case R.id.button_01:
                break;
            case R.id.button_02:
                break;
            case R.id.button_03:
                break;
            case R.id.button_04:
                break;

        }
    }
}
