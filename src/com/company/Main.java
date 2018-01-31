package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Įveskite sveiką skaičių");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if (a % 7 == 0) {
            System.out.println(a + " Dalinasi iš 7");
        }
        if (a % 5 == 0) {
            System.out.println(a + " Dalinasi iš 5");
        }
        if (a % 3 == 0) {
            System.out.println(a + " Dalinasi iš 3");
        } else {
            System.out.println(a + " Nesidalina");
        }
    }
}
