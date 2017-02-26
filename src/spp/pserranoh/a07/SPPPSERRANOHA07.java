/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.pserranoh.a07;
import java.util.Scanner;
public class SPPPSERRANOHA07 {

    public static void main(String[] args) {
        int n;
        String [] telefono = new String[10];
        Scanner kb = new Scanner (System.in);
        for (int i = 0; i < telefono.length; i++){
            System.out.println("Introduce el telefono " + i);
            telefono[i] = kb.nextLine();
        }
        System.out.println("Porfavor introduzca que numero quiere");
        n = kb.nextInt();
        if (n < telefono.length){
        System.out.println("El numero es " + telefono[n]);
        } else System.out.println("El numero esta fuera del rango.");
    }
    
}