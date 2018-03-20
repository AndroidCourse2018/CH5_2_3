package com.example.admin.ch5_2_3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;  // 使用Log類別方法顯示訊息

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CH5_2_3"; // 宣告常數 TAG

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}
