package me.camdenorrb.fizzbuzz;

/**
 * Created by kingCam on 4/6/16.
 */

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            String message = "";
            if (i % 3 == 0 || i / 5 == 5) message += "Fizz";
            if (i % 5 == 0) message += "Buzz";
            if (message.equals("")) System.out.println(i);
            else System.out.println(message);
        }
    }
}
