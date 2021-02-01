/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.quique.sefuevolvio;

import java.util.TimerTask;

/**
 *
 * @author quique
 */
public class Movimiento extends TimerTask {

    int x = 500;

    int y = 250;
    int cuenta = 0;

    public void run() {

        if (x >= 500 && y == 250 && cuenta == 0) {

            x++;
            if (x == 550 && y == 250) {
                cuenta++;
            }
        }

        if (x >= 550 && y <= 300 && cuenta == 1) {

            x++;
            y++;

            if (x == 600 && y == 300) {
                cuenta++;
            }
        }

        if (x >= 600 && y == 300 && cuenta == 2) {
            x++;
            if (x == 650 && y == 300) {
                cuenta++;
            }
        }

        if (x == 650 && y > 250 && cuenta == 3) {
            y--;
            if (x == 650 && y == 250) {
                cuenta++;

            }
        }

        if (x <= 650 && y == 250 && cuenta == 4) {

            x--;

            if (x == 600 && y == 250) {
                cuenta++;
            }
        }

        if (x >= 550 && y >= 250 && cuenta == 5) {
            x--;
            y++;

            if (x == 550 && y == 300) {
                cuenta++;
            }
        }

        if (x >= 500 && y == 300 && cuenta == 6) {

            x--;
            if (x == 500 && y == 300) {
                cuenta++;
            }
        }

        if (x == 500 && y >= 250 && cuenta == 7) {

            y--;

            if (x == 500 && y == 250) {
                cuenta = 0;
            }
        }

        if (Puntero2.adioh == true) {

            cuenta = 7;
            y--;
            Puntero2.adioshola = false;
        }

        if (Puntero2.vuelve == true) {
            cuenta = 0;
            
            x = 500;
            if (y <250) {
                y++;
            }
            
            if (y == 250) {
                Puntero2.vuelve = false;
            }
            Puntero2.adioshola = false;
        }
        
        
        if (Puntero2.adioshola == true){
        
            y--;
            if (y == -400) {
                y = 650;
            }
        }

        Puntero2.img.setBounds(x, y, 250, 250);

    }

}
