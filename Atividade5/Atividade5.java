package Atividade5;

import java.io.*;
import java.util.*;

public class Atividade5{
    public static void main(String[] args) {
        System.out.println("Digite a quantidade de numeros a serem inseridos:");

        Scanner s = new Scanner(System.in);
        String aux = s.nextLine();
        int qtdeElementos = Integer.parseInt(aux);

        new Thread (    () -> {
            int[] vec = new int [qtdeElementos];
            for (int i = 0; i < qtdeElementos; i++){
                System.out.println("Digite o "+(i+1)+"º valor para ser somado: ");
                vec[i]=s.nextInt();
            }
            int total = 0;
            for (int i = 0; i < qtdeElementos; i++){
                //System.out.println("elemento " + i +": "+ vec[i]);
                total = total + vec[i];
            }
            System.out.println("Total da soma dos elementos: " + total);

        }).start();
    }
    
}