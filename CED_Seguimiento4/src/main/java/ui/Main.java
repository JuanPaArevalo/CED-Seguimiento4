package ui;

import structures.LinkedList;
import model.SubarraySum;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.println("Ingrese el número de elementos del arreglo:");
        int n = scanner.nextInt();

        System.out.println("Ingrese los elementos del arreglo:");
        for (int i = 0; i < n; i++) {
            list.insert(scanner.nextInt());
        }

        System.out.println("Ingrese la suma objetivo:");
        int S = scanner.nextInt();

        int[] arr = list.toArray();
        SubarraySum.findSubarray(arr, S);

        scanner.close();
    }
}

