/*
 Idris Halloumi
 BDML1
 */

package com.mycompany.exo1;

import java.util.Scanner;

/**
 *
 * @author Idris
 */
public class Exo1 {

    public static void main(String[] args) {
        String prenom;
        Scanner sc = new Scanner(System.in);
        System.out.println("Votre prénom");
        prenom = sc.nextLine();
        System.out.println("C'est votre prénom "+prenom);
        System.err.println("Au revoir");
        
    }
}
