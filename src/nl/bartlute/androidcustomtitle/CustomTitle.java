package nl.bartlute.androidcustomtitle;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.Window;

public class CustomTitle extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_custom_title);
		getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.custom_title);
		
//		setProgressBarIndeterminateVisibility(true);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.custom_title, menu);
		return true;
	}

}
