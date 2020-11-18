package com.example.actionbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.share) {
            Toast.makeText(getApplicationContext(), "You click share", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.about) {
            Toast.makeText(getApplicationContext(), "You click About", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.exit) {
            Toast.makeText(getApplicationContext(), "You click Exit", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.search) {
            Toast.makeText(getApplicationContext(), "You click Search", Toast.LENGTH_SHORT).show();
        } else if (id == R.id.setting) {
            Toast.makeText(getApplicationContext(), "You click Setting", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}