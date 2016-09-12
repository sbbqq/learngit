package com.example.wqq.develeporandroid.fragmenthoem;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.wqq.develeporandroid.Dynamic_Fragment_Activity;
import com.example.wqq.develeporandroid.R;
import com.example.wqq.develeporandroid.Utils.LogUtil;


/**
 * Created by wqq on 16-8-25.
 */
public class DyFragment1 extends Fragment implements LogUtil {
    private static String tag="DyFragment1";
    private EditText editText;
    private Button btnSend;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();//  Thread.currentThread().getStackTrace()[1].getMethodName()
        Log.d(tag, getLineStyle(name));
        return  inflater.inflate(R.layout.layout_frg_dy_01,container,false);
    }
//Thread.currentThread().getStackTrace()[1].getMethodName()
    @Override
    public void onCreate(Bundle savedInstanceState) {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onCreate"));

        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onViewCreated"));
        View view2=this.getView();
        final Dynamic_Fragment_Activity  dynamic_fragment_activity=(Dynamic_Fragment_Activity)getActivity();
        btnSend=(Button)view2.findViewById(R.id.sendToac);
        editText=(EditText)view2.findViewById(R.id.Edit_Input);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("hehe",editText.getText()+"");
                 dynamic_fragment_activity.setShow(editText.getText().toString());
            }
        });
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onStart() {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onstart"));
        super.onStart();
    }

    @Override
    public void onResume() {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onResume"));
        super.onResume();
    }

    @Override
    public void onPause() {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onPause"));
        super.onPause();
    }

    @Override
    public void onStop() {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onStop"));
        super.onStop();
    }

    @Override
    public void onDestroy() {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onDestory"));
        super.onDestroy();
    }

    @Override
    public void onDestroyView() {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onDestroyView"));
        super.onDestroyView();
    }

    @Override
    public void onDetach() {
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();
        Log.d(tag, getLineStyle("onDetach"));
        super.onDetach();
    }

    @Override
    public String getLineStyle(String log) {
        return "-------"+log+"-------";
    }
}
