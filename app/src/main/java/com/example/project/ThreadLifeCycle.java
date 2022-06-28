package com.example.project;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class ThreadLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thread_life_cycle);

        Thread th = new Thread();
        Toast.makeText(this, "Thread "+th.getState(), Toast.LENGTH_SHORT).show();
        th.start();
        Toast.makeText(this, "Thread "+th.getState(), Toast.LENGTH_SHORT).show();
        try {
            Thread.sleep(0000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Toast.makeText(this, "Thread "+th.getState(), Toast.LENGTH_SHORT).show();
    }
}
