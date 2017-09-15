package com.example.jay.uiwidgettest;

import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class Progress_Bar extends AppCompatActivity implements View.OnClickListener {

    private TextView progressBar_Text;

    private ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.progress__bar_activity);

        Button button_hide_show_progressBar = (Button) findViewById(R.id.button_Hide_Show_ProgressBar);
        Button button_increase_progressBar = (Button) findViewById(R.id.button_Increase_ProgressBar);
        Button button_show_progressBar_dialog = (Button) findViewById(R.id.button_Show_ProgressBar_Dialog);

        progressBar_Text = (TextView) findViewById(R.id.progress_bar_text);
        progressBar = (ProgressBar) findViewById(R.id.progress_bar);

        button_hide_show_progressBar.setOnClickListener(this);
        button_increase_progressBar.setOnClickListener(this);
        button_show_progressBar_dialog.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_Hide_Show_ProgressBar:

                if (progressBar.getVisibility() == View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    progressBar.setVisibility(View.GONE);
                }
                break;
            case R.id.button_Increase_ProgressBar:
                if (progressBar.getVisibility() == View.GONE) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(Progress_Bar.this);
                    dialog.setTitle("Warning");
                    dialog.setMessage("进度条必须为显示状态才可进行本操作！");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.show();
                } else {
                    int progress = progressBar.getProgress();
                    progress += 10;
                    progressBar.setProgress(progress);
                    String progressBartext = String.valueOf((int) progressBar.getProgress() + "%");
                    progressBar_Text.setText("当前进度为：" + progressBartext);
                    if (progress > 100) {
                        AlertDialog.Builder dialog = new AlertDialog.Builder(Progress_Bar.this);
                        dialog.setTitle("Warning");
                        dialog.setMessage("进度条已达最大值，无法继续增加！");
                        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                            }
                        });
                        dialog.show();
                    }
                }
                break;
            case R.id.button_Show_ProgressBar_Dialog:
                ProgressDialog progressDialog = new ProgressDialog(Progress_Bar.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setMessage("点击任意位置退出...");
                progressDialog.setCancelable(true);
                progressDialog.show();
                break;
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
                Intent intent = new Intent(Progress_Bar.this, UI_Main.class);
                startActivity(intent);
                break;
            default:
        }
        return true;
    }
}


