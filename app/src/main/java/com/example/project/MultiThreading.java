package com.example.project;

import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MultiThreading extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multi_threading);

        et = findViewById(R.id.et);

      /**  Runnable runnable = new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "I am going to blck thread", Toast.LENGTH_SHORT).show();
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Toast.makeText(getApplicationContext(), "I am going to blck thread", Toast.LENGTH_SHORT).show();
            }

        };
        Handler handler = new Handler(Looper.getMainLooper());
        handler.post(runnable); */

        Log.i("Main Thread",Thread.currentThread().getName());

        // By Using Implementing a Runnable interface

      Runnable runnable = new Runnable() {
          @Override
          public void run() {
               Log.i("Different Thread",Thread.currentThread().getName());
              try {
                  Thread.sleep(5000);
              } catch (InterruptedException e) {
                  e.printStackTrace();
              }
             runOnUiThread(new Runnable() {
                 @Override
                 public void run() {
                     Toast.makeText(getApplicationContext(), "Run On Ui Thread"+Thread.currentThread().getName(), Toast.LENGTH_SHORT).show();
                     et.setText("Run On Ui Thread "+Thread.currentThread().getName());
                 }

             });

             /** Handler handler = new Handler(getMainLooper());
              handler.post(new Runnable() {
                  @Override
                  public void run() {
                       Toast.makeText(getApplicationContext(), "Run On Ui Thread"+Thread.currentThread().getName(), Toast.LENGTH_SHORT).show();
                      et.setText("Using Handler on "+Thread.currentThread().getName());
                  }
              }); */


          }

      };
        Thread t = new Thread(runnable);
        t.start();


 // By Using Extending a Thread Class

   /** WorkerThread wt = new WorkerThread();
    wt.start();

        Handler handler = new Handler(getMainLooper());
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Toast.makeText(getApplicationContext(), "Awak", Toast.LENGTH_SHORT).show();
                et.setText("Using Handler on "+Thread.currentThread().getName());
            }
        },10000);  */


    }
    }
