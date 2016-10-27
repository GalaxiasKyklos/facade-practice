package com.iteso.facade;

import com.iteso.facade.interfaces.*;
import com.iteso.facade.interfaces.impl.DVDMovie;
import com.iteso.facade.interfaces.impl.PS3Game;

/**
 * Created by Saúl on 27/10/2016.
 */
public class MovieFacade {
    TV tv;
    GameConsole console;
    GameController controller;
    SoundSystem soundSystem;
    Router router;
    Lights lights;
    Movie movie;

    public MovieFacade(TV tv,
                           GameConsole console,
                           GameController controller,
                           SoundSystem soundSystem,
                           Router router,
                           Lights lights){
        this.tv = tv;
        this.console = console;
        this.controller = controller;
        this.soundSystem = soundSystem;
        this.router = router;
        this.lights = lights;
    }

    public void playMovie(String name) {
        System.out.println("Turning the system ON, this may take some time");
        System.out.println();

        tv.on();
        tv.toHDMI();

        console.on();
        controller.on();
        movie = new DVDMovie(name);
        console.insertMovie(movie);

        soundSystem.on();
        soundSystem.toOpticalEntry();

        router.on();
        router.checkInternet();

        lights.off();

        movie.play();
        System.out.println();
    }

    public void pauseMovie() {
        movie.pause();
    }

    public void resumeMovie() {
        movie.resume();
    }
}
