package me.camdenorrb.fizzbuzz.runnables;

/**
 * Created by kingCam on 4/7/16.
 */
public class FizzRunnable extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 100000000; i++) {
            String message = "";
            if (i % 3 == 0 || i / 5 == 5) message = "Fizz";
            if (i % 5 == 0) message += "Buzz";
            if (message.equals("")) System.out.println(i);
            else System.out.println(message);
        }
    }
}
