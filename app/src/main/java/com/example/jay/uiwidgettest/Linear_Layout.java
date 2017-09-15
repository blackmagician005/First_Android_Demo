package com.example.jay.uiwidgettest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Linear_Layout extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.linear__layout_activity);

        Button button_Linear_Vertical_Layout = (Button) findViewById(R.id.button_Linear_Layout_Vertical);
        Button button_Linear_Horizontal_Layout = (Button) findViewById(R.id.button_Linear_Layout_Horizontal);
        Button button_Linear_Gravity_Layout = (Button) findViewById(R.id.button_Linear_Layout_Gravity);
        Button button_Linear_Weight_Layout = (Button) findViewById(R.id.button_Linear_Layout_Weight);

        button_Linear_Vertical_Layout.setOnClickListener(this);
        button_Linear_Horizontal_Layout.setOnClickListener(this);
        button_Linear_Gravity_Layout.setOnClickListener(this);
        button_Linear_Weight_Layout.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_Linear_Layout_Vertical:
                Intent intent_vertical = new Intent(Linear_Layout.this, Linear_Layout_Vertical.class);
                startActivity(intent_vertical);
                break;
            case R.id.button_Linear_Layout_Horizontal:
                Intent intent_horizontal = new Intent(Linear_Layout.this, Linear_Layout_Horizontal.class);
                startActivity(intent_horizontal);
                break;
            case R.id.button_Linear_Layout_Gravity:
                Intent intent_gravity = new Intent(Linear_Layout.this, Linear_Layout_Gravity.class);
                startActivity(intent_gravity);
                break;
            case R.id.button_Linear_Layout_Weight:
                Intent intent_weight = new Intent(Linear_Layout.this, Linear_Layout_Weight.class);
                startActivity(intent_weight);
            default:
                break;
        }
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
                Intent intent = new Intent(Linear_Layout.this, UI_Main.class);
                startActivity(intent);
                break;
            default:
        }
        return true;
    }
}
