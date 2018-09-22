package com.example.administrator.ls24_snackbar;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends com.lythonliu.LinkAppCompatActivity {
    @Override
    public String getAppName(){
        return BuildConfig.APP_NAME;
    }
    Button button;
    long time;
    EditText editText;
    TextInputLayout textInputLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        button = (Button) findViewById(R.id.btn);
        editText = (EditText) findViewById(R.id.et_name);
        textInputLayout = (TextInputLayout) findViewById(R.id.tliayout);
        textInputLayout.setErrorEnabled(true);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                checkName(s.toString());
            }
        });

    }

    private void checkName(String s) {
        if (s.length() < 4) {
            textInputLayout.setError("名字长度太短");
        }else {
            textInputLayout.setError(null);
        }



    }

//    public void click(View view) {
//        Toast.makeText(this,"  ",Toast.LENGTH_SHORT).show();
//        Snackbar snackbar=Snackbar.make(button,"长沙下大雨了",Snackbar.LENGTH_SHORT).setAction("确定", new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(MainActivity.this,"确定了 ",Toast.LENGTH_LONG).show();
//            }
//        }).setCallback(new Snackbar.Callback(){
//            @Override
//            public void onShown(Snackbar sb) {
//                time=System.currentTimeMillis();
//                super.onShown(sb);
//            }
//
//            @Override
//            public void onDismissed(Snackbar transientBottomBar, int event) {
//                time=System.currentTimeMillis()-time;
//                Toast.makeText(MainActivity.this,"  时间" +time,Toast.LENGTH_SHORT).show();
//                super.onDismissed(transientBottomBar, event);
//            }
//        }).setActionTextColor(Color.YELLOW);
//        View view1=snackbar.getView();
//        TextView textView= (TextView) view1.findViewById(R.id.snackbar_text);

        //popWindow .show （）
//        Snackbar.make(button,"长沙下大雨了",Snackbar.LENGTH_SHORT).show();
        //小米     华为   失败了
        //
//    }
}
