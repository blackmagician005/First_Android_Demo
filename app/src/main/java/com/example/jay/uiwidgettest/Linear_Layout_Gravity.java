package com.example.jay.uiwidgettest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class Linear_Layout_Gravity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear__layout__gravity_activity);
        Toast.makeText(Linear_Layout_Gravity.this, "This is Linear Layout on Gravity", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.Back_To_Main:
                Intent intent=new Intent(Linear_Layout_Gravity.this,Linear_Layout.class);
                startActivity(intent);
                break;
            default:
        }
        return  true;
    }
}
