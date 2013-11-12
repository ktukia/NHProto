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
import android.widget.LinearLayout;
import android.widget.TextView;


public class FieldActivity extends Activity {
	
	private Button taklaus;
	private Button laukaus;
	private Button maali;
	private Button torjunta;
	
	private LinearLayout kaukalo;
	private TextView era;
	
	private Paint paint = new Paint();
	private int color;
	private Canvas canvas;
	private Bitmap bitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_field);
        
        era = (TextView) findViewById(R.id.era_teksti);
        
        era.setText("ERÄ 1");
                
        kaukalo = (LinearLayout) findViewById(R.id.kaukalo);
        
        kaukalo.addView(new SurfaceView(this));
        bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.icehockey_field);
        canvas = new Canvas(bitmap);
        kaukalo.draw(canvas);
        
        
        
        taklaus = (Button) findViewById(R.id.taklaus);
        laukaus = (Button) findViewById(R.id.laukaus);
        maali = (Button) findViewById(R.id.maali);
        torjunta = (Button) findViewById(R.id.torjunta);
        
        kaukalo.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				// TODO Auto-generated method stub
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
