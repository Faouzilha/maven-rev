package com.example;

import com.example.services.Calcul;


public class App 
{
    public static void main( String[] args )
    {
       Calcul calcul = new Calcul();
       int reSomme = calcul.somme(2, 3);      
        System.out.println(reSomme);
    }
}
