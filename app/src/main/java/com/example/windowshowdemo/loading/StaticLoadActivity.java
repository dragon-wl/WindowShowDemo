package com.example.windowshowdemo.loading;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.windowshowdemo.R;

/**
 * 静态进度条活动...
 */
public class StaticLoadActivity extends AppCompatActivity {

    private ProgressBar mProgressBar;
    private Button mBtnProgressBar;
    public static void show(Activity activity){
        Intent intent = new Intent(activity,StaticLoadActivity.class);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_static_load);
        initViews();
        initListener();
    }

    private void initListener() {
        mBtnProgressBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mProgressBar.getVisibility() == View.VISIBLE){
                    mProgressBar.setVisibility(View.GONE);
                }else {
                    mProgressBar.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void initViews() {
        mProgressBar = findViewById(R.id.progressbar);
        mBtnProgressBar = findViewById(R.id.btnProgressBar);
    }
}
