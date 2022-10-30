package models;

import java.util.Random;
import java.util.concurrent.PriorityBlockingQueue;

public class chef {
    private final String chefName;
    private final Random r = new Random();
    private boolean isAvaliable;

    private PriorityBlockingQueue<Integer> wrap;

    public chef(String cheffName, boolean isAvaliable) {
        this.chefName = cheffName;
        this.isAvaliable = isAvaliable;
        isAvaliable = false;

    }

    public String getchefName() {
        return chefName;
    }

    public boolean isAvaliable() {
        return isAvaliable;
    }

    public void setAvaliable(boolean avaliable) {
        System.out.println("Chef hazirliyor ");
        isAvaliable = avaliable;
    }







}