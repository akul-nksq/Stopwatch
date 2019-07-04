package com.hfad.stopwatch;

import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;
import android.util.TimingLogger;


public class MainActivity extends Activity {

    //private TextView timer;
    private Boolean running=false;

    //String initial_val="00:00:00";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("inside onCreate");
        //timer =findViewById(R.id.timer);
    }

    public void btnClickStart(View view)
    {
        //timer.setText(initial_val);
        running=true;
        if(running)
        {
            runTimer();
        }
    }

    public void btnClickStop(View view)
    {
        running=false;
        //runTimer(); //runTimer will freeze at the current value
    }
    public void btnClickReset(View view)
    {

        //timer.setText(initial_val);
    }
    private void runTimer()
    {
       while(running)
       {

       }

    }

}
