package com.daddypooldev.daddyboard;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

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
    private String text ="";
    private EditText editTextfuda1;
    private EditText editTextfuda2;
    private EditText editTextfuda3;
    private EditText editTextfuda4;
    private EditText editTextfuda5;

    private TextView iro1;
    private TextView iro2;
    private TextView iro3;
    private TextView iro4;
    private TextView iro5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        editTextfuda1 = findViewById(R.id.editText_fuda1);
        editTextfuda2 = findViewById(R.id.editText_fuda2);
        editTextfuda3 = findViewById(R.id.editText_fuda3);
        editTextfuda4 = findViewById(R.id.editText_fuda4);
        editTextfuda5 = findViewById(R.id.editText_fuda5);

        iro1 = findViewById(R.id.iro1);
        iro2 = findViewById(R.id.iro2);
        iro3 = findViewById(R.id.iro3);
        iro4 = findViewById(R.id.iro4);
        iro5 = findViewById(R.id.iro5);

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
                                        iro1.setBackgroundColor(color);
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
        final FloatingActionButton fab2 = findViewById(R.id.fab2);
        if (fab2 != null) {
            fab2.setOnClickListener(new View.OnClickListener() {
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
                                    iro2.setBackgroundColor(color);
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
        //保存してあるテキストがあれば読み込んで表示する
        fileName = "fuda1";
        String str1 = readFile(fileName);
        if (str1 != null) {
            editTextfuda1.setText(str1);
        } else {
            editTextfuda1.setText("");
        }
        fileName = "fuda2";
        String str2 = readFile(fileName);
        if (str2 != null) {
            editTextfuda2.setText(str2);
        } else {
            editTextfuda2.setText("");
        }

        fileName = "fuda3";
        String str3 = readFile(fileName);
        if (str3 != null) {
            editTextfuda3.setText(str3);
        } else {
            editTextfuda3.setText("");
        }

        fileName = "fuda4";
        String str4 = readFile(fileName);
        if (str4 != null) {
            editTextfuda4.setText(str4);
        } else {
            editTextfuda4.setText("");
        }

        fileName = "fuda5";
        String str5 = readFile(fileName);
        if (str5 != null) {
            editTextfuda5.setText(str5);
        } else {
            editTextfuda5.setText("");
        }

        //色の読み込み
        fileName = "iro1";
        String str6 = readFile(fileName);
        if (str6 != null) {
            iro1.setBackgroundColor(Integer.parseInt(str6));
        } else {
            ;
        }
        fileName = "iro2";
        String str7 = readFile(fileName);
        if (str7 != null) {
            iro1.setBackgroundColor(Integer.parseInt(str7));
        } else {
            ;
        }
        fileName = "iro3";
        String str8 = readFile(fileName);
        if (str8 != null) {
            iro1.setBackgroundColor(Integer.parseInt(str8));
        } else {
            ;
        }
        fileName = "iro4";
        String str9 = readFile(fileName);
        if (str9 != null) {
            iro1.setBackgroundColor(Integer.parseInt(str9));
        } else {
            ;
        }
        fileName = "iro5";
        String str10 = readFile(fileName);
        if (str10 != null) {
            iro1.setBackgroundColor(Integer.parseInt(str10));
        } else {
            ;
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
                fileName = "fuda1";
                text = editTextfuda1.getText().toString();
                saveFile(fileName, text);
                fileName = "fuda2";
                text = editTextfuda2.getText().toString();
                saveFile(fileName, text);
                fileName = "fuda3";
                text = editTextfuda3.getText().toString();
                saveFile(fileName, text);
                fileName = "fuda4";
                text = editTextfuda4.getText().toString();
                saveFile(fileName, text);
                fileName = "fuda5";
                text = editTextfuda5.getText().toString();
                saveFile(fileName, text);

                //>>色の保存
                //Null判定が必要。
                fileName = "iro1";
                ColorDrawable color_drawable1 = (ColorDrawable)iro1.getBackground();
                text = String.valueOf(color_drawable1.getColor());
                saveFile(fileName, text);
                fileName = "iro2";
                ColorDrawable color_drawable2 = (ColorDrawable)iro2.getBackground();
                text = String.valueOf(color_drawable2.getColor());
                saveFile(fileName, text);
                fileName = "iro3";
                ColorDrawable color_drawable3 = (ColorDrawable)iro3.getBackground();
                text = String.valueOf(color_drawable3.getColor());
                saveFile(fileName, text);
                fileName = "iro4";
                ColorDrawable color_drawable4 = (ColorDrawable)iro4.getBackground();
                text = String.valueOf(color_drawable4.getColor());
                saveFile(fileName, text);
                fileName = "iro5";
                ColorDrawable color_drawable5 = (ColorDrawable)iro5.getBackground();
                text = String.valueOf(color_drawable5.getColor());
                saveFile(fileName, text);

            }
        });
        Button buttonBack = findViewById(R.id.buttonBack);
        buttonBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    finish();
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

    // 札枚数選択
    //final Spinner sp=(Spinner)findViewById(R.id.spinner);




}