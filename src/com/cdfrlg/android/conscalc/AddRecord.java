package com.cdfrlg.android.conscalc;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AddRecord extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_record);

		final Calendar c = Calendar.getInstance();
		long date;
		String stringDate;

		date = c.getTimeInMillis();
		Date curDate = new Date(date);
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		stringDate = formatter.format(curDate);

		Log.i(Constants.LOG_TAG, "long date is " + date);
		Log.i(Constants.LOG_TAG, "date string is " + stringDate);
		
		final Button buttonAddRecordSave = (Button) findViewById(R.id.buttonAddRecordSave);
        buttonAddRecordSave.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				//save the record
				//redirects to MainMenu
				Intent intent = new Intent(AddRecord.this,MainMenu.class);
				startActivity(intent);
			}
		});

	}
}
