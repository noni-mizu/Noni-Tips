package com.example.nonitips;

import java.math.BigDecimal;
import java.math.RoundingMode;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText originalBill;
	private double billWithTip; 
	private String billString;
	private TextView finalBill;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) { 
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		originalBill = (EditText)findViewById(R.id.originalBill);
	}
	
	//Use of "onClick" in layout that activates onTen, etc., so don't need any event listeners
	public void onTen (View v) {
		//Toast.makeText(this, "Tipping at 10%", Toast.LENGTH_SHORT).show();
		
				double bill = Double.parseDouble(originalBill.getText().toString());
				billWithTip = bill * 1.10;
				//Rounds the answer to 2 decimal places only
				BigDecimal roundedBill = new BigDecimal(billWithTip);     
				roundedBill = roundedBill.setScale(2,RoundingMode.UP);
				//Turns the answer back into a string
				billString = String.valueOf(roundedBill);
				finalBill = (TextView)findViewById(R.id.finalBill);
				finalBill.setText(billString);
	} 
	
	public void onFifteen (View v) {
		//Toast.makeText(this, "Tipping at 15%", Toast.LENGTH_SHORT).show();
		
					double bill = Double.parseDouble(originalBill.getText().toString());
					billWithTip = bill * 1.15;
					//Rounds the answer to 2 decimal places only
					BigDecimal roundedBill = new BigDecimal(billWithTip);     
					roundedBill = roundedBill.setScale(2,RoundingMode.UP);
					//Turns the answer back into a string
					billString = String.valueOf(roundedBill);
					finalBill = (TextView)findViewById(R.id.finalBill);
					finalBill.setText(billString);
	}

	public void onTwenty (View v) {
		//Toast.makeText(this, "Tipping at 20%", Toast.LENGTH_SHORT).show();

					double bill = Double.parseDouble(originalBill.getText().toString());
					billWithTip = bill * 1.20;
					//Rounds the answer to 2 decimal places only
					BigDecimal roundedBill = new BigDecimal(billWithTip);     
					roundedBill = roundedBill.setScale(2,RoundingMode.UP);
					billString = String.valueOf(roundedBill);
					finalBill = (TextView)findViewById(R.id.finalBill);
					finalBill.setText(billString);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {

		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

}
