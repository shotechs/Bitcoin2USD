package com.shotechs.bitcoin2usd;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;

public class MainActivity extends Activity {
	Button quit;
	
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        //start_btn start
        Button start = (Button) findViewById(R.id.start);
        
        start.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				startActivity(new Intent(MainActivity.this, page2.class));
				Log.d("shotech", "start button was clicked");
				return false;
				
			}
		});
        //start_btn end
        
        
        //quit_btn start
        quit = (Button) findViewById(R.id.quit);
       
       quit.setOnTouchListener(new OnTouchListener() {
    		public boolean onTouch(View v, MotionEvent event) {
    			finish();
    			
    			return false;
    		}
    	});
       //quit_btn end
       
       
       //developer start
       Button developer = (Button) findViewById(R.id.developer);
       
       developer.setOnTouchListener(new OnTouchListener() {
    		public boolean onTouch(View v, MotionEvent event) {
    			
    			Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://shomobile.6te.net"));
    			startActivity(browserIntent);
    			//startActivity(new Intent(Test2Activity.this, developer.class));
    			return false;
    		}
    	});
       //developer end
        
        
        
    }

   
    
    
    
    
    
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
