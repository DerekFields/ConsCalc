package com.cdfrlg.android.conscalc;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;

public class SplashScreen extends Activity {

	private TimerTask delayTask;
	private Timer myTimer;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        
        myTimer = new Timer();
        delayTask = new TimerTask() {

			@Override
			public void run() {
				SharedPreferences settings = getSharedPreferences(Constants.PREFS_NAME, 0);
				boolean registrationIsSet = settings.getBoolean(Constants.PREFS_REGISTRATION_IS_SET, false);
				
				Log.i(Constants.LOG_TAG, "is Registration set in splash screen = " + registrationIsSet);
				
				if (registrationIsSet) {
					myTimer.cancel();
					Intent intent = new Intent(SplashScreen.this, MainMenu.class);
					startActivity(intent);
				} else {
					myTimer.cancel();
					Intent intent = new Intent(SplashScreen.this, GetRegistration.class);
					startActivity(intent);
				}
			}
        	
        };

        myTimer.schedule(delayTask, 2000);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash_screen, menu);
        return true;
    }
}
