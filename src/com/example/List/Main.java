package com.example.List;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        List<ListNumber> mass = new LinkedList<>();
        makeMass(mass);
        sortNumbers(mass);
    }

    private static void makeMass(List<ListNumber> mass) {
        int n = 0;
        for (int i = 0; i < 10; i++) {
            n = (int) (Math.random() * 10 + 1);
            mass.add(new ListNumber(n));

        }

        System.out.println(mass);
    }
public static void inputInt(){
        int n=0;
    Scanner sc = new Scanner(System.in);
    if (sc.hasNextInt()) {
        n = sc.nextInt();
    }
}
    private static void sortNumbers(List<ListNumber> mass) {
        int n = 0;
        int n1 = 0;
        System.out.print("Введите число от 0 до 10 ");
        inputInt();
        Comparator<ListNumber> comparator = Comparator.comparing(ListNumber::getNumber);
        Collections.sort(mass, comparator);
        for (ListNumber numbers : mass) {
            if (n >= numbers.getNumber()) {
            } else if (n < numbers.getNumber() && n1 == 0) {
                n1++;
                numbers.setNumber(n);
            }
        }
        System.out.print(" n= " + mass);
    }
}