package io.github.techgeek.vehiclepooling;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FindRide extends AppCompatActivity {
    int quantity=1;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_ride);
    }
    public void increment(View view) {

        quantity = quantity + 1;
        displayQuantity(quantity);
    }
    public void decrement(View view) {
        if (quantity == 0) {
            return;
        }
        quantity = quantity - 1;
        displayQuantity(quantity);
    }
    private void displayQuantity(int numberOfCoffees) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.textView3);
        quantityTextView.setText("" + numberOfCoffees);
    }
    protected void next(View v) {
        Intent myIntent = new Intent(this, CustomerSettingsActivity.class);
        startActivity(myIntent);

    }
}
