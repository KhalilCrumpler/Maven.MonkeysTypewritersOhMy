package io.zipcoder;

import java.util.Random;

/**
 * Modify the run function so that the monkeys each grab the next word and write it to the copy.
 */
public class UnsafeCopier extends Copier {
    private String toCopy;
    public UnsafeCopier(String toCopy) {
        super(toCopy);
    }



    public void run() {
        System.out.println(this.stringIterator.next());
    }

    public int randomPause(){
        Random num = new Random();
        int randomNumber = num.nextInt(10);
        return randomNumber;
    }
}
