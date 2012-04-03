package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;
import com.fr4gus.android.oammblo.util.BackgroundTask;

import android.content.Intent;
import android.os.Bundle;

/**
 * Shows App logo for few seconds.
 * 
 * @author Franklin Garcia
 * Created Mar 25, 2012
 */
public class SplashActivity extends OammbloActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        
        new BackgroundTask() {
            
            @Override
            public void work() {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    // do nothing
                }
                
            }
            
            @Override
            public void error(Throwable error) {
                // TODO Auto-generated method stub
                
            }
            
            @Override
            public void done() {
                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                finish();
            }
        };
    }
   
}
