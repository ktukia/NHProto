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
	private int color = 0;
	private ImageView[] iv = new ImageView[4];
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
        iv[0] = new ImageView(this);
        iv[0].setBackgroundResource(R.drawable.piste);
        iv[1] = new ImageView(this);
        iv[1].setBackgroundResource(R.drawable.piste2);
        iv[2] = new ImageView(this);
        iv[2].setBackgroundResource(R.drawable.piste3);
        iv[3] = new ImageView(this);
        iv[3].setBackgroundResource(R.drawable.piste4);

        
        kaukalo.setOnTouchListener(new View.OnTouchListener() {
			
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				kaukalo.removeAllViews();
				int x = Math.round(event.getX());
				int y = Math.round(event.getY());
				RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(10,10);
				params.leftMargin = x;
				params.topMargin = y;
				
				kaukalo.addView(iv[color], params);
				//kaukalo.bringChildToFront(iv);
				
				return false;
			}
		});
        // Listenerit
       taklaus.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			taklaus.setBackgroundColor(Color.BLUE);
			
			color = 0;
		}
	});
       
       laukaus.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   		
   			laukaus.setBackgroundColor(Color.BLUE);
   			
   			color = 1;
   		}
   	});
       
       maali.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			maali.setBackgroundColor(Color.BLUE);
   			
   			color = 2;
   		}
   	});
       
       torjunta.setOnClickListener(new View.OnClickListener() {
   		
   		@Override
   		public void onClick(View v) {
   			// TODO Auto-generated method stub
   			torjunta.setBackgroundColor(Color.BLUE);
   			
   			color = 3;
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
