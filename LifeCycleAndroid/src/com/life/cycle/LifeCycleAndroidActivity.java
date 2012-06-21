package com.life.cycle;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

public class LifeCycleAndroidActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		Toast.makeText(this, "App onCreated", Toast.LENGTH_SHORT).show();
	}

	@Override
	public void onStart() {
		super.onStart();
		Toast.makeText(this, "on Start", Toast.LENGTH_SHORT).show();
		
	}

	@Override
	protected void onResume() {
		super.onResume();
		Toast.makeText(this, "on Resume", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onPause() {
		super.onPause();
		Toast.makeText(this, "on Pause", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onRestart() {
		super.onRestart();
		Toast.makeText(this, "on Restart", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onStop() {
		super.onStop();
		Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
	}
}