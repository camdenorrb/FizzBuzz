package me.camdenorrb.fizzbuzz;

import org.cyberpwn.fizzbuzz.Main;

import me.camdenorrb.fizzbuzz.runnables.FizzRunnable;

/**
 * Created by kingCam on 4/6/16.
 */

public class FizzBuzz {

    public static void main(String[] args) {
        new FizzRunnable().start();
        
        Main.test();
    }
}
