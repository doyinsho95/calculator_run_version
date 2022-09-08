package com.example.calk;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_add, btn_sub, btn_equal,
            btn_perce, btn_ac, btn_div, btn_multi, btn_point;
    TextView inputMain, inputResult;
    String data;
    MenuItem sci;

    ImageButton backSpace;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolBar2);
        setSupportActionBar(toolbar);

        sci = findViewById(R.id.scientific);


        btn_1 = findViewById(R.id.cal_1);
        btn_2 = findViewById(R.id.cal_2);
        btn_3 = findViewById(R.id.cal_3);
        btn_4 = findViewById(R.id.cal_4);
        btn_5 = findViewById(R.id.cal_5);
        btn_6 = findViewById(R.id.cal_6);
        btn_7 = findViewById(R.id.cal_7);
        btn_8 = findViewById(R.id.cal_8);
        btn_9 = findViewById(R.id.cal_9);
        btn_0 = findViewById(R.id.cal_0);
        btn_add = findViewById(R.id.cal_addition);
        btn_sub = findViewById(R.id.cal_subtract);
        btn_equal = findViewById(R.id.cal_equal);
        btn_perce = findViewById(R.id.cal_percent);
        btn_ac = findViewById(R.id.cal_ac);
        btn_div = findViewById(R.id.cal_division);
        btn_multi = findViewById(R.id.cal_multiplication);
        btn_point = findViewById(R.id.cal_point);

        inputMain = findViewById(R.id.calculator_inputMain);
        inputResult = findViewById(R.id.calculator_inputResult);

        backSpace = findViewById(R.id.cal_backspace);

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


                data = inputMain.getText().toString() + btn_point.getText().toString();
                inputMain.setText(data);
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString() + btn_1.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_2.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_3.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString() + btn_4.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_5.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_6.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString() + btn_7.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString() + btn_8.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString() + btn_9.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                data = inputMain.getText().toString() + btn_0.getText().toString();
                inputMain.setText(data);
            }
        });

        backSpace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String back = null;

                if (inputMain.getText().length() > 0) {
                    StringBuilder stringBuilder = new StringBuilder(inputMain.getText());
                    stringBuilder.deleteCharAt(inputMain.getText().length() - 1);
                    back = stringBuilder.toString();
                    inputMain.setText(back);
                }
            }
        });
        btn_perce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_perce.getText().toString();
                inputMain.setText(data);
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_sub.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_add.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_multi.getText().toString();
                inputMain.setText(data);
            }
        });
        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                data = inputMain.getText().toString() + btn_div.getText().toString();
                inputMain.setText(data);
            }
        });

        btn_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                data = inputMain.getText().toString();
                data = data.replaceAll("X", "*");
                data = data.replaceAll("%", "/100");
                data = data.replaceAll("÷", "/");
                data = data.replaceAll("-", "-");
                data = data.replaceAll("÷", "/");

                Context rhino = Context.enter();
                rhino.setOptimizationLevel(-1);

                String finalResult;
                Scriptable scriptable = rhino.initSafeStandardObjects();
                finalResult = rhino.evaluateString(scriptable, data, "", 1, null).toString();
                inputResult.setText(finalResult);
            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sci, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        switch (id) {
            case R.id.scientific:
                Toast.makeText(this, "coming soon", Toast.LENGTH_LONG).show();
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}