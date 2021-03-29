package com.company;

public class Player extends Thread implements Runnable{
    String name;

    public Player(String name){
        this.name = name;
    }
    @Override
    public void run() {
        super.run();
    }

    synchronized public void extractToken() {

    }
}
