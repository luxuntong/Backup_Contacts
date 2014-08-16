package com.backup_contacts;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login_activity);

		final Button LoginButton = (Button) findViewById(R.id.login_but);
		final EditText AccounText = (EditText) findViewById(R.id.input_account_num);
		final EditText PasswordText = (EditText) findViewById(R.id.input_password);
		final TextView FindPassword = (TextView) findViewById(R.id.find_assword);
		final TextView Regist = (TextView) findViewById(R.id.regist);

		LoginButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String Account = AccounText.getText().toString();
				String Passworld = PasswordText.getText().toString();
			}
		});
		FindPassword.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_for_passworld = new Intent(LoginActivity.this,
						FindPasswordActivity.class);
				startActivity(intent_for_passworld);

			}
		});

		Regist.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent_for_regist = new Intent(LoginActivity.this,
						RegistActivity.class);
				startActivity(intent_for_regist);
			}
		});

	}

}
