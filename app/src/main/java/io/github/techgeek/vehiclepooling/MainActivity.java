package io.github.techgeek.vehiclepooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    protected void offer(View v) {
        Intent myIntent = new Intent(this, OfferRide.class);
        startActivity(myIntent);

    }
    protected void find(View v) {
        Intent myIntent = new Intent(this, FindRide.class);
        startActivity(myIntent);
    }
}
