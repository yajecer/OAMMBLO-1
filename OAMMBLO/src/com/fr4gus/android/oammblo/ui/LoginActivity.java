package com.fr4gus.android.oammblo.ui;

import android.os.Bundle;
import android.view.View;

import com.fr4gus.android.oammblo.R;

public class LoginActivity extends OammbloActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }

    public void login(View view) {
        startActivityByClass(DashBoardActivity.class);
    }
}
