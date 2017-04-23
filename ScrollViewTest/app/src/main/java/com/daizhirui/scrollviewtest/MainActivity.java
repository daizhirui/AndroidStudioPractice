package com.daizhirui.scrollviewtest;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void Button_onClick(){
        Intent intent = new Intent(MainActivity.this, ScrollViewActivity.class);
        startActivity(intent);
    }
}
