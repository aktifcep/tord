package uk.co.royles.tord;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;


	public class DaresActivity extends Activity {
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);

	        TextView textview = new TextView(this);
	        textview.setText("This is the Dares tab");
	        setContentView(textview);
	    }
	}