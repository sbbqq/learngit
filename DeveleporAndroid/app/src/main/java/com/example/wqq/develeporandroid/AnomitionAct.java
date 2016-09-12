package com.example.wqq.develeporandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.Button;
import android.widget.ImageView;

public class AnomitionAct extends BaseActivity{
     private Button btnAl,btnSc,btnRt,btnTs,btnSt;
     private ImageView imageView;
      private  Animation animationSl,animationRt,animationAlpha,animationTs,animationSt;
             ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_anomition);
        back();
        iniView();
    }
    public void iniView(){
        btnAl=(Button)findViewById(R.id.btnAp);
        btnRt=(Button)findViewById(R.id.btnRt);
        btnSc=(Button)findViewById(R.id.btnSc);
        btnTs=(Button)findViewById(R.id.btnTs);
        btnSt=(Button)findViewById(R.id.btnSet);
        imageView=(ImageView)findViewById(R.id.imgShow);
        btnSc.setOnClickListener(onClickListenergg);
        btnRt.setOnClickListener(onClickListenergg);
        btnTs.setOnClickListener(onClickListenergg);
        btnAl.setOnClickListener(onClickListenergg);
        btnSt.setOnClickListener(onClickListenergg);
       // imageView.setOnClickListener(onClickListenergg);
            }
    public View.OnClickListener onClickListenergg=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.btnAp:
                    animationAlpha=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.alpha);
                    animationAlpha.setDuration(3000);
                    imageView.startAnimation(animationAlpha);
                    break;
                case R.id.btnRt:
                    animationRt=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.retoate);
                    //animationRt.setInterpolator();
                    animationRt.setDuration(5000);
                    imageView.startAnimation(animationRt);
                    break;
                case R.id.btnSc:
//第一个参数Context为程序的上下文
//第二个参数id为动画XML文件的引用
//例子：
                    animationSl= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.scale);
                   // imageView.setAnimation(animationSl);
                    imageView.startAnimation(animationSl);
                    break;
                case R.id.btnTs:
                    animationTs=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.translate);
                    animationTs.setDuration(10000);
                    imageView.startAnimation(animationTs);
                    break;
                case R.id.btnSet:
                    animationSt=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.set);
      animationSt.setDuration(10000);

                   // animationSt.set
                    imageView.startAnimation(animationSt);
            }
        }
    };
}
