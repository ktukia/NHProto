package fin.nexthockey;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Color;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class FieldActivity extends Activity {
	
	private Button tackle;
	private Button laukaus;
	private Button maali;
	private Button torjunta;
	
	private ImageView kaukalo;
	private TextView era;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field);
        
        era = (TextView) findViewById(R.id.era_teksti);
        
        era.setText("ERÄ 1");
                
        kaukalo = (ImageView) findViewById(R.id.kaukalo);
        kaukalo.isClickable();
        
        taklaus = (Button) findViewById(R.id.taklaus);
        laukaus = (Button) findViewById(R.id.laukaus);
        maali = (Button) findViewById(R.id.maali);
        torjunta = (Button) findViewById(R.id.torjunta);
        
       taklaus.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			taklaus.setBackgroundColor(Color.BLUE);
		}
	});
       
       laukaus.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   		
   			laukaus.setBackgroundColor(Color.BLUE);
   		}
   	});
       
       maali.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			maali.setBackgroundColor(Color.BLUE);
   		}
   	});
       
       torjunta.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			torjunta.setBackgroundColor(Color.BLUE);
   		}
   	});
       
    } // onCreate()


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.field, menu);
        return true;
    }
    
}
