/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sefuevolvio;

import java.util.Timer;

/**
 *
 * @author quique
 */
public class Hilo extends Thread {

    Timer timer = new Timer();

    public Hilo() {
      
        timer.schedule(new Movimiento(), 0,5);
        this.start();
    }

}
