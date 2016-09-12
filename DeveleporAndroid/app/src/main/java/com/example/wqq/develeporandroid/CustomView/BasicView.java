package com.example.wqq.develeporandroid.CustomView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by wqq on 16-8-31.
 */
public class BasicView extends View {
    public Paint paint;
    public Canvas canvass;

    Bitmap b;
    int width,height;
    public int count=0;
    public float currentx,currenty;
    public float lastX,lastY;
    public BasicView(Context context) {
        super(context);
        iniDraw();
        Log.d("BasicView","-----------Construct1()------------");
    }
    public BasicView(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
        Log.d("BasicView","-----------Construct2()------------");
        iniDraw();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        Log.d("hhhh","in");
        count++;
       super.onDraw(canvas);
        canvas.drawBitmap(b,0,0,null);
    }

    public void iniDraw(){

        paint=new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.STROKE);

    }

    

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        width=this.getMeasuredWidth();
        height=this.getMeasuredHeight();
        b = Bitmap.createBitmap(width,height , Bitmap.Config.ARGB_8888);
        canvass=new Canvas(b);

        Log.d("length","wid:"+width+" height:"+height);
    }
    
}
