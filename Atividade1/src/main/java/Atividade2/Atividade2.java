/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade2;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brendow
 */
public class Atividade2 {

    public static void main(String[] args) {
        System.out.println("Digite a quantidade de Threads:");

        Scanner s = new Scanner(System.in);
        String aux = s.nextLine();
        int qtdeThreads = Integer.parseInt(aux);
        System.out.println("Valor: " + qtdeThreads);

        for (int i = 0; i < qtdeThreads; i++) {
            new Thread(new HelloRunnable(i)).start();

        }

    }

}

class HelloRunnable implements Runnable {

    int id;

    HelloRunnable(int i) {
        id = i;
    }

    @Override
    public void run() {
        try {
            System.out.println("Olá da Thread de numero " + id);
            Thread.sleep(3000);
            System.out.println("Saindo da Thread " + id);
        } catch (InterruptedException ex) {
            Logger.getLogger(HelloRunnable.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}


