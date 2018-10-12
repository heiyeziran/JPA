package com.example.demo.task;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Administrator on 2018/10/8 0008.
 */
public class MyTimer {
    public static void main(String[] args) {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                LocalDateTime current = LocalDateTime.now();
                String timeString = current.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
                System.out.println("task  run:"+ timeString);
            }
        };
        Timer timer = new Timer();
        //定时任务3秒后启动，每1秒执行一次
        timer.schedule(timerTask,3000,1000);
    }
}
