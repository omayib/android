package contoh.checkBox;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class CheckboxActivity extends Activity implements OnCheckedChangeListener {
	
	CheckBox cb;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		cb = (CheckBox) findViewById(R.id.check);
		cb.setChecked(false);
		cb.setText("unchecked!");
		cb.setOnCheckedChangeListener(this);

	}

	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			cb.setText("checked!");
		} else {
			cb.setText("unchecked!");
		}
	}
}
