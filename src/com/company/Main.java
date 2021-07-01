package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        ArrayList<Integer> evenNumbers = new ArrayList<>();
        ArrayList<Integer> oddNumbers = new ArrayList<>();

        for (int i = 0; i <=100; i++) {
            number.add(i);
            if (i % 2 == 0){
                evenNumbers.add(i);
            }else {
                oddNumbers.add(i);
            }

        }
        for (int i = 0; i < evenNumbers.size(); i++) {
            System.out.print(evenNumbers.get(i) + " ");


        }  System.out.println("\n----------");


        for (int i = 0; i < oddNumbers.size(); i++) {
            System.out.print(oddNumbers.get(i) + " ");

        }
    }


}
