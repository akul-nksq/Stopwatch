package com.hfad.stopwatch;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.os.Handler;


import java.util.Locale;


public class MainActivity extends Activity {


    private Boolean running=false;
    private int seconds=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("inside onCreate");
        //timer =findViewById(R.id.timer);
        runTimer();
    }

    private void runTimer()
    {
        final TextView timer=findViewById(R.id.timer);
        final Handler handler=new Handler();
        handler.post(new Runnable(){
            @Override
            public void run() {
                int hour=seconds/3600;
                int minute=(seconds%3600)/60;
                int sec=seconds%60;
                String time=String.format(Locale.getDefault(),"%d:%02d:%02d",hour,minute,sec);
                timer.setText(time);
                if(running)
                {
                    seconds++;
                }
                handler.postDelayed(this,1000);
            }
        });

    }

    public void btnClickStart(View view)
    {
        //timer.setText(initial_val);
        running=true;


    }

    public void btnClickStop(View view)
    {
        running=false;

    }
    public void btnClickReset(View view)
    {
        //running=false;
        seconds=0;

    }


}
