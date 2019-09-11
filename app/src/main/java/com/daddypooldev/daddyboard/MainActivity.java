package com.daddypooldev.daddyboard;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

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
                final ImageView maruImage1 = (ImageView) this.findViewById(R.id.maru1);
                maruImage1.setVisibility(View.VISIBLE);
                onbutton1 = true;
                break;
            case R.id.button2:
                final ImageView maruImage2 = (ImageView) this.findViewById(R.id.maru2);
                maruImage2.setVisibility(View.VISIBLE);
                onbutton2 = true;
                break;
            case R.id.button3:
                final ImageView maruImage3 = (ImageView) this.findViewById(R.id.maru3);
                maruImage3.setVisibility(View.VISIBLE);
                onbutton3 = true;
                break;
            case R.id.button4:
                final ImageView maruImage4 = (ImageView) this.findViewById(R.id.maru4);
                maruImage4.setVisibility(View.VISIBLE);
                onbutton4 = true;
                break;
            case R.id.button5:
                final ImageView maruImage5 = (ImageView) this.findViewById(R.id.maru5);
                maruImage5.setVisibility(View.VISIBLE);
                onbutton5 = true;
                break;
            case R.id.button6:
                if ((onbutton1==true)&&(onbutton2==true)&&(onbutton3==true)&&(onbutton4==true)&&(onbutton5==true)) {
                    final ImageView daimaruImage1 = (ImageView) this.findViewById(R.id.daimaru1);
                    daimaruImage1.setVisibility(View.VISIBLE);
                    break;
                }
        }
    }
}
