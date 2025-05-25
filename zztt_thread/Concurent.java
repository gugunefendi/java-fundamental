package zztt_thread;

public class Concurent implements Runnable {

    public int amount = 0;
    
    public void run() {
        amount++;
    }

}
