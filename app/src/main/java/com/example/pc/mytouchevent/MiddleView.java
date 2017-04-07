package com.example.pc.mytouchevent;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

/**
 * Created by pc on 2017/4/1.
 */

public class MiddleView extends FrameLayout {

    public MiddleView(@NonNull Context context) {
        super(context);
    }

    public MiddleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MiddleView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "middle iner down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "middle iner move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "middle iner up");
                break;
        }

        return Constant.MIDDLEINTERFALG;
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "middle dis down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "middle dis move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "middle dis up");
                break;
        }
        View viewFrist = null;
        if (getChildCount() > 0) {
            viewFrist = getChildAt(0);
        }
        if(viewFrist != null && Constant.MIDDLEDISPATCHFLAG){
            //将事件手动传递给子view
            viewFrist.dispatchTouchEvent(ev);
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "middle touch down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "middle touch move");
                setMyPosition(event.getRawX() , event.getRawY());
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "middle touch up");
                break;
        }

//        Log.e("xhc" , "middle return "+Constant.MIDDLETOUFLAG);

        return Constant.MIDDLETOUFLAG;
    }

    private void setMyPosition(float x , float y){
        Log.e("m" , " left "+ x +" y "+y);
        LayoutParams params = (LayoutParams)getLayoutParams();
        params.leftMargin = (int)x;
        params.topMargin = (int)y;
        this.setLayoutParams(params);

    }

}
