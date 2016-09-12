package com.example.wqq.develeporandroid.fragmenthoem;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wqq.develeporandroid.R;
import com.example.wqq.develeporandroid.Utils.LogUtil;


/**
 * Created by wqq on 16-8-25.
 */
public class HelloFragment extends Fragment implements LogUtil{
    private static String tag="HelloFragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //return super.onCreateView(inflater, container, savedInstanceState);
        String name= Thread.currentThread().getStackTrace()[1].getMethodName();//  Thread.currentThread().getStackTrace()[1].getMethodName()
        Log.d(tag, getLineStyle(name));
        return  inflater.inflate(R.layout.layout_frg_helo,container,false);
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
