package com.example.pc.mytouchevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.move_bigger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constant.MOVEFLAG = Constant.MOVEBIG;
            }
        });

        findViewById(R.id.move_middle).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constant.MOVEFLAG = Constant.MOVEMIDDLE;
            }
        });

        findViewById(R.id.move_small).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Constant.MOVEFLAG = Constant.MOVESMALL;
            }
        });

    }


}
