package org.example;

import java.util.LinkedList;

public class ThradsPool {


    private int poolSize;

    private Thread[] pool;

    LinkedList<Runnable> listOfRunnable;

    public ThradsPool(int size){

        pool = new Thread[size];

        for (int i = 0; i < size; i++){
            pool[i] = new Thread();
        }

    }

    public void execute(Runnable r){

    }

    public void shoutdown(){

    }
    


}
