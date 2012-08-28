package com.fr4gus.android.oammblo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fr4gus.android.oammblo.bo.Tweet;
import com.fr4gus.android.oammblo.bo.User;

import android.os.Handler;
import android.util.Log;

public class InMemoryTwitterService extends TwitterService {
	public static final String TAG = InMemoryTwitterService.class
			.getSimpleName();

	Handler handler = new Handler();

	public void authenticate(String username, String password) {
		try {
			Thread.sleep(500);
			Log.d(TAG, "User " + username + " request authentication");
			handler.post(new Runnable() {

				public void run() {
					for (TwitterListener listener : listeners) {
						listener.onAunthentication(true);
					}
				}
			});
		} catch (InterruptedException ignore) {
		}
	}

	public List<Tweet> getTimeline() {
		List<Tweet> tweets = new ArrayList<Tweet>();
		tweets.add(new Tweet(new User("001", "John Doe"), "Hacia la casa",
				new Date()));
		tweets.add(new Tweet(new User("001", "John Doe"), "Hay presa :(",
				new Date()));
		tweets.add(new Tweet(new User("002", "Mary Doe"), "@jdoe :'(",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Mi gato se escapo",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Mi gato se escapo",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Mi gato se escapo",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Mi gato se escapo",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Mi gato se escapo",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Mi gato se escapo",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Mi gato se escapo",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Who?",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "What?",
				new Date()));
		tweets.add(new Tweet(new User("003", "Juan P"), "Lorem Ipsum",
				new Date()));
		return tweets;
	}

}
