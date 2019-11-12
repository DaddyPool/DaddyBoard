package com.daddypooldev.daddyboard;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Handler;
//import android.support.v7.app.AppCompatActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
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

    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView5;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.setting);
        editTextfuda1 = findViewById(R.id.editText_fuda1);
        editTextfuda2 = findViewById(R.id.editText_fuda2);
        editTextfuda3 = findViewById(R.id.editText_fuda3);
        editTextfuda4 = findViewById(R.id.editText_fuda4);
        editTextfuda5 = findViewById(R.id.editText_fuda5);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);



        //色初期値　仮置き
//        iro1.setBackgroundColor(Color.RED);
//        iro2.setBackgroundColor(Color.YELLOW);
//        iro3.setBackgroundColor(Color.GREEN);
//        iro4.setBackgroundColor(Color.BLUE);
//        iro5.setBackgroundColor(Color.MAGENTA);

        final FloatingActionButton fab = findViewById(R.id.fab1);
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
                                        fab.setBackgroundTintList(ColorStateList.valueOf(color));
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
                                    fab2.setBackgroundTintList(ColorStateList.valueOf(color));
//                                    iro2.setBackgroundColor(color);
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
        final FloatingActionButton fab3 = findViewById(R.id.fab3);
        if (fab3 != null) {
            fab3.setOnClickListener(new View.OnClickListener() {
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
                                    fab3.setBackgroundTintList(ColorStateList.valueOf(color));
//                                    iro3.setBackgroundColor(color);
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
        final FloatingActionButton fab4 = findViewById(R.id.fab4);
        if (fab4 != null) {
            fab4.setOnClickListener(new View.OnClickListener() {
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
                                    fab4.setBackgroundTintList(ColorStateList.valueOf(color));
//                                    iro4.setBackgroundColor(color);
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
        final FloatingActionButton fab5 = findViewById(R.id.fab5);
        if (fab5 != null) {
            fab5.setOnClickListener(new View.OnClickListener() {
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
                                    fab5.setBackgroundTintList(ColorStateList.valueOf(color));
//                                    iro5.setBackgroundColor(color);
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
        final Spinner sp=(Spinner)findViewById(R.id.spinner);
        //スピナーの内容選択時に呼び出されるコールバックリスナーを登録
        sp.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view,
                                       int position, long id) {
                Spinner spinner = (Spinner) parent;
                // 選択されたアイテムを取得します
                String item = (String) spinner.getSelectedItem();
                if (item.equals("1枚")){
                    editTextfuda2.setVisibility(view.GONE);
                    editTextfuda3.setVisibility(view.GONE);
                    editTextfuda4.setVisibility(view.GONE);
                    editTextfuda5.setVisibility(view.GONE);
                    textView2.setVisibility(view.INVISIBLE);
                    textView3.setVisibility(view.INVISIBLE);
                    textView4.setVisibility(view.INVISIBLE);
                    textView5.setVisibility(view.INVISIBLE);
                    fab2.hide();
                    fab3.hide();
                    fab4.hide();
                    fab5.hide();

                }
                else if (item.equals("2枚")){
                    editTextfuda2.setVisibility(view.VISIBLE);
                    editTextfuda3.setVisibility(view.GONE);
                    editTextfuda4.setVisibility(view.GONE);
                    editTextfuda5.setVisibility(view.GONE);
                    textView2.setVisibility(view.VISIBLE);
                    textView3.setVisibility(view.INVISIBLE);
                    textView4.setVisibility(view.INVISIBLE);
                    textView5.setVisibility(view.INVISIBLE);
                    fab2.show();
                    fab3.hide();
                    fab4.hide();
                    fab5.hide();
                }
                else if (item.equals("3枚")){
                    editTextfuda2.setVisibility(view.VISIBLE);
                    editTextfuda3.setVisibility(view.VISIBLE);
                    editTextfuda4.setVisibility(view.GONE);
                    editTextfuda5.setVisibility(view.GONE);
                    textView2.setVisibility(view.VISIBLE);
                    textView3.setVisibility(view.VISIBLE);
                    textView4.setVisibility(view.INVISIBLE);
                    textView5.setVisibility(view.INVISIBLE);
                    fab2.show();
                    fab3.show();
                    fab4.hide();
                    fab5.hide();
                }
                else if (item.equals("4枚")){
                    editTextfuda2.setVisibility(view.VISIBLE);
                    editTextfuda3.setVisibility(view.VISIBLE);
                    editTextfuda4.setVisibility(view.VISIBLE);
                    editTextfuda5.setVisibility(view.GONE);
                    textView2.setVisibility(view.VISIBLE);
                    textView3.setVisibility(view.VISIBLE);
                    textView4.setVisibility(view.VISIBLE);
                    textView5.setVisibility(view.INVISIBLE);
                    fab2.show();
                    fab3.show();
                    fab4.show();
                    fab5.hide();
                }
                else if (item.equals("5枚")){
                    editTextfuda2.setVisibility(view.VISIBLE);
                    editTextfuda3.setVisibility(view.VISIBLE);
                    editTextfuda4.setVisibility(view.VISIBLE);
                    editTextfuda5.setVisibility(view.VISIBLE);
                    textView2.setVisibility(view.VISIBLE);
                    textView3.setVisibility(view.VISIBLE);
                    textView4.setVisibility(view.VISIBLE);
                    textView5.setVisibility(view.VISIBLE);
                    fab2.show();
                    fab3.show();
                    fab4.show();
                    fab5.show();
                }


            }
            @Override
            public void onNothingSelected(AdapterView<?> arg0) {
            }

        });

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
            fab.setBackgroundTintList(ColorStateList.valueOf(Integer.parseInt(str6)));
//            fab.setBackgroundColor(Integer.parseInt(str6));
        } else {
            ;
        }
        fileName = "iro2";
        String str7 = readFile(fileName);
        if (str7 != null) {
            fab2.setBackgroundTintList(ColorStateList.valueOf(Integer.parseInt(str7)));
        } else {
            ;
        }
        fileName = "iro3";
        String str8 = readFile(fileName);
        if (str8 != null) {
            fab3.setBackgroundTintList(ColorStateList.valueOf(Integer.parseInt(str8)));
        } else {
            ;
        }
        fileName = "iro4";
        String str9 = readFile(fileName);
        if (str9 != null) {
            fab4.setBackgroundTintList(ColorStateList.valueOf(Integer.parseInt(str9)));
        } else {
            ;
        }
        fileName = "iro5";
        String str10 = readFile(fileName);
        if (str10 != null) {
            fab5.setBackgroundTintList(ColorStateList.valueOf(Integer.parseInt(str10)));
        } else {
            ;
        }
        //プルダウンの読み込み
        fileName = "maisu";
        String str11 = readFile(fileName);
        if (str11 != null) {
            sp.setSelection(Integer.parseInt(str11));
        } else {
            sp.setId(0);
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
                fileName = "iro1";
//                RippleDrawable color_drawable1 = fab.getBackgroundTintList();
                text = String.valueOf(fab.getBackgroundTintList().getDefaultColor());
                saveFile(fileName, text);
                fileName = "iro2";
//                ColorDrawable color_drawable2 = (ColorDrawable)fab2.getBackground();
//                text = String.valueOf(color_drawable2.getColor());
                text = String.valueOf(fab2.getBackgroundTintList().getDefaultColor());
                saveFile(fileName, text);
                fileName = "iro3";
                text = String.valueOf(fab3.getBackgroundTintList().getDefaultColor());
                saveFile(fileName, text);
                fileName = "iro4";
                text = String.valueOf(fab4.getBackgroundTintList().getDefaultColor());
                saveFile(fileName, text);
                fileName = "iro5";
                text = String.valueOf(fab5.getBackgroundTintList().getDefaultColor());
                saveFile(fileName, text);

                //プルダウンの保存
                fileName = "maisu";
                text = String.valueOf(sp.getSelectedItemId());
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