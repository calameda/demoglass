package es.upm.dit.holamundo;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.glass.widget.CardBuilder;


public class GlassActivity extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		CardBuilder card = new CardBuilder(this,CardBuilder.Layout.TEXT);
		card.setText("Hola Mundo!");
		card.setFootnote("Carlos");
		setContentView(card.getView());
	}
}
