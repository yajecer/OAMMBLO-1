package com.fr4gus.android.oammblo.service;

import java.util.ArrayList;
import java.util.List;

import android.os.Handler;
import android.util.Log;

public class InMemoryTwitterService extends TwitterService {
	public static final String TAG = InMemoryTwitterService.class
			.getSimpleName();

	Handler handler = new Handler();

	public void authenticate(String username, String password) {
		try {
			Thread.sleep(10000);
			Log.d(TAG, "User " + username + " request authentication");
			handler.post(new Runnable() {
				
				public void run() {
					for (TwitterListener listener : listeners) {
						listener.onAunthentication(false);
					}
				}
			});
		} catch (InterruptedException ignore) {
		}
	}

	public List<String> getTimeline() {
		List<String> result = new ArrayList<String>();
		result.add("Tweet 1");
		result.add("Tweet 2");
		return result;
	}

}
