package com.wilis.database1;

import android.app.Activity;
import android.os.Bundle;

public class database1 extends Activity {
    /** Called when the activity is first created. */
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        DBAdapter db = new DBAdapter(this);

        //---add 3 titles---
        db.open();        
        long id;
        id = db.insertTitle(
        		"1234512345",
        		"Android Programmer's Reference",
        		"Washington Press");        
        id = db.insertTitle(
        		"5432112345",
        		"Linux Programming",
        		"Bandung Press");
        id = db.insertTitle(
        		"0987654321",
        		"Android Devlopment Life Cycle",
        		"Hongkong Press");
        db.close();
    }

}
