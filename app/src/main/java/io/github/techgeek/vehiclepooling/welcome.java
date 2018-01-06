package io.github.techgeek.vehiclepooling;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
    }
    protected void login(View view) {
        Intent myIntent = new Intent(this, LoginActivity.class);
        startActivity(myIntent);


    }

}
