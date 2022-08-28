package com.example.mmm;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {

            case R.id.update1:
                Toast.makeText(this, "update", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(MainActivity.this,update.class));
                break;
            case R.id.logout1:
                Toast.makeText(this, "logout", Toast.LENGTH_SHORT).show();


            default:
                break;

        }
        return super.onOptionsItemSelected(item);
    }
    }
