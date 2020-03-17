package ThreadFrases;

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

public class ThreadFrases {
    
    public static void main(final String[] args) throws IOException {
        String path ="ThreadFrases/quotes.txt";
        new Thread(new Frases(path)).start();
        
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
                linha = this.buffRead.readLine();
                System.out.println("");
            }   
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}