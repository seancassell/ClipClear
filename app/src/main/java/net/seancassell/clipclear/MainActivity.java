/*******************************************************************************
 * Copyright © 2016 Sean Cassell. Licenced under GPLv3.
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
		HAPTIC_SIM.vibrate(100);
		ClipboardManager clipMgr = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
		clipMgr.setPrimaryClip(ClipData.newPlainText("", ""));
		Toast.makeText(getApplicationContext(), "The clipboard has been successfully erased.", Toast.LENGTH_LONG).show();
	}
}
