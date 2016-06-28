package com.shotechs.bitcoin2usd;



import java.io.IOException;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.select.*;
import org.jsoup.nodes.Document;


/**
 * This demonstrates how you can implement switching between the tabs of a
 * TabHost through fragments.  It uses a trick (see the code below) to allow
 * the tabs to switch between fragments instead of simple views.
 */
public class page2  extends Activity {


	EditText editText1;
	EditText editText2;
	EditText editText3;
	ImageButton imageButton1;
	static String substr;
	static double d;
	static Document doc;
	static String src;
	static JSONObject entry;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page2);
        
        
        editText1 = (EditText)findViewById(R.id.editText1);
        editText1.setText("50"); 
        
        editText2 = (EditText)findViewById(R.id.editText2);
        editText2.setText("0");
        
        
        editText3 = (EditText)findViewById(R.id.editText3);
        editText3.setText("g");
        
        
        
        String page = new page2().executeHttpGet("http://bitcoincharts.com/t/weighted_prices.json");
        JSONArray jsonArray;
		try {
			jsonArray = new JSONArray(page);
		       for (int i = 0 ; i < jsonArray.length(); i++ ) {
		           entry = (JSONObject) jsonArray.get(i);
		           // now get the data from each entry
		         }
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
			  
         editText3.setText(entry);
			 
		
				
		    
			
        //editText3.setText(substr); 
		//editText3.setText(src); 
				
		    
		    //System.out.println(substr);
		    //textField.setText(src);
		//<span id="MainContent_lblUnitPrice">$11.49 USD per BTC</span>
        
        
        
        //TextView.BufferType.EDITABLE;
       
        
        editText3 = (EditText)findViewById(R.id.editText3);


        
		
			

		

        
        
        
        
        
       
        addListenerOnButton();
        
        
}     // The function called to calculate and display the result of the multiplication
     private String executeHttpGet(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	private void calculateResult() throws NumberFormatException {
       // Gets the two EditText controls' Editable values
       Editable editableValue1 = editText1.getText(),
                editableValue2 = editText2.getText();

       
       
		
       
       
       // Initializes the double values and result
       double value1 = 0.0,
              value2 = d,
              result;

       
       // If the Editable values are not null, obtains their double values by parsing
       if (editableValue1 != null)
         value1 = Double.parseDouble(editableValue1.toString());
      
       if (editableValue2 != null)
         value2 = Double.parseDouble(editableValue2.toString());

       // Calculates the result
       result = value1 * value2;

       // Displays the calculated result
       //editText3.setText(result.toString());
       editText3.setText(String.valueOf(result));
     }
    

     public void addListenerOnButton() {
    	 
    	 ImageButton imageButton = (ImageButton) findViewById(R.id.imageButton1);
  
 		imageButton.setOnClickListener(new OnClickListener() {
  
 			public void onClick(View arg0) {
 				//String sUsername = editText1.getText().toString();
 				 //if (sUsername.matches("")){
 					//editText1.setText("0.0"); }
 				
 				calculateResult();
 				
 				
 			   Toast.makeText(page2.this,
 				"ImageButton is clicked!", Toast.LENGTH_SHORT).show();
  
 			}
  
 		});



     }


    } 
