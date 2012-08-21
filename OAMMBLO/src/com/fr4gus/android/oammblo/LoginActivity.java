package com.fr4gus.android.oammblo;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoginActivity extends Activity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        
        Button btnl = (Button)findViewById(R.id.btnLogin);
        btnl.setOnClickListener(this);
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_login, menu);
        return true;
    }

	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		finish();
		
		Intent intent = new Intent(LoginActivity.this, TimelineActivity.class);
		startActivity(intent);
	
	}
    
}
