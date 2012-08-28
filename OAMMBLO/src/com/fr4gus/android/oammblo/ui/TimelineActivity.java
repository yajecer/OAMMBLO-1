package com.fr4gus.android.oammblo.ui;

import java.util.List;

import com.fr4gus.android.oammblo.R;
import com.fr4gus.android.oammblo.bo.Tweet;
import com.fr4gus.android.oammblo.service.TwitterService;
import com.fr4gus.android.oammblo.service.TwitterServiceFactory;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class TimelineActivity extends Activity {

	ListView mTimeline;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_timeline);

		mTimeline = (ListView) findViewById(R.id.timeline_list);
		TwitterService service = TwitterServiceFactory.getService();
		List<Tweet> tweets = service.getTimeline();
		mTimeline.setAdapter(new TimelineAdapter(this, tweets));
	}

	private static class TimelineAdapter extends BaseAdapter {
		List<Tweet> tweets;
		LayoutInflater inflater;

		public TimelineAdapter(Context context, List<Tweet> tweets) {
			this.tweets = tweets;
			inflater = (LayoutInflater) context
					.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		}

		public int getCount() {
			return tweets.size();
		}

		public Object getItem(int position) {
			return tweets.get(position);
		}

		public long getItemId(int position) {
			return position;
		}

		public View getView(int position, View convertView, ViewGroup parent) {
			View view = inflater.inflate(R.layout.list_item_tweet, parent,
					false);

			TextView authorName = (TextView) view
					.findViewById(R.id.timeline_item_displayname);
			TextView content = (TextView) view
					.findViewById(R.id.timeline_tweet_content);

			Tweet tweet = (Tweet) getItem(position);

			authorName.setText(tweet.getAuthor().getDisplayName());
			content.setText(tweet.getContent());

			return view;
		}

	}
}
