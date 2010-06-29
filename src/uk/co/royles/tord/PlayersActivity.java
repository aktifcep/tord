/** copyright(c) 2010 Brett Royles
     	This file is part of Truth or Dare.

    Truth or Dare is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    Truth or Dare is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with Truth or Dare in the file COPYING
    If not, see <http://www.gnu.org/licenses/>.
 */
package uk.co.royles.tord;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;


public class PlayersActivity extends Activity {
	    public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
 
	        setContentView(R.layout.playerstab);
		    Spinner spinner = (Spinner) findViewById(R.id.player1sex);
		    ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
		            this, R.array.sex_array, android.R.layout.simple_spinner_item);
		    adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
		    spinner.setAdapter(adapter);
		    spinner.setOnItemSelectedListener(new SexSelectedListener());

		    Spinner s2 = (Spinner) findViewById(R.id.player2sex);
	        adapter = ArrayAdapter.createFromResource(this, R.array.sex_array,
	                android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        s2.setAdapter(adapter);
	        s2.setOnItemSelectedListener(new SexSelectedListener());
	        
		    Spinner s3 = (Spinner) findViewById(R.id.player3sex);
	        adapter = ArrayAdapter.createFromResource(this, R.array.sex_array,
	                android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        s3.setAdapter(adapter);
	        s3.setOnItemSelectedListener(new SexSelectedListener());
	        
		    Spinner s4 = (Spinner) findViewById(R.id.player4sex);
	        adapter = ArrayAdapter.createFromResource(this, R.array.sex_array,
	                android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        s4.setAdapter(adapter);
	        s4.setOnItemSelectedListener(new SexSelectedListener());
	        
		    Spinner s5 = (Spinner) findViewById(R.id.player5sex);
	        adapter = ArrayAdapter.createFromResource(this, R.array.sex_array,
	                android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        s5.setAdapter(adapter);
	        s5.setOnItemSelectedListener(new SexSelectedListener());
	        
		    Spinner s6 = (Spinner) findViewById(R.id.player6sex);
	        adapter = ArrayAdapter.createFromResource(this, R.array.sex_array,
	                android.R.layout.simple_spinner_item);
	        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	        s6.setAdapter(adapter);
	        s6.setOnItemSelectedListener(new SexSelectedListener());
	    }
	
}
