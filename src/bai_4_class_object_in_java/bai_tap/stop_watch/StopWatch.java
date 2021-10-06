package bai_4_class_object_in_java.bai_tap.stop_watch;

import java.util.Date;
import java.util.Arrays;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        this.startTime = new Date();
    }

    public void start() {
        this.startTime = new Date();
    }

    public void end() {
        this.endTime = new Date();
    }

    public float getElapsedTime() {
        return this.endTime.getTime() - this.startTime.getTime();
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();

        stopWatch.start();
        double[] arr1 = new double[6000];
        for (int i = 0; i < 6000; i++) {
            arr1[i] = Math.random() * 100 + 1;
        }
        System.out.println(Arrays.toString(arr1));

        stopWatch.end();

        System.out.println(stopWatch.getElapsedTime());
    }
}



