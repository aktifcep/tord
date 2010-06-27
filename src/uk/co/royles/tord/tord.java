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

public class tord extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

    }
}
