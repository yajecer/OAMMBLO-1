package com.fr4gus.android.oammblo.ui;

import com.fr4gus.android.oammblo.R;
import com.fr4gus.android.oammblo.util.BackgroundTask;
import com.fr4gus.android.oammblo.util.LogIt;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

/**
 * Shows App logo for few seconds.
 * 
 * @author Franklin Garcia
 * Created Mar 25, 2012
 */
public class SplashActivity extends OammbloActivity {
    public static final String TAG = SplashActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        LoginAsyncTask task = new LoginAsyncTask();
        task.execute();

        //        new BackgroundTask() {
        //            
        //            @Override
        //            public void work() {
        //                try {
        //                    Thread.sleep(2000);
        //                } catch (InterruptedException e) {
        //                    // do nothing
        //                }
        //                
        //            }
        //            
        //            @Override
        //            public void error(Throwable error) {
        //                // TODO Auto-generated method stub
        //                
        //            }
        //            
        //            @Override
        //            public void done() {
        //                startActivity(new Intent(SplashActivity.this, LoginActivity.class));
        //                finish();
        //            }
        //        };

    }

    class LoginAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... params) {
            long startTime = System.currentTimeMillis();
            try {
                //TODO Cargar base de datos
                LogIt.d(this, "Deteniendo hilo por 2 segundos", "en serio");
                //                Log.d(TAG, "Deteniendo hilo por 2 segundos");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }

            long endTime = System.currentTimeMillis();

            long delay = endTime - startTime;

            
            return null;
        }

        @Override
        protected void onPostExecute(Void result) {
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            finish();
        }

        @Override
        protected void onPreExecute() {
            // TODO Auto-generated method stub
            super.onPreExecute();
        }

    }

}
