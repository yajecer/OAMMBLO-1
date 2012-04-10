package com.fr4gus.android.oammblo.ui;

import android.os.Bundle;
import android.view.View;

import com.fr4gus.android.oammblo.R;

public class DashBoardActivity extends OammbloActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);
    }

    public void openTimeline(View view) {
        startActivityByClass(TimelineActivity.class);
    }
}
