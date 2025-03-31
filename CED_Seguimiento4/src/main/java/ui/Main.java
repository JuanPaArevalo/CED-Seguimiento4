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

        System.out.println("Ingrese los elementos del arreglo de uno por uno:");
        for (int i = 0; i < n; i++) {
            int value = scanner.nextInt();
            list.insert(value, 0); // Solo usamos la clave como valor real del nodo
        }

        System.out.println("Ingrese la suma objetivo:");
        int S = scanner.nextInt();

        SubarraySum.findSubarray(list, S);
        scanner.close();
    }
}



