package model;

import structures.LinkedList;
import structures.Node;

public class SubarraySum {
    public static void findSubarray(LinkedList list, int S) {
        HashTable hashTable = new HashTable();
        int sum = 0;
        int index = 0;
        Node temp = list.head;

        while (temp != null) {
            sum += temp.key; // Sumamos el valor del nodo actual

            if (sum == S) {
                System.out.println("(" + 0 + ", " + index + ")");
                return;
            }

            if (hashTable.containsKey(sum - S)) {
                System.out.println("(" + (hashTable.get(sum - S) + 1) + ", " + index + ")");
                return;
            }

            hashTable.put(sum, index);
            temp = temp.next;
            index++;
        }

        System.out.println("No se encontró un subarreglo con la suma " + S);
    }
}


