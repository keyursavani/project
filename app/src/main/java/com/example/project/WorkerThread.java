package com.example.project;

import android.util.Log;

public class WorkerThread extends Thread{


    @Override
    public void run() {
        super.run();
        Log.i("New Thread",Thread.currentThread().getName());
        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
