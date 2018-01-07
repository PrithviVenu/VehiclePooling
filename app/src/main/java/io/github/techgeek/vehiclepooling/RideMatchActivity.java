package io.github.techgeek.vehiclepooling;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class RideMatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ride_match);
    }
    protected void bu1(View view) {
        Toast toast = Toast.makeText(this, "Booking confirmed", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void bu2(View view) {
        Toast toast = Toast.makeText(this, "Booking confirmed", Toast.LENGTH_LONG);
        toast.show();
    }
    protected void bu3(View view) {
        Toast toast = Toast.makeText(this, "Booking confirmed", Toast.LENGTH_LONG);
        toast.show();
    }

}
