package fin.nexthockey;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class FieldActivity extends Activity {
	
	private Button taklaus;
	private Button laukaus;
	private Button maali;
	private Button torjunta;
	
	private RelativeLayout kaukalo;
	private TextView era;
	private int color = 5;
	private ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field);
        
        era = (TextView) findViewById(R.id.era_teksti);
        
        era.setText("ERÄ 1");
        
                
        kaukalo = (RelativeLayout) findViewById(R.id.kaukalo);
           
        taklaus = (Button) findViewById(R.id.taklaus);
        laukaus = (Button) findViewById(R.id.laukaus);
        maali = (Button) findViewById(R.id.maali);
        torjunta = (Button) findViewById(R.id.torjunta);
        iv = new ImageView(this);

        
        kaukalo.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				kaukalo.removeAllViews();
				int x = Math.round(event.getX());
				int y = Math.round(event.getY());
				RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(10,10);
				params.leftMargin = x;
				params.topMargin = y;
				iv.setBackgroundResource(R.drawable.piste);
				kaukalo.addView(iv, params);
				kaukalo.bringChildToFront(iv);
				
				return false;
			}
		});
        
       taklaus.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			taklaus.setBackgroundColor(Color.BLUE);
			
			color = 1;
		}
	});
       
       laukaus.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   		
   			laukaus.setBackgroundColor(Color.BLUE);
   			
   			color = 2;
   		}
   	});
       
       maali.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			maali.setBackgroundColor(Color.BLUE);
   			
   			color = 3;
   		}
   	});
       
       torjunta.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			torjunta.setBackgroundColor(Color.BLUE);
   			
   			color = 4;
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
