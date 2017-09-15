package com.example.jay.uiwidgettest;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.jay.uiwidgettest.R.id.text_view;

public class UI_Main extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;

    private EditText editText;

    private ImageView imageView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button_Linear_Layout = (Button) findViewById(R.id.button_Linear_Layout);
        Button button_Relative_Layout = (Button) findViewById(R.id.button_Relative_Layout);
        Button button_Frame_Layout = (Button) findViewById(R.id.button_Frame_Layout);
        Button button_Percent_Layout = (Button) findViewById(R.id.button_Percent_Layout);
        Button button_Change_Text = (Button) findViewById(R.id.button_Change_Text);
        Button button_Change_Icon = (Button) findViewById(R.id.button_Change_Icon);
        Button button_Show_EditText = (Button) findViewById(R.id.button_Show_EditText);
        Button button_Show_dialog = (Button) findViewById(R.id.button_Show_Dialog);
        Button button_progress_bar = (Button) findViewById(R.id.button_Progress_Bar);

        textView = (TextView) findViewById(text_view);
        editText = (EditText) findViewById(R.id.edit_text);
        imageView = (ImageView) findViewById(R.id.image_view);

        button_Linear_Layout.setOnClickListener(this);
        button_Relative_Layout.setOnClickListener(this);
        button_Frame_Layout.setOnClickListener(this);
        button_Percent_Layout.setOnClickListener(this);
        button_Change_Text.setOnClickListener(this);
        button_Change_Icon.setOnClickListener(this);
        button_Show_EditText.setOnClickListener(this);
        button_Show_dialog.setOnClickListener(this);
        button_progress_bar.setOnClickListener(this);

        //        button.setOnClickListener(new View.OnClickListener(){
        //            @Override
        //            public void onClick(View v) {
        //此处添加逻辑
        //                TextView textView=(TextView)findViewById(R.id.text_view);
        //                textView.setText("???");
        //            }
        //        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_Linear_Layout:
                Intent intent_linear_layout = new Intent(UI_Main.this, Linear_Layout.class);
                startActivity(intent_linear_layout);
                break;

            case R.id.button_Relative_Layout:
                Intent intent_relative_layout = new Intent(UI_Main.this, Relative_Layout.class);
                startActivity(intent_relative_layout);
                break;

            case R.id.button_Frame_Layout:
                Intent intent_frame_layout = new Intent(UI_Main.this, Frame_Layout.class);
                startActivity(intent_frame_layout);
                break;

            case R.id.button_Percent_Layout:
                Intent intent_percent_layout = new Intent(UI_Main.this, Percent_Layout.class);
                startActivity(intent_percent_layout);
                break;

            case R.id.button_Change_Text:
                textView.setText("Hello World!");
                break;

            case R.id.button_Show_EditText:
                if (editText.length() <= 0) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(UI_Main.this);
                    dialog.setTitle("Warning");
                    dialog.setMessage("请在EditText框中输入字符！");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                        }
                    });
                    dialog.show();
                } else {
                    String inputText = editText.getText().toString();
                    Toast.makeText(UI_Main.this, inputText, Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.button_Change_Icon:
                imageView.setImageResource(R.drawable.img_2);
                break;

            case R.id.button_Show_Dialog:
                AlertDialog.Builder dialog = new AlertDialog.Builder(UI_Main.this);
                dialog.setTitle("This is Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                    }
                });
                dialog.show();
                break;

            case R.id.button_Progress_Bar:
                Intent intent_progress_bar = new Intent(UI_Main.this, Progress_Bar.class);
                startActivity(intent_progress_bar);
                break;
            default:
                break;
        }
    }
}