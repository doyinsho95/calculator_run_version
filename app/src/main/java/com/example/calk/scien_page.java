package com.example.calk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class scien_page extends AppCompatActivity {
    Button btn_1, btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_add,btn_sub,btn_equal, btn_cos,
            btn_perce,btn_ac, btn_div,btn_multi, btn_point, tan, log, sin, in, tPower, anotherX, openBack,
            closeBack, bfact;
    TextView inputMain, inputResult;
    ImageButton backSpace;
    String pi;

    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scien_page);

        btn_cos  = findViewById(R.id.btn_sci_cos);
        pi = "3.14159265";
        btn_1  = findViewById(R.id.btn_sci_1);
        btn_2  = findViewById(R.id.btn_sci_2);
        btn_3  = findViewById(R.id.btn_sci_3);
        btn_4  = findViewById(R.id.btn_sci_4);
        btn_5  = findViewById(R.id.btn_sci_5);
        btn_6  = findViewById(R.id.btn_sci_6);
        btn_7  = findViewById(R.id.btn_sci_7);
        btn_8  = findViewById(R.id.btn_sci_8);
        btn_9  = findViewById(R.id.btn_sci_9);
        btn_0  = findViewById(R.id.btn_sci_0);
        btn_add  = findViewById(R.id.btn_sci_addition);
        btn_sub  = findViewById(R.id.btn_sci_sub);
        btn_equal  = findViewById(R.id.btn_sci_equal);
        btn_perce  = findViewById(R.id.btn_sci_percet);
        btn_ac = findViewById(R.id.btn_sci_ac);
        btn_div  = findViewById(R.id.btn_sci_division);
        btn_multi  = findViewById(R.id.btn_sci_multi);
        btn_point  = findViewById(R.id.btn_sci_point);
        in  = findViewById(R.id.btn_sci_in);
        tan  = findViewById(R.id.btn_sci_tan);
        log  = findViewById(R.id.btn_sci_log);
        sin  = findViewById(R.id.btn_sci_sin);

        bfact  = findViewById(R.id.btn_sci_Xmark);

        tPower  = findViewById(R.id.btn_sci_xrasieto);
        anotherX  = findViewById(R.id.btn_sci_1x);

        inputMain  = findViewById(R.id.inputMain_sci);
        inputResult  = findViewById(R.id.inputResult_sci);
        backSpace  = findViewById(R.id.btn_sci_backspace);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+btn_1.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_2.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_3.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+btn_4.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_5.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_6.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+btn_7.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+btn_8.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+btn_9.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+btn_0.getText().toString();
                inputMain.setText(data);
            }
        });

        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+log.getText().toString();
                inputMain.setText(data);
            }
        });
        sin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputResult.setText(in.getText());
                inputMain.setText(inputMain.getText()+"sin");
            }
        });
        tan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputResult.setText(in.getText());
                inputMain.setText(inputMain.getText()+"tan");
            }
        });

        btn_cos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputResult.setText(in.getText());
                inputMain.setText(inputMain.getText()+"cos");
            }
        });


        in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputResult.setText(in.getText());
                inputMain.setText(inputMain.getText()+pi);

            }
        });
        tPower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String val  = inputMain.getText().toString();
                double r = Math.sqrt(Double.parseDouble(val));
                inputMain.setText(String.valueOf(r));
            }
        });

        anotherX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+anotherX.getText().toString();
                inputMain.setText(data);
            }
        });

        backSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String back=null;

                if (inputMain.getText().length()>0){
                    StringBuilder stringBuilder = new StringBuilder(inputMain.getText());
                    stringBuilder.deleteCharAt(inputMain.getText().length()-1);
                    back = stringBuilder.toString();
                    inputMain.setText(back);
                }
            }
        });
        btn_perce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_perce.getText().toString();
                inputMain.setText(data);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_sub.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_add.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_multi.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString()+btn_div.getText().toString();
                inputMain.setText(data);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputMain.getText().toString();
                data=data.replaceAll("X","*");
                data=data.replaceAll("%","/100");
                data=data.replaceAll("÷","/");
                data=data.replaceAll("-","-");
                data=data.replaceAll("÷","/");

                Context rhino=Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult;
                Scriptable scriptable = rhino.initSafeStandardObjects();
                finalResult=rhino.evaluateString(scriptable,data,"", 1,null).toString();
                inputResult.setText(finalResult);
            }
        });

        btn_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputMain.setText(null);
                inputResult.setText(null);
            }
        });

        btn_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString()+btn_point.getText().toString();
                inputMain.setText(data);
            }
        });

//        openBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//               inputMain.setText(inputMain.getText()+"(");
//            }
//        });

//        closeBack.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                inputMain.setText(inputMain.getText()+")");
//            }
//        });

        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int val = Integer.parseInt(inputMain.getText().toString());
                int fact = factorial(val);
                inputMain.setText(String.valueOf(fact));
                inputResult.setText(val+"!");
            }
        });



    }

    int factorial (int n){
        return (n==1 || n==0) ? 1 : n*factorial(n-1);

    }


}