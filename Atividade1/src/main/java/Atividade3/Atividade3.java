/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividade3;

import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author brendow
 */
public class Atividade3 {

    public static void main(String[] args) {
        int i=0;
        int z = 0;
        Valor valor = new Valor();
        while (z < 5){
            new Thread (new Thread1(valor)).start();
            i++;
            new Thread (new Thread2(valor)).start();
            i++;
            z++;
            System.out.println("Valor resultante: " + valor.valor);
        }
    }
}
class Valor {
    int valor;
    Valor(){
        valor = 0;
    }
}
class Thread1 implements Runnable {

    Valor valor;

    Thread1( Valor valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
        try {
//            System.out.println("Olá da Thread de numero " + id);
            for (int i = 0; i < 100; i++) {
                valor.valor = valor.valor + 1;
            }
            Thread.sleep(3000);
            
//            System.out.println("Valor resultado: " + valor);
//            System.out.println("Saindo da Thread " + id);
        } catch (InterruptedException ex) {
            Logger.getLogger(Thread1.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}

class Thread2 implements Runnable {

   Valor valor;

    Thread2( Valor valor) {
        this.valor = valor;
    }

    @Override
    public void run() {
//        System.out.println("Olá da Thread de numero " + id);
        valor.valor = valor.valor + 1;
//        System.out.println("Valor resultado: " + valior);
//        System.out.println("Saindo da Thread " + id);

    }
}
