package com.example.tp1_exercice1;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button countButton = findViewById(R.id.button_count);
        Button toastButton = findViewById(R.id.button_toast);
        TextView countTextView = findViewById(R.id.show_count);

        countButton.setOnClickListener(view -> {
            count++;
            countTextView.setText(String.valueOf(count));
        });
        
        toastButton.setOnClickListener(view ->
                Toast.makeText(MainActivity.this, "Hello Toast!", Toast.LENGTH_SHORT).show()
        );
    }
}
