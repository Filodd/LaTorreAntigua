package com.example.android.latorreantigua;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Hide Status Bar
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void submitBooking(View view) {
    // Email creation to reserve a table
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, "info@latorreantigua.it");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Reservation request!");
        intent.putExtra(Intent.EXTRA_TEXT, "Name:" + "\n" + "Reservation date: " + "\n" +
                "Number of people: " + "\n" + "Mobile number: " + "\n" + "Thank you!");
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

}





