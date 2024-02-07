package edu.otc.segway;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btnRent);
//        button.setOnClickListener(new MyClick());
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

        button.setOnClickListener(v -> {
            Intent activity = new Intent(MainActivity.this, RentSegway.class);
            startActivity(activity);
        });
    }

    class MyClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Toasty", Toast.LENGTH_LONG).show();
        }
    }
}

