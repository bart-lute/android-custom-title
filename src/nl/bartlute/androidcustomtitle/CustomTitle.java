package nl.bartlute.androidcustomtitle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class CustomTitle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_custom_title);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.custom_title, menu);
		return true;
	}

}
