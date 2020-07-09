package com.kuuhaku.tuxapps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        setActionBarTitle();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
    }

    private void setActionBarTitle() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About");
        }
    }
}
