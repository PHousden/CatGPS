package com.philipcode;



public class GPS{
    public int maximum_distacne;

    public int maximum_distance(int x){
        return x;
    }

    public void warning_distance(int max) {
        if (max >= maximum_distacne) {
            System.out.println("Warning! the cat Is to far away now");
        }

    }
}
