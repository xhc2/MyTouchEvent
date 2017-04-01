package com.example.pc.mytouchevent;

import android.content.Context;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
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

        return super.onInterceptTouchEvent(ev);
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
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "middle touch up");
                break;
        }
        return super.onTouchEvent(event);
    }
}
