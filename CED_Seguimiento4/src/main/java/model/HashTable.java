package model;

import structures.LinkedList;
import java.util.HashMap;

public class HashTable {
    private static final int SIZE = 100; // Tamaño de la tabla hash
    private LinkedList[] table;

    public HashTable() {
        table = new LinkedList[SIZE];
        for (int i = 0; i < SIZE; i++) {
            table[i] = new LinkedList();
        }
    }

    private int hash(int key) {
        return Math.abs(key) % SIZE; // Función hash simple
    }

    public void put(int key, int value) {
        int index = hash(key);
        table[index].insert(key, value);
    }

    public boolean containsKey(int key) {
        int index = hash(key);
        return table[index].containsKey(key);
    }

    public Integer get(int key) {
        int index = hash(key);
        return table[index].get(key);
    }
}



