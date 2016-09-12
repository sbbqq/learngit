package com.example.wqq.develeporandroid;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.wqq.develeporandroid.Interface.Guide;
import com.example.wqq.develeporandroid.Interface.InterfaceCommuit;
import com.example.wqq.develeporandroid.fragmenthoem.DyFragment1;
import com.example.wqq.develeporandroid.fragmenthoem.DyFragment2;

public class Dynamic_Fragment_Activity extends BaseActivity implements InterfaceCommuit{
    private FrameLayout frameLayoutcontainer;
    private Button buttonchgFrag;
    private boolean flag=true;
    private TextView txShow;
    DyFragment1 dyFragment1;
    DyFragment2 dyFragment2;
    private LinearLayout linearLayout;
    private Button btnSendtofrag2;
    private EditText edtSendtoFrag2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic__fragment);
        iniView();
        DyFragment1 fragmentDy01=new DyFragment1();
         getSupportFragmentManager().beginTransaction().add(R.id.frag_container,fragmentDy01).commit();
         back();
    }
    public void iniView(){
        frameLayoutcontainer=(FrameLayout)findViewById(R.id.frag_container);
        buttonchgFrag=(Button)findViewById(R.id.chgFrag);
        buttonchgFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) {
                     dyFragment2 = new DyFragment2();
                    linearLayout.setVisibility(View.VISIBLE);
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container, dyFragment2).commit();
                    flag=false;
                }
                else{
                    flag=true;
                    linearLayout.setVisibility(View.GONE);
                     dyFragment1=new DyFragment1();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frag_container,dyFragment1).commit();
                }
            }
        });
        txShow=(TextView)findViewById(R.id.txshow);
        linearLayout=(LinearLayout) findViewById(R.id.linerout);
        btnSendtofrag2=(Button)findViewById(R.id.btnSendtoFrag2);
        edtSendtoFrag2=(EditText)findViewById(R.id.et_toFrag2);
        btnSendtofrag2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dyFragment2.setShow(edtSendtoFrag2.getText().toString());
            }
        });
    }

     public void setShow(String show){
         txShow.setText(show);
     }
}
