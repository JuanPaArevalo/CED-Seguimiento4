package model;

import java.util.HashMap;

public class HashTable {
    private HashMap<Integer, Integer> map;

    public HashTable() {
        map = new HashMap<>();
    }

    public void put(int key, int value) {
        map.put(key, value);
    }

    public boolean containsKey(int key) {
        return map.containsKey(key);
    }

    public int get(int key) {
        return map.get(key);
    }
}


