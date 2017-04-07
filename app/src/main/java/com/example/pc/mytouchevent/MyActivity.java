package com.example.pc.mytouchevent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ListView;

public class MyActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener {

    private ListView listView;

    CheckBox bigIner, bigDis, bigOntou;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.mytextview,
                new String[]{"1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3", "1", "2", "3"});
        listView = (ListView) findViewById(R.id.listview);
        listView.setAdapter(adapter);
        bigIner = (CheckBox) findViewById(R.id.big_iner);
        bigDis = (CheckBox) findViewById(R.id.big_dis);
        bigOntou = (CheckBox) findViewById(R.id.big_ontou);

        bigIner.setOnCheckedChangeListener(this);
        bigDis.setOnCheckedChangeListener(this);
        bigOntou.setOnCheckedChangeListener(this);

    }



    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

        if (buttonView == bigIner) {
            Constant.BIGINTERFLAG = isChecked;
        } else if (buttonView == bigDis) {
            Constant.BIGDISPATCHFLAG = isChecked;
        } else if (buttonView == bigOntou) {
            Constant.BIGTOUFLAG = isChecked;
        }
    }
}
