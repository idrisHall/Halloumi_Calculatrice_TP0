/*
 Idris Halloumi
 BDML1
 */

 
package com.mycompany.exo3;

import java.util.Scanner;

public class Exo3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the operator:");
        System.out.println("1) add");
        System.out.println("2) substract");
        System.out.println("3) multiply");
        System.out.println("4) divide");
        System.out.println("5) modulo");

        
        int operateur = sc.nextInt();

        
        if (operateur < 1 || operateur > 5) {
            System.out.println("Erreur : opérateur invalide !");
            System.exit(0);
        }

        
        System.out.println("Please enter the first number:");
        int operande1 = sc.nextInt();

        
        System.out.println("Please enter the second number:");
        int operande2 = sc.nextInt();

        int resultat = 0;
        boolean divisionError = false;

        
        switch (operateur) {
            case 1:
                resultat = operande1 + operande2;
                break;
            case 2:
                resultat = operande1 - operande2;
                break;
            case 3:
                resultat = operande1 * operande2;
                break;
            case 4:
                if (operande2 != 0) {
                    resultat = operande1 / operande2;
                } else {
                    System.out.println("Erreur : division par zéro !");
                    divisionError = true;
                }
                break;
            case 5:
                if (operande2 != 0) {
                    resultat = operande1 % operande2;
                } else {
                    System.out.println("Erreur : modulo par zéro !");
                    divisionError = true;
                }
                break;
        }

        if (!divisionError) {
            System.out.println("The result is : " + resultat);
        }
    }
}
