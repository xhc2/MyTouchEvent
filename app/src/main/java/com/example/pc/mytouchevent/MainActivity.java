package com.example.pc.mytouchevent;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    Dialog dialog ;

    CheckBox bigIner , bigDis , bigOntou , middleInter , middleOntou , middleDis , smallIner ,
    smallOntou , smallDis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_view_layout);

        findViewById(R.id.move_bigger).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.show();
            }
        });
        findViewById(R.id.move_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this , MyActivity.class);
                startActivity(intent);
            }
        });


        bigIner = (CheckBox)dialog.findViewById(R.id.big_iner);
        bigDis = (CheckBox)dialog.findViewById(R.id.big_dis);
        bigOntou = (CheckBox)dialog.findViewById(R.id.big_ontou);

        middleInter = (CheckBox)dialog.findViewById(R.id.middle_iner);
        middleOntou = (CheckBox)dialog.findViewById(R.id.middle_ontou);
        middleDis = (CheckBox)dialog.findViewById(R.id.middle_dis);


        smallIner = (CheckBox)dialog.findViewById(R.id.small_iner);
        smallDis = (CheckBox)dialog.findViewById(R.id.small_dis);
        smallOntou = (CheckBox)dialog.findViewById(R.id.small_ontou);


        smallIner.setOnCheckedChangeListener(this);
        smallDis.setOnCheckedChangeListener(this);
        smallOntou.setOnCheckedChangeListener(this);

        middleInter.setOnCheckedChangeListener(this);
        middleOntou.setOnCheckedChangeListener(this);
        middleDis.setOnCheckedChangeListener(this);

        bigIner.setOnCheckedChangeListener(this);
        bigDis.setOnCheckedChangeListener(this);
        bigOntou.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if(buttonView == bigIner){
            Constant.BIGINTERFLAG = isChecked;
        }
        else if(buttonView == bigDis){
            Constant.BIGDISPATCHFLAG= isChecked;
        }
        else if(buttonView == bigOntou){
            Constant.BIGTOUFLAG = isChecked;
        }
        else if(buttonView == middleInter){
            Constant.MIDDLEINTERFALG= isChecked;
        }
        else if(buttonView == middleOntou){
            Constant.MIDDLETOUFLAG = isChecked;
        }
        else if(buttonView == middleDis){
            Constant.MIDDLEDISPATCHFLAG =  isChecked;
        }
        else if(buttonView == smallIner){
            Constant.SMALLINTERFLAG = isChecked;
        }
        else if(buttonView == smallOntou){
            Constant.SMALLTOUFLAG= isChecked;
        }
        else if(buttonView == smallDis){
            Constant.SMALLDISPATCHFLAG = isChecked;
        }
        Log.e("xhc" , "big_iner "+Constant.BIGINTERFLAG+" big_dis "+Constant.BIGDISPATCHFLAG+" big_tou "+Constant.BIGTOUFLAG
                +" \n middle_iner "+Constant.MIDDLEINTERFALG+" middle_dis "+Constant.MIDDLEDISPATCHFLAG+" middle_ontou "+Constant.MIDDLETOUFLAG
                +" \n small_iner "+Constant.SMALLINTERFLAG+" small_dis "+Constant.SMALLDISPATCHFLAG+" small_ontou "+Constant.SMALLTOUFLAG);
    }
}
