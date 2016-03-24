package com.example.niva.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = getClass().getSimpleName();

    private Button cmdAdd, cmdSub, cmdMult;
    private EditText txtFirst, txtSec;
    private TextView lblResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFirst = (EditText)findViewById(R.id.txtFirst);
        txtSec = (EditText)findViewById(R.id.txtSec);
        lblResult = (TextView)findViewById(R.id.lblRes);
        cmdAdd = (Button)findViewById(R.id.cmdAdd);
        cmdAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(txtFirst.getText().toString());
                int sec = Integer.parseInt(txtSec.getText().toString());
                lblResult.setText((first + sec) + "");
            }
        });

        cmdSub = (Button)findViewById(R.id.cmdSub);
        cmdSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(txtFirst.getText().toString());
                int sec = Integer.parseInt(txtSec.getText().toString());
                lblResult.setText((first - sec) + "");
            }
        });

        cmdMult = (Button)findViewById(R.id.cmdMult);
        cmdMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int first = Integer.parseInt(txtFirst.getText().toString());
                int sec = Integer.parseInt(txtSec.getText().toString());
                lblResult.setText((first * sec) + "");
            }
        });
    }
}
