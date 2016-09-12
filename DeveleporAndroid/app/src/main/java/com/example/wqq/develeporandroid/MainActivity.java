package com.example.wqq.develeporandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayAdapter <String>arrayAdapter;
    ArrayList<String> arrayList;
    ListView lv_fun;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniView();
    }
    public void hehe(View v){
        Log.d("hehe","******************");


    }
    public void iniView(){
        lv_fun=(ListView)findViewById(R.id.lv_func);
        arrayList=new ArrayList<>();
        arrayList.add("Frgment");
        arrayList.add("DataSave");
        arrayList.add("CustomView");
        arrayList.add("ViewAnimation");
        arrayList.add("ProptoryAnimator");
        arrayAdapter=new ArrayAdapter(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,arrayList);
        lv_fun.setAdapter(arrayAdapter);
        lv_fun.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.d("Item","i------------------>"+i+"l--------->"+l);
                switch (i){
                    case 0:
                        Intent intent=new Intent(getApplicationContext(),Dynamic_Fragment_Activity.class);
                        startActivity(intent);
                        finish();
                        break;
                    case 1:
                        Intent intentData=new Intent(getApplicationContext(),DataOperateActy.class);
                        startActivity(intentData);
                        finish();
                        break;
                    case 2:
                        Intent intentCustomView=new Intent(getApplicationContext(),CustumAct.class);
                        startActivity(intentCustomView);
                        finish();
                        break;
                    case 3:
                        Intent intenAnimation=new Intent(getApplicationContext(),AnomitionAct.class);
                        startActivity(intenAnimation);
                        finish();
                        break;
                    case 4:
                        Intent intentValueAnimation=new Intent(getApplicationContext(),ActValueAnimator.class);
                        startActivity(intentValueAnimation);
                        finish();
                        break;
                }
            }
        });
    }
}
