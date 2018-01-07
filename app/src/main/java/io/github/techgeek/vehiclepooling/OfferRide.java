package io.github.techgeek.vehiclepooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OfferRide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offer_ride);
    }
    protected void next(View v) {
        Intent myIntent = new Intent(this, DriverSettingsActivity.class);
        startActivity(myIntent);

    }
}
