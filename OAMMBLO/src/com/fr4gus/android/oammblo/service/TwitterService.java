package com.fr4gus.android.oammblo.service;

import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class TwitterService {
	Set<TwitterListener> listeners = new CopyOnWriteArraySet<TwitterListener>();

	public void addListener(TwitterListener listener) {
		listeners.add(listener);
	}

	public void removeListener(TwitterListener listener) {
		listeners.remove(listener);
	}

	public abstract void authenticate(String username, String password);

	public abstract List<String> getTimeline();
}
