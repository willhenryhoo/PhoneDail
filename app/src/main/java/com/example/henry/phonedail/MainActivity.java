package com.example.henry.phonedail;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    private EditText et_number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et_number = (EditText) findViewById(R.id.editText);
        Button btn_call = (Button) findViewById(R.id.button);
        btn_call.setOnClickListener(this);
//        btn_call.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                callPhone();
//            }
//        });

    }

    @Override
    public void onClick(View v) {

    }


//    private void callPhone() {
//        String number = et_number.getText().toString().trim();
//        if("".equals(number))
//        {
//            Toast.makeText(MainActivity.this,"Number不能为空",Toast.LENGTH_LONG).show();
//            return;
//        }
//        Intent intent = new Intent();
//        intent.setAction(Intent.ACTION_CALL);
//        intent.setData(Uri.parse("tel:"+number));
//        startActivity(intent);
//    }
}
