package model;

public class SubarraySum {
    public static void findSubarray(int[] arr, int S) {
        HashTable hashTable = new HashTable();
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == S) {
                System.out.println("(" + 0 + ", " + i + ")");
                return;
            }

            if (hashTable.containsKey(sum - S)) {
                System.out.println("(" + (hashTable.get(sum - S) + 1) + ", " + i + ")");
                return;
            }

            hashTable.put(sum, i);
        }

        System.out.println("No se encontró un subarreglo con la suma " + S);
    }
}

