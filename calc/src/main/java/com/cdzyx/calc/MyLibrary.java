package com.cdzyx.calc;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Create by zyx_coder on 2023/6/15
 */
public class MyLibrary
{


    public void add()
    {
        TimerTask timerTask=new TimerTask()
        {
            @Override
            public void run()
            {
                try
                {
                    throw new Exception();
                }
                catch (Exception e)
                {
                    throw new RuntimeException(e);
                }
            }
        };
        Timer timer=new Timer();
        timer.schedule(timerTask,3000);
    }
}
