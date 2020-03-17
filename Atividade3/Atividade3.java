package Atividade3;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author brendow
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Atividade3 {
    
    public static void main(final String[] args) throws IOException {
        String path ="Atividade3/quotes.txt";
        Thread ThreadNomeada = new Thread(new Frases(path));
        try {
            ThreadNomeada.start();
            Thread.sleep(30000);
            ThreadNomeada.interrupt();    
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    
    
}

class Frases extends Thread {
    
    BufferedReader buffRead;

    Frases(String path){
        try {
            this.buffRead = new BufferedReader(new FileReader(path));
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
    @Override
    public void run() {
        String linha = "";
        try {
            while (true) {
                if (linha != null) {
                    System.out.println(linha);
                    Thread.sleep(10000);
                } else
                    break;
                try {
                    linha = this.buffRead.readLine();
                } catch (Exception e) {
                    //TODO: handle exception
                }
                System.out.println("");
            }   
        } catch (InterruptedException e) {
            System.out.println("Interrompi a Thread");
        }
    }
}