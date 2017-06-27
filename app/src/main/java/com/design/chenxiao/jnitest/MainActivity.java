package com.design.chenxiao.jnitest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int i = 1;
        int j = 2;
        int xm = new NativeMoce().getHe(i, j);
        Toast.makeText(this, "i+j的和为：" + xm, Toast.LENGTH_SHORT).show();
    }


}
