package com.cdfrlg.android.conscalc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainMenu extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);
        
        final Button buttonAddRecord = (Button) findViewById(R.id.buttonAddRecord);
        buttonAddRecord.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				Intent intent = new Intent(MainMenu.this, AddRecord.class);
				startActivity(intent);
			}
		});
        
        final Button buttonCalculateConsumption = (Button) findViewById(R.id.buttonCalculateConsumption);
        buttonCalculateConsumption.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				
			}
		});

        final Button buttonDeleteRecord = (Button) findViewById(R.id.buttonDeleteRecord);
        buttonDeleteRecord.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				
			}
		});

        final Button buttonEditRecord = (Button) findViewById(R.id.buttonEditRecord);
        buttonEditRecord.setOnClickListener(new View.OnClickListener() {			
			public void onClick(View v) {
				
			}
		});

    }
}
