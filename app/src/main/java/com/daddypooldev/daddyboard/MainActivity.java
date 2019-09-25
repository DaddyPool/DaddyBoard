package com.daddypooldev.daddyboard;

import android.content.Intent;
import android.os.Bundle;
//import android.support.annotation.NonNull;
//import android.support.design.widget.BottomNavigationView;
//import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;


public class MainActivity extends AppCompatActivity {

    private TextView mTextMessage;

    //ボタンの状態変数の宣言
    boolean onbutton1=false;
    boolean onbutton2=false;
    boolean onbutton3=false;
    boolean onbutton4=false;
    boolean onbutton5=false;


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
                    findViewById(R.id.daimaru1).setVisibility(View.VISIBLE);
                    findViewById(R.id.resetbutton).setVisibility(View.VISIBLE);

                }
                break;
            case R.id.resetbutton:
                findViewById(R.id.maru1).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru2).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru3).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru4).setVisibility(View.INVISIBLE);
                findViewById(R.id.maru5).setVisibility(View.INVISIBLE);
                findViewById(R.id.daimaru1).setVisibility(View.INVISIBLE);
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
}
