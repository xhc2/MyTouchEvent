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

public class SmallView extends FrameLayout {


    public SmallView(@NonNull Context context) {
        super(context);
    }

    public SmallView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public SmallView(@NonNull Context context, @Nullable AttributeSet attrs, @AttrRes int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "small iner down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "small iner move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "small iner up");
                break;
        }
        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "small dis down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "small dis move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "small dis up");
                break;
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e("xhc", "small tou down");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e("xhc", "small tou move");
                break;
            case MotionEvent.ACTION_UP:
                Log.e("xhc", "small tou up");
                break;
        }

        return super.onTouchEvent(event);
    }
}
