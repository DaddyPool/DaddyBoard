package com.daddypooldev.daddyboard;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import petrov.kristiyan.colorpicker.ColorPicker;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Setting extends AppCompatActivity {

    private String fileName = "Data.txt";
    private String text ="123";
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        editText = findViewById(R.id.editText);
        final FloatingActionButton fab = findViewById(R.id.fab);
        if (fab != null) {
            fab.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    final ColorPicker colorPicker = new ColorPicker(Setting.this);
                    ArrayList<String> colors = new ArrayList<>();
                    colors.add("#82B926");
                    colors.add("#a276eb");
                    colors.add("#6a3ab2");
                    colors.add("#666666");
                    colors.add("#FFFF00");
                    colors.add("#3C8D2F");
                    colors.add("#FA9F00");
                    colors.add("#FF0000");

                    colorPicker
                            .setDefaultColorButton(Color.parseColor("#f84c44"))
                            .setColors(colors)
                            .setColumns(5)
                            .setRoundColorButton(true)
                            .setOnChooseColorListener(new ColorPicker.OnChooseColorListener() {
                                @Override
                                public void onChooseColor(int position, int color) {
                                    Log.d("position", "" + position);// will be fired only when OK button was tapped
                                }

                                @Override
                                public void onCancel() {

                                }
                            })
                            .addListenerButton("newButton", new ColorPicker.OnButtonListener() {
                                @Override
                                public void onClick(View v, int position, int color) {
                                    Log.d("position", "" + position);
                                }
                            }).show();
                }
            });
        }
        //保存ボタンの処理
        final Button buttonSave = findViewById(R.id.buttonSave);
        buttonSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonSave.setEnabled(false);
                new Handler().postDelayed(new Runnable() {
                    public void run() {
                        buttonSave.setEnabled(true);
                    }
                }, 1000L);
                text = editText.getText().toString();
                saveFile(fileName, text);

            }
        });

    }
    // ファイルを保存
    public void saveFile(String file, String str) {

        // try-with-resources
        try (FileOutputStream fileOutputstream = openFileOutput(file,
                Context.MODE_PRIVATE);){

            fileOutputstream.write(str.getBytes());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    // ファイルを読み出し
    public String readFile(String file) {
        String text = null;

        // try-with-resources
        try (FileInputStream fileInputStream = openFileInput(file);
             BufferedReader reader = new BufferedReader(
                     new InputStreamReader(fileInputStream, "UTF-8"));
        ) {

            String lineBuffer;
            while ((lineBuffer = reader.readLine()) != null) {
                text = lineBuffer;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }


}