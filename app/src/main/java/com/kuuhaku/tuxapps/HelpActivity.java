package com.kuuhaku.tuxapps;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class HelpActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        setActionBarTitle();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
    }

    private void setActionBarTitle() {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Help");
        }
    }
}
