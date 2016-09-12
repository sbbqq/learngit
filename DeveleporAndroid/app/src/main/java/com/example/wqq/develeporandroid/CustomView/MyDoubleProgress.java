package com.example.wqq.develeporandroid.CustomView;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by wqq on 16-9-1.
 */
public class MyDoubleProgress extends BasicView{
    private float PointX,PointY;
    boolean  flag=false;
    public MyDoubleProgress(Context context) {
        super(context);
    }

    public MyDoubleProgress(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override
    protected void onDraw(Canvas canvas) {
       // b.recycle();
        canvass.drawColor(Color.WHITE);
        drawLine();


        drawPoint();
        super.onDraw(canvas);
    }

    public void drawLine(){
        flag=true;
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(height/6);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        canvass.drawLine(20,height/2,width-20,height/2,paint);
        paint.setColor(Color.parseColor("#30EE0000"));
        canvass.drawCircle(width/2-20,height/2,height/6,paint);
        PointX=width/2-20;PointY=height/2;
        //invalidate();
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);
        currentx=event.getX();
        currenty=event.getY();
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                Log.d("check","--y--->"+currenty+"--height/2+height/6-->"+(height/2+height/6)+"--height/2-height/6->"+(height/2-height/6));
                if(currenty<height/2+height/6&&currenty>height/2-height/6) {
                    Log.d("check","Binggo");
                       // drawPoint();
                    this.invalidate();
                }
                else{
                    Log.d("check","No--Binggo");
                }
                break;
            case MotionEvent.ACTION_UP:

                break;
            case MotionEvent.ACTION_MOVE:
               // canvass.restore();
                //canvass.save();
                //drawPoint();
                this.invalidate();
                break;

        }
        return true;
    }
    public void drawPoint(){
        canvass.drawCircle(currentx, height / 2, height / 6, paint);
    }
}
