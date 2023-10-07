package ratelimiter;

import java.util.HashMap;
import java.util.Map;

public class UserSlidingWindow {

    Map<Integer, SlidingWindow> bucket;

    UserSlidingWindow() {
        this.bucket = new HashMap<>();
    }

    void addUser(int id, int time, int cap) {
        bucket.put(id, new SlidingWindow(time, cap));
    }

    void accessApplication(int id) {

        if (bucket.get(id).grantAccess()) {
            System.out.println("Able to access");
        } else {
            System.out.println("Too many requests");
        }
    }


}
