package com.example.pc.mytouchevent;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

/**
 * Created by pc on 2017/4/1.
 */

public class BigView extends FrameLayout {

    public BigView(@NonNull Context context) {
        super(context);
    }

    public BigView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public BigView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "big iner down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "big iner move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "big iner up");
                break;
        }

        return Constant.BIGINTERFLAG;

    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "big dis down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "big dis move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "big dis up");
                break;
        }
        View viewFrist = null;
        if (getChildCount() > 0) {
            viewFrist = getChildAt(0);
        }
        if(viewFrist != null && Constant.BIGDISPATCHFLAG){
            //将事件手动传递给子view
            viewFrist.dispatchTouchEvent(ev);
            return true;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "big tou down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "big tou move");
                setPosition(ev.getRawX(), ev.getRawY());
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "big tou up");
                break;
        }
        return Constant.BIGTOUFLAG;
    }

    private void setPosition(float x, float y) {

        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) getLayoutParams();
        params.leftMargin = (int) x;
        params.topMargin = (int) y;
        this.setLayoutParams(params);

    }

}
