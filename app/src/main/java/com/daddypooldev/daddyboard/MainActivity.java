package com.daddypooldev.daddyboard;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
//import android.support.v7.app.AppCompatActivity;
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


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    private String fileName = "Data.txt";

    //ボタンの状態変数の宣言
    boolean onbutton1=false;
    boolean onbutton2=false;
    boolean onbutton3=false;
    boolean onbutton4=false;
    boolean onbutton5=false;

//    String kaigyou;

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
        setContentView(R.layout.activity_main);

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
    }

    @Override
    public void onResume() {

        //保存してあるテキストがあれば読み込んで表示する
        super.onResume();
        fileName = "fuda1";
        String str1 = readFile(fileName);
//        kaigyou = str1;
        if (str1 != null) {
//            for(int count = 1 ; count < str1.length() ; count++) {
//                kaigyou.insert(13,"\\n");
//            }
            Button button = findViewById(R.id.button);
            button.setText(str1);

        } else {
            //editTextfuda1.setText("");
        }
        fileName = "fuda2";
        String str2 = readFile(fileName);
        if (str2 != null) {
            Button button2 = findViewById(R.id.button2);
            button2.setText(str2);
        } else {
            //editTextfuda2.setText("");
        }

        fileName = "fuda3";
        String str3 = readFile(fileName);
        if (str3 != null) {
            Button button3 = findViewById(R.id.button3);
            button3.setText(str3);
        } else {
            //editTextfuda3.setText("");
        }

        fileName = "fuda4";
        String str4 = readFile(fileName);
        if (str4 != null) {
            Button button4 = findViewById(R.id.button4);
            button4.setText(str4);
        } else {
            //editTextfuda4.setText("");
        }

        fileName = "fuda5";
        String str5 = readFile(fileName);
        if (str5 != null) {
            Button button5 = findViewById(R.id.button5);
            button5.setText(str5);
        } else {
            //editTextfuda5.setText("");
        }
    }
    // クリック時に呼ばれるメソッド
    public void onButtonClick(View view){
        switch (view.getId()) {
            case R.id.button:
                if(onbutton1 == false) {
                    findViewById(R.id.maru1).setVisibility(View.VISIBLE);
                    onbutton1 = true;
                }else{
                    findViewById(R.id.maru1).setVisibility(View.INVISIBLE);
                    onbutton1 = false;
                }
                break;
            case R.id.button2:
                if(onbutton2 == false) {
                    findViewById(R.id.maru2).setVisibility(View.VISIBLE);
                    onbutton2 = true;
                }else{
                    findViewById(R.id.maru2).setVisibility(View.INVISIBLE);
                    onbutton2 = false;
                }
                break;
            case R.id.button3:
                if(onbutton3 == false) {
                    findViewById(R.id.maru3).setVisibility(View.VISIBLE);
                    onbutton3 = true;
                }else{
                    findViewById(R.id.maru3).setVisibility(View.INVISIBLE);
                    onbutton3 = false;
                }
                break;
            case R.id.button4:
                if(onbutton4 == false) {
                    findViewById(R.id.maru4).setVisibility(View.VISIBLE);
                    onbutton4 = true;
                }else{
                    findViewById(R.id.maru4).setVisibility(View.INVISIBLE);
                    onbutton4 = false;
                }
                break;
            case R.id.button5:
                if(onbutton5 == false) {
                    findViewById(R.id.maru5).setVisibility(View.VISIBLE);
                    onbutton5 = true;
                }else{
                    findViewById(R.id.maru5).setVisibility(View.INVISIBLE);
                    onbutton5 = false;
                }
                break;
            case R.id.button6:
                if ((onbutton1==true)&&(onbutton2==true)&&(onbutton3==true)&&(onbutton4==true)&&(onbutton5==true)) {
                    findViewById(R.id.Hanamaru1).setVisibility(View.VISIBLE);
                    findViewById(R.id.resetbutton).setVisibility(View.VISIBLE);

                }
                break;
            case R.id.resetbutton:
                findViewById(R.id.maru1).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru2).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru3).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru4).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru5).setVisibility(View.INVISIBLE);
                findViewById(R.id.Hanamaru1).setVisibility(View.INVISIBLE);
                findViewById(R.id.resetbutton).setVisibility(View.INVISIBLE);
                onbutton1 = false;
                onbutton2 = false;
                onbutton3 = false;
                onbutton4 = false;
                onbutton5 = false;

                break;
            case R.id.setting:
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
