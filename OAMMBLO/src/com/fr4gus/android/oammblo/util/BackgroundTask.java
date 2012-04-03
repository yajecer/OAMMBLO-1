package com.fr4gus.android.oammblo.util;

import android.os.Handler;

public abstract class BackgroundTask {
    protected Handler handler;

    public BackgroundTask() {
        handler = new Handler();
        
        new BackgroundThread().start();
    }

    public abstract void work();

    public abstract void done();

    public abstract void error(Throwable error);

    private class BackgroundThread extends Thread {
        boolean errorOcurred = false;

        Throwable err = null;

        public void run() {
            try {
                work();
            } catch (Throwable e) {
                errorOcurred = true;
                err = e;
            }

            handler.post(new Runnable() {

                @Override
                public void run() {
                    if (errorOcurred) {
                        error(err);
                    } else {
                        try {
                            done();
                        } catch (Throwable e) {
                            error(e);
                        }
                    }
                }
            });
        }
    }
}
