package com.example.demo.cardlistview;

import android.app.Application;
import android.content.Context;



public class DemoAppMain extends Application {
	
	 public final static int ID_OPTION1 = 0;
	 public final static int  ID_OPTION2 = 1;
    	 public static Context mContext;
	
    	

@Override
public void onCreate() {

	 super.onCreate();
	mContext = this;
 

}

public static Context getContext(){
    return mContext;
}




}
