package com.example.jay.uiwidgettest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Relative_Layout_2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative__layout_2_activity);
        Toast.makeText(Relative_Layout_2.this, "This is the second kind of Relative Layout", Toast.LENGTH_SHORT).show();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Back_To_Main:
                Intent intent = new Intent(Relative_Layout_2.this, Relative_Layout.class);
                startActivity(intent);
                break;
            default:
        }
        return true;
    }
}
