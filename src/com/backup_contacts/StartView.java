package com.backup_contacts;

import android.R.integer;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class StartView extends Activity {

	private final int START_TIME = 3000;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub

		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_view);

		new Handler().postDelayed(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Intent intent = new Intent(StartView.this, LoginActivity.class);
				StartView.this.startActivity(intent);
				StartView.this.finish();
			}
		}, START_TIME);
	}

}
