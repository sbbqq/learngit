package com.example.wqq.develeporandroid.CustomView;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by wqq on 16-9-1.
 */
public class drq extends  BasicView {
    public drq(Context context) {
        super(context);
    }

    public drq(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //return super.onTouchEvent(event);
        //super.onTouchEvent(event);
        currentx=event.getX();
        currenty=event.getY();
        switch (event.getAction()){

            case MotionEvent.ACTION_DOWN:
                Log.d("touch","-----down------");
                paint.setColor(Color.RED);
                canvass.drawCircle(currentx,currenty,40,paint);
                paint.setColor(Color.BLUE);
                canvass.drawLine(0,0,currentx,currenty,paint);
                this.invalidate();
                break;
            case MotionEvent.ACTION_MOVE:
                paint.setColor(Color.RED);
                canvass.drawCircle(currentx,currenty,40,paint);
                paint.setColor(Color.BLUE);
                canvass.drawLine(0,0,currentx,currenty,paint);
                this.invalidate();
                Log.d("touch","-----move------");
                break;
            case MotionEvent.ACTION_UP:
                Log.d("touch","-----up------");
                break;
        }
        return  true;
    }
}
