/*******************************************************************************
 *     ClipCear - Exceedingly simple clipboard management app.
 *     Copyright © 2016 Sean Cassell.
 *
 *     Developer email: sean.cassell@outlook.com
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/

package net.seancassell.clipclear;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void handleBtnEraseClick (View view) {
		Vibrator HAPTIC_SIM = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
		HAPTIC_SIM.vibrate(50);
		ClipboardManager clipMgr = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
		clipMgr.setPrimaryClip(ClipData.newPlainText("", ""));
		Toast.makeText(getApplicationContext(), "The clipboard has been successfully erased.", Toast.LENGTH_LONG).show();
	}
}
