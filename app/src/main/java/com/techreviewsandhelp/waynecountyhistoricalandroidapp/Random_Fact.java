package com.techreviewsandhelp.waynecountyhistoricalandroidapp;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Created by crua9 on 10/25/2015.
 */
public class Random_Fact extends Activity {

    /**
     *
     * This class is for the Random Fact page. In the page, a random fact should show up.
     * Depending on the fact, a picture should show up based on the fact.
     *
     * Need some facts to see how much space is needed.
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.random_fact);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        /**
         * Need to make it where if they user clicks on the pic, it brings up the pic in full screen.
         *
         * Maybe need to make the pic a but bigger.
         */

}}
