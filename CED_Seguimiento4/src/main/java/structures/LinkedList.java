package structures;

public class LinkedList {
    public Node head;

    public void insert(int key, int value) {
        Node newNode = new Node(key, value);
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

    public Integer get(int key) {
        Node temp = head;
        while (temp != null) {
            if (temp.key == key) {
                return temp.value;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean containsKey(int key) {
        return get(key) != null;
    }
}


