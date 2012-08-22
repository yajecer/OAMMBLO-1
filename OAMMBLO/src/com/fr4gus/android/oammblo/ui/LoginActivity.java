package com.fr4gus.android.oammblo.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.fr4gus.android.oammblo.R;
import com.fr4gus.android.oammblo.service.TwitterListener;
import com.fr4gus.android.oammblo.service.TwitterService;
import com.fr4gus.android.oammblo.service.TwitterServiceFactory;

public class LoginActivity extends Activity {
	// Button mLoginButton;
	EditText mUsername;
	EditText mPassword;
	TwitterService mService = TwitterServiceFactory.getService();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);

		// mLoginButton = (Button) findViewById(R.id.login_button);
		mUsername = (EditText) findViewById(R.id.login_username);
		mPassword = (EditText) findViewById(R.id.login_password);
		//
		// mLoginButton.setOnClickListener(new View.OnClickListener() {
		//
		// public void onClick(View v) {
		// }
		// });

		mService.addListener(new MyTwitterListener());
	}

	public void doAuthenticate(View view) {
		new Thread() {
			public void run(){
				mService.authenticate(mUsername.getText().toString(), mPassword
						.getText().toString());
			}
		}.start();
	}

	private class MyTwitterListener implements TwitterListener {

		public void onAunthentication(boolean success) {
			if (success) {
				startActivity(new Intent(LoginActivity.this,
						TimelineActivity.class));
			} else {
				Toast.makeText(getApplicationContext(), "Error",
						Toast.LENGTH_LONG).show();
			}
		}

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_login, menu);
		return true;
	}
}
