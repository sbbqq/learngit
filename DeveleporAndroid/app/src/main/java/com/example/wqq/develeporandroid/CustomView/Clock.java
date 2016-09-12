package com.example.wqq.develeporandroid.CustomView;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;

import java.util.Timer;

/**
 * Created by wqq on 16-9-2.
 */
public class Clock extends BasicView{
    boolean isDraw=false;
    Picture picture;
    public Clock(Context context) {
        super(context);
    }

    public Clock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override

    protected void onDraw(Canvas canvas) {
        Log.d("hehe", "------------------------------");
        if (!isDraw){
            drawClockBody();
           PictureUse(canvass);
        }
        else{
           // retote();
            canvass.drawPicture(picture);
        }
        super.onDraw(canvas);
    }

    public void drawClockBody(){
        isDraw=true;
        canvass.translate(width/2,height/2);
        float r=width/2>height/2?height/2:width/2;

        canvass.drawCircle(0,0,r,paint);

        canvass.drawCircle(0,0,r-30,paint);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(20);
        canvass.drawPoint(0,0,paint);
        paint.setColor(Color.GREEN);
        paint.setStrokeWidth(5);
        for(int angle=0;angle<360;angle=angle+10) {

            canvass.drawLine(r - 30, 0, r, 0, paint);
            canvass.rotate(10);
        }
        Path path=new Path();
        path.addCircle(0,0,r, Path.Direction.CCW);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(10);
        canvass.drawTextOnPath("fuck you",path,100,100,paint);
       // canvass.drawLine(0,0,r,r,paint);
       // canvass.drawLine(0,0,r,r,paint);
    }
    public void retote(){
         picture.draw(canvass);
       // canvass.rotate(5);
       // this.invalidate();
    }
public void PictureUse(Canvas canvas){
  picture=new Picture();
    canvas=picture.beginRecording(canvas.getWidth(),canvas.getHeight());
    //canvas.drawText("ZB",0,0,paint);
    canvas.drawCircle(0,0,50,paint);
    picture.endRecording();

}
}
