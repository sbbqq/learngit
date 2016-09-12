package com.example.wqq.develeporandroid;

import android.animation.ValueAnimator;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by wqq on 16-9-8.
 */
public class ActValueAnimator extends BaseActivity {
    private Button btnStart,btnA2;
    private TextView txfly;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_value_animation);
        back();
        iniView();
    }

    public void iniView() {
        btnStart = (Button) findViewById(R.id.btnAnimator);
        btnA2=(Button)findViewById(R.id.btnA2);
        txfly = (TextView) findViewById(R.id.txshow);
        btnStart.setOnClickListener(onClickListener);
        txfly.setOnClickListener(onClickListener);
        btnA2.setOnClickListener(onClickListener);

    }

    View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btnAnimator:
                    final TranslateAnimation animation = new TranslateAnimation(Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 400, Animation.ABSOLUTE, 0, Animation.ABSOLUTE, 400);
                    animation.setFillAfter(true);
                    animation.setDuration(1000);
                    txfly.startAnimation(animation);
                    break;
                case R.id.txshow:
                    Toast.makeText(getApplicationContext(), "yeah, i am fly \n come on", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnA2:
                    doAnimator();
                    break;
            }
        }
    };
    public void doAnimator(){
        final ValueAnimator valuAnimator= ValueAnimator.ofInt(0,800,400,800,300,900,0,1340);
        valuAnimator.setDuration(10000);
        valuAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                int cuV=(int)valuAnimator.getAnimatedValue();
                Log.d("cuv","-----"+cuV+"-----");
                txfly.layout(cuV,cuV,cuV+txfly.getWidth(),cuV+txfly.getHeight());
            }
        });
        valuAnimator.start();
    }
}