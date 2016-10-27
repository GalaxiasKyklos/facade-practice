package com.iteso.facade.interfaces.impl;

import com.iteso.facade.interfaces.Movie;

/**
 * Created by Saúl on 27/10/2016.
 */
public class DVDMovie implements Movie {
    private String name;
    public  DVDMovie(String name) {
        this.name = name;
    }
    public void play() {
        System.out.println("Playing movie: " + name);
    }
    public void pause() {
        System.out.println("The movie " + name + " is paused");
    }
    public String getName() {
        return this.name;
    }
}
