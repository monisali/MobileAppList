package cct.mad.lab;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

public class MainActivity extends Activity {
	
	private ListView listView1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Players players_data[] = new Players[]
		        {
		            new Players(R.drawable.friedel, "B. Friedel"),
		            new Players(R.drawable.dawson, "M.Dawson"),
		            new Players(R.drawable.walker, "K. Walker"),
		            new Players(R.drawable.ekotto, "B. Ekotto"),
		            new Players(R.drawable.vertonghen, "J. Vertongen"),
		            new Players(R.drawable.parker, "S. Parker"),
		            new Players(R.drawable.sandro, "Sandro"),
		            new Players(R.drawable.lennon, "A. Lennon"),
		            new Players(R.drawable.bale, "G. Bale"),
		            new Players(R.drawable.dembele, "M. Dembele"),
		            new Players(R.drawable.defoe, "J. Defoe")
		        };
		
		PlayersAdapter adapter = new PlayersAdapter(this, R.layout.list_item, players_data);
		
		listView1 = (ListView) findViewById(R.id.listView1);
		
		View header = (View)getLayoutInflater().inflate(R.layout.header_row, null);
		listView1.addHeaderView(header);
		listView1.setAdapter(adapter);	
		
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
