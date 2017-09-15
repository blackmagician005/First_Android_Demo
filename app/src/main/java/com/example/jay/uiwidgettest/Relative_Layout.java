package com.example.jay.uiwidgettest;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class Relative_Layout extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_layout_activity);

        Button button_Relation_Layout_1 = (Button) findViewById(R.id.button_Relative_Layout_1);
        Button button_Relation_Layout_2 = (Button) findViewById(R.id.button_Relative_Layout_2);

        button_Relation_Layout_1.setOnClickListener(this);
        button_Relation_Layout_2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_Relative_Layout_1:
                Intent intent_relative_layout_1 = new Intent(Relative_Layout.this, Relative_Layout_1.class);
                startActivity(intent_relative_layout_1);
                break;
            case R.id.button_Relative_Layout_2:
                Intent intent_relative_layout_2 = new Intent(Relative_Layout.this, Relative_Layout_2.class);
                startActivity(intent_relative_layout_2);
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
                Intent intent = new Intent(Relative_Layout.this, UI_Main.class);
                startActivity(intent);
                break;
            default:
        }
        return true;
    }
}