package com.daddypooldev.daddyboard;

import android.content.Intent;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
//import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class SecondActivity extends AppCompatActivity {


    private TextView mTextMessage;

    private String fileName = "Data.txt";

    //ボタンの状態変数の宣言
    boolean onbutton1=false;
    boolean onbutton2=false;
    boolean onbutton3=false;
    boolean onbutton4=false;
    boolean onbutton5=false;
    int maisuuC;
    int count=5;

    //音楽用のフィールドとSoundPoolのフィールド
    int mp3a;
    int mp3b;
    int mp3c;
    SoundPool soundPool;
    //音楽再生用のメソッド
    public void play_mp3a(){soundPool.play(mp3a,1f , 1f, 0, 0, 1f);};
    public void play_mp3b(){soundPool.play(mp3b,1f , 1f, 0, 0, 1f);};
    public void play_mp3c(){soundPool.play(mp3c,1f , 1f, 0, 0, 1f);};





    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mTextMessage = (TextView) findViewById(R.id.message);
//        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
//        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

//        Button button = this.findViewById(R.id.button);
//        button.setOnClickListener(new View.OnClickListener(){
//           @Override
//            public void onClick(View v) {
//
//            }
//        });
        //soundPoolの初期化
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {

            //1個目のパラメーターはリソースの数に合わせる
            soundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);

        } else {
            AudioAttributes attr = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_MEDIA)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();
            soundPool = new SoundPool.Builder()
                    .setAudioAttributes(attr)
                    //パラメーターはリソースの数に合わせる
                    .setMaxStreams(3)
                    .build();
        }
        //音楽の読み込み
        mp3a = soundPool.load(this, R.raw.boyoyon1, 1);
        mp3b = soundPool.load(this, R.raw.kotsudumi1, 1);
        mp3c = soundPool.load(this, R.raw.trumpet1, 1);

    }

    @Override
    public void onResume() {

        //保存してあるテキストがあれば読み込んで表示する
        super.onResume();
        fileName = "fuda1";
        String str1 = readFile(fileName);
//        kaigyou = str1;
        if (str1 != null) {
            TextView button = findViewById(R.id.textbutton1);
            button.setText(str1);
            if(str1.length() <= 3) {
                button.setTextSize(36);
            }else if(str1.length() <= 6){
                button.setTextSize(36);
            }else{
                button.setTextSize(18);
            }

        } else {
            //editTextfuda1.setText("");
        }
        fileName = "fuda2";
        String str2 = readFile(fileName);
        if (str2 != null) {
            TextView button2 = findViewById(R.id.textbutton2);
            button2.setText(str2);
            if(str1.length() <= 3) {
                button2.setTextSize(36);
            }else if(str1.length() <= 6){
                button2.setTextSize(36);
            }else{
                button2.setTextSize(18);
            }
        } else {
            //editTextfuda2.setText("");
        }

        fileName = "fuda3";
        String str3 = readFile(fileName);
        if (str3 != null) {
            TextView button3 = findViewById(R.id.textbutton3);
            button3.setText(str3);
            if(str1.length() <= 3) {
                button3.setTextSize(36);
            }else if(str1.length() <= 6){
                button3.setTextSize(36);
            }else{
                button3.setTextSize(18);
            }
        } else {
            //editTextfuda3.setText("");
        }

        fileName = "fuda4";
        String str4 = readFile(fileName);
        if (str4 != null) {
            TextView button4 = findViewById(R.id.textbutton4);
            button4.setText(str4);
            if(str1.length() <= 3) {
                button4.setTextSize(36);
            }else if(str1.length() <= 6){
                button4.setTextSize(36);
            }else{
                button4.setTextSize(18);
            }
        } else {
            //editTextfuda4.setText("");
        }

        fileName = "fuda5";
        String str5 = readFile(fileName);
        if (str5 != null) {
            TextView button5 = findViewById(R.id.textbutton5);
            button5.setText(str5);
            if(str1.length() <= 3) {
                button5.setTextSize(36);
            }else if(str1.length() <= 6){
                button5.setTextSize(36);
            }else{
                button5.setTextSize(18);
            }
        } else {
            //editTextfuda5.setText("");
        }
        fileName = "iro1";
        String iro1 = readFile(fileName);
        if (iro1 != null) {
            TextView button = findViewById(R.id.textbutton1);
            button.setTextColor(Integer.parseInt(iro1));
        } else {
        }
        fileName = "iro2";
        String iro2 = readFile(fileName);
        if (iro2 != null) {
            TextView button2 = findViewById(R.id.textbutton2);
            button2.setTextColor(Integer.parseInt(iro2));
        } else {
        }
        fileName = "iro3";
        String iro3 = readFile(fileName);
        if (iro3 != null) {
            TextView button3 = findViewById(R.id.textbutton3);
            button3.setTextColor(Integer.parseInt(iro3));
        } else {
        }
        fileName = "iro4";
        String iro4 = readFile(fileName);
        if (iro4 != null) {
            TextView button4 = findViewById(R.id.textbutton4);
            button4.setTextColor(Integer.parseInt(iro4));
        } else {
        }
        fileName = "iro5";
        String iro5 = readFile(fileName);
        if (iro5 != null) {
            TextView button5 = findViewById(R.id.textbutton5);
            button5.setTextColor(Integer.parseInt(iro5));
        } else {
        }

        //札の枚数の処理
        fileName = "maisu";
        String maisuu = readFile(fileName);
        if (maisuu != null) {
            switch (maisuu) {
                case "0":
                    findViewById(R.id.button12).setVisibility(View.VISIBLE);
                    findViewById(R.id.button13).setVisibility(View.INVISIBLE);
                    findViewById(R.id.button14).setVisibility(View.INVISIBLE);
                    findViewById(R.id.button15).setVisibility(View.INVISIBLE);
                    findViewById(R.id.button16).setVisibility(View.INVISIBLE);

                    findViewById(R.id.textbutton2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.textbutton3).setVisibility(View.INVISIBLE);
                    findViewById(R.id.textbutton4).setVisibility(View.INVISIBLE);
                    findViewById(R.id.textbutton5).setVisibility(View.INVISIBLE);

                    findViewById(R.id.imageniku1).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageniku2).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageniku3).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageniku4).setVisibility(View.VISIBLE);

                    onbutton1 = false;
                    onbutton2 = true;
                    onbutton3 = true;
                    onbutton4 = true;
                    onbutton5 = true;
                    maisuuC=1;
                    count=maisuuC;
                    break;
                case "1":
                    findViewById(R.id.button12).setVisibility(View.VISIBLE);
                    findViewById(R.id.button13).setVisibility(View.VISIBLE);
                    findViewById(R.id.button14).setVisibility(View.INVISIBLE);
                    findViewById(R.id.button15).setVisibility(View.INVISIBLE);
                    findViewById(R.id.button16).setVisibility(View.INVISIBLE);

                    findViewById(R.id.textbutton2).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton3).setVisibility(View.INVISIBLE);
                    findViewById(R.id.textbutton4).setVisibility(View.INVISIBLE);
                    findViewById(R.id.textbutton5).setVisibility(View.INVISIBLE);

                    findViewById(R.id.imageniku1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku2).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageniku3).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageniku4).setVisibility(View.VISIBLE);

                    onbutton1 = false;
                    onbutton2 = false;
                    onbutton3 = true;
                    onbutton4 = true;
                    onbutton5 = true;
                    maisuuC=2;
                    count=maisuuC;
                    break;
                case "2":
                    findViewById(R.id.button12).setVisibility(View.VISIBLE);
                    findViewById(R.id.button13).setVisibility(View.VISIBLE);
                    findViewById(R.id.button14).setVisibility(View.VISIBLE);
                    findViewById(R.id.button15).setVisibility(View.INVISIBLE);
                    findViewById(R.id.button16).setVisibility(View.INVISIBLE);

                    findViewById(R.id.textbutton2).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton3).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton4).setVisibility(View.INVISIBLE);
                    findViewById(R.id.textbutton5).setVisibility(View.INVISIBLE);

                    findViewById(R.id.imageniku1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku3).setVisibility(View.VISIBLE);
                    findViewById(R.id.imageniku4).setVisibility(View.VISIBLE);

                    onbutton1 = false;
                    onbutton2 = false;
                    onbutton3 = false;
                    onbutton4 = true;
                    onbutton5 = true;
                    maisuuC=3;
                    count=maisuuC;
                    break;
                case "3":
                    findViewById(R.id.button12).setVisibility(View.VISIBLE);
                    findViewById(R.id.button13).setVisibility(View.VISIBLE);
                    findViewById(R.id.button14).setVisibility(View.VISIBLE);
                    findViewById(R.id.button15).setVisibility(View.VISIBLE);
                    findViewById(R.id.button16).setVisibility(View.INVISIBLE);

                    findViewById(R.id.textbutton2).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton3).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton4).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton5).setVisibility(View.INVISIBLE);

                    findViewById(R.id.imageniku1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku3).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku4).setVisibility(View.VISIBLE);

                    onbutton1 = false;
                    onbutton2 = false;
                    onbutton3 = false;
                    onbutton4 = false;
                    onbutton5 = true;
                    maisuuC=4;
                    count=maisuuC;
                    break;
                case "4":
                    findViewById(R.id.button12).setVisibility(View.VISIBLE);
                    findViewById(R.id.button13).setVisibility(View.VISIBLE);
                    findViewById(R.id.button14).setVisibility(View.VISIBLE);
                    findViewById(R.id.button15).setVisibility(View.VISIBLE);
                    findViewById(R.id.button16).setVisibility(View.VISIBLE);

                    findViewById(R.id.textbutton2).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton3).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton4).setVisibility(View.VISIBLE);
                    findViewById(R.id.textbutton5).setVisibility(View.VISIBLE);

                    findViewById(R.id.imageniku1).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku2).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku3).setVisibility(View.INVISIBLE);
                    findViewById(R.id.imageniku4).setVisibility(View.INVISIBLE);

                    onbutton1 = false;
                    onbutton2 = false;
                    onbutton3 = false;
                    onbutton4 = false;
                    onbutton5 = false;
                    maisuuC=5;
                    count=maisuuC;
                    break;
                default:
            }

        }else{

        }

        //枚数カウントの表示
        TextView fukidasi = findViewById(R.id.textView11);
        fukidasi.setText(String.valueOf(count));

    }
    // クリック時に呼ばれるメソッド
    public void onButtonClick(View view){
        switch (view.getId()) {
            case R.id.button12:
                if(onbutton1 == false) {
                    findViewById(R.id.maru21).setVisibility(View.VISIBLE);
                    onbutton1 = true;
                    play_mp3a();//音楽再生用のメソッドを呼び出す
                    count=count-1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }else{
                    findViewById(R.id.maru21).setVisibility(View.INVISIBLE);
                    onbutton1 = false;
                    count=count+1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }
                break;
            case R.id.button13:
                if(onbutton2 == false) {
                    findViewById(R.id.maru22).setVisibility(View.VISIBLE);
                    onbutton2 = true;
                    play_mp3b();//音楽再生用のメソッドを呼び出す
                    count=count-1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }else{
                    findViewById(R.id.maru22).setVisibility(View.INVISIBLE);
                    onbutton2 = false;
                    count=count+1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }
                break;
            case R.id.button14:
                if(onbutton3 == false) {
                    findViewById(R.id.maru23).setVisibility(View.VISIBLE);
                    onbutton3 = true;
                    play_mp3c();//音楽再生用のメソッドを呼び出す
                    count=count-1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }else{
                    findViewById(R.id.maru23).setVisibility(View.INVISIBLE);
                    onbutton3 = false;
                    count=count+1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }
                break;
            case R.id.button15:
                if(onbutton4 == false) {
                    findViewById(R.id.maru24).setVisibility(View.VISIBLE);
                    onbutton4 = true;
                    play_mp3a();//音楽再生用のメソッドを呼び出す
                    count=count-1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }else{
                    findViewById(R.id.maru24).setVisibility(View.INVISIBLE);
                    onbutton4 = false;
                    count=count+1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }
                break;
            case R.id.button16:
                if(onbutton5 == false) {
                    findViewById(R.id.maru25).setVisibility(View.VISIBLE);
                    onbutton5 = true;
                    play_mp3a();//音楽再生用のメソッドを呼び出す
                    count=count-1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }else{
                    findViewById(R.id.maru25).setVisibility(View.INVISIBLE);
                    onbutton5 = false;
                    count=count+1;
                    TextView fukidasi = findViewById(R.id.textView11);
                    fukidasi.setText(String.valueOf(count));
                }
                break;
            case R.id.button17:
                if ((onbutton1==true)&&(onbutton2==true)&&(onbutton3==true)&&(onbutton4==true)&&(onbutton5==true)) {
                    findViewById(R.id.hanamaru21).setVisibility(View.VISIBLE);
                    findViewById(R.id.resetbutton2).setVisibility(View.VISIBLE);

                }
                break;
            case R.id.resetbutton2:
                findViewById(R.id.maru21).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru22).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru23).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru24).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru25).setVisibility(View.INVISIBLE);
                findViewById(R.id.hanamaru21).setVisibility(View.INVISIBLE);
                findViewById(R.id.resetbutton2).setVisibility(View.INVISIBLE);
                count=maisuuC;
                TextView fukidasi = findViewById(R.id.textView11);
                fukidasi.setText(String.valueOf(count));
                switch (maisuuC) {
                    case 1:
                        onbutton1 = false;
                        break;
                    case 2:
                        onbutton1 = false;
                        onbutton2 = false;
                        break;
                    case 3:
                        onbutton1 = false;
                        onbutton2 = false;
                        onbutton3 = false;
                        break;
                    case 4:
                        onbutton1 = false;
                        onbutton2 = false;
                        onbutton3 = false;
                        onbutton4 = false;
                        break;
                    case 5:
                        onbutton1 = false;
                        onbutton2 = false;
                        onbutton3 = false;
                        onbutton4 = false;
                        onbutton5 = false;
                        break;
                    default:
                }
                break;
            case R.id.setting2:
                Intent intent = new Intent(this, Setting.class);
                startActivity(intent);
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
