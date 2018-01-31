package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int suma = 0;
        int sk = 0;

        do {
            System.out.println("Iveskite skaiciu");
            sk = sc.nextInt();
            suma += sk;
        }

        while (sk != 0);
        System.out.println("Suma yra: " + suma);

    }
}


