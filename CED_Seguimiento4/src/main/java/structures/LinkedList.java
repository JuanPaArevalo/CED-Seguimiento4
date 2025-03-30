package structures;

public class LinkedList {
    Node head;

    public void insert(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public int[] toArray() {
        int size = getSize();
        int[] arr = new int[size];
        Node temp = head;
        int index = 0;
        while (temp != null) {
            arr[index++] = temp.value;
            temp = temp.next;
        }
        return arr;
    }

    public int getSize() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }
}

