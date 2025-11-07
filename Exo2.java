
/*
 Idris Halloumi
 BDML1
 */

 

package com.mycompany.exo2;

import java.util.Scanner;

/**
 *
 * @author Idris
 */

public class Exo2 {

    public static void main(String[] args) {
       int nb ;
       int result ;
       int ind;
       
      Scanner sc = new Scanner(System.in);
        System.err.println("Entrer votre nombre ??");
        nb = sc.nextInt();
        
        result = 0;
        ind = 1;
        
        while(ind<= nb){
            result = result + ind;
            ind++;
        }
        
        System.out.println("");
        System.err.println("La somme des " +nb+ " entiers est : "+ result);
        
        
        
        
    }
}
