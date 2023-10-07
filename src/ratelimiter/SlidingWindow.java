package ratelimiter;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class SlidingWindow implements RateLimiter {

    Queue<Long> slidingWindow;
    int bucketCap;
    int time;

    public SlidingWindow(int bucketCap, int time) {
        this.bucketCap = bucketCap;
        this.time = time;
        slidingWindow = new ConcurrentLinkedQueue<>();
    }

    @Override
    public boolean grantAccess() {
        long currentTime = System.currentTimeMillis();
        updateQueue(currentTime);

        if (!slidingWindow.isEmpty()) {
            slidingWindow.offer(currentTime);
            return true;
        }

        return false;


    }

    private void updateQueue(long currentTime) {
        if (slidingWindow.isEmpty())
            return;


        while(!slidingWindow.isEmpty()) {
            long diff = (currentTime - slidingWindow.peek()) / 1000;
            if (diff > time) {
                slidingWindow.poll();
            } else {
                break;
            }
        }

    }


}
