package com.shotechs.bitcoin2usd;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class developer extends Activity {
	WebView myWebView;
	
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {

	    if (keyCode == KeyEvent.KEYCODE_BACK) {
	    	
	    	finish();
	        return false; // this avoids passing to super
	    }

	    return super.onKeyDown(keyCode, event);
	}
	
	
	 @Override
     public void onBackPressed() {
		 finish();
     	
			
     }
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.developer);
		
		//home_btn start
        Button home = (Button) findViewById(R.id.home);
        
        home.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				 finish();
				return false;
			}
		});
        //home_btn end
        
    
        
       
        
  
        
		//web view code start
		final WebView myWebView = (WebView) findViewById(R.id.webview);
		
		myWebView.getSettings().setJavaScriptEnabled(true);
		myWebView.setWebChromeClient(new WebChromeClient());
		myWebView.setWebViewClient(new HelloWebViewClient()
		    {
		        @Override  
		        public void onPageFinished(WebView view, String url)  
		        {  
		            //Calling an init method that tells the website, we're ready 
		        	myWebView.loadUrl("javascript:m2Init()");
		           // page1(myWebView);
		        }  
		    });
		
		
		myWebView.loadUrl("http://shomobile.6te.net");
		//web view code end
	}    
	
	private class HelloWebViewClient extends WebViewClient {
	    @Override
	    public boolean shouldOverrideUrlLoading(WebView view, String url) {
	        view.loadUrl(url);
	        return true;
	    }

	}

}
