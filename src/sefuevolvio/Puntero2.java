/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sefuevolvio;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author quique
 */
public class Puntero2 implements ActionListener{

    static boolean adioh,vuelve, adioshola;
    static JFrame marco;
    JPanel panel;
   static JLabel img;
    File urlImg;
    JButton sefue, volvio,vuelveseva;

    public Puntero2() {
        this.marco = new JFrame("Ventana eventos");
        this.panel = new JPanel();
        this.img = new JLabel();
        this.sefue = new JButton("Se fue...");
        this.volvio = new JButton ("Volvio!");
        this.vuelveseva = new JButton ("Vuelve... Se va!");

        ImageIcon icon = new javax.swing.ImageIcon((urlImg = new File("src/com/imagen/giphy.gif")).getAbsolutePath());

        this.volvio.addActionListener(this);
        this.sefue.addActionListener(this);
        this.vuelveseva.addActionListener(this);
        this.panel.setLayout(null);
        this.img.setIcon(icon);
        this.img.setBounds(500, 250, 250, 250);
        this.volvio.setBounds(150, 600, 100, 50);
        this.sefue.setBounds(50, 600, 100, 50);
        this.vuelveseva.setBounds(250, 600, 100, 50);
        this.marco.setSize(1920, 1080);
        this.panel.add(vuelveseva);
        this.panel.add(sefue);
        this.panel.add(volvio);
        this.panel.add(img);
        this.marco.add(panel);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Object boton = e.getSource();
        
        if (boton.equals(sefue)) {
             adioh = true;
        } else if(boton.equals(volvio)){
            adioh = false;
            vuelve = true;
        }else if(boton.equals(vuelveseva)){
        
            adioshola = true;
        }
       
    }

    
    }


