package com.cdfrlg.android.conscalc;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class GetRegistration extends Activity {

	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_registration);
        
        final Button saveRegistrationButton = (Button) findViewById(R.id.buttonSaveRegistration);
        saveRegistrationButton.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				EditText editTextRegistration = (EditText) findViewById(R.id.editTextRegistration);
				String registrationNumber = editTextRegistration.getText().toString();
			
				// Save the registration string to the preferences file
				SharedPreferences settings = getSharedPreferences(Constants.PREFS_NAME, 0);
				SharedPreferences.Editor editor = settings.edit();
				editor.putBoolean(Constants.PREFS_REGISTRATION_IS_SET, true);
				editor.putString(Constants.PREFS_REGISTRATION_NUMBER, registrationNumber);
				editor.commit();
				
				Intent intent = new Intent(GetRegistration.this, MainMenu.class);
				startActivity(intent);
			}
        	
        });
    }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_splash_screen, menu);
		return true;
	}

}
