class Main {
    public static void main(String[] args) {
        MyLinkedList obj = new MyLinkedList();
        obj.addAtHead(1);
        obj.addAtTail(3);
        obj.addAtIndex(1, 2);
        System.out.println(obj.get(1));
        obj.deleteAtIndex(1);
        System.out.println(obj.get(1));
    }
}

class Node {
    int val;
    Node nxt;

    Node(int val) {
        this.val = val;
        this.nxt = null;
    }

}

class MyLinkedList {

    Node head;

    public MyLinkedList() {
        head = null;
    }

    public int get(int index) {
        int i = 0;
        Node current = head;
        while (current != null) {
            if (i == index) {
                return current.val;
            }
            current = current.nxt;
            i++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node current = head;
        if (current == null) {
            head = new Node(val);
            return;
        }
        Node newNode = new Node(val);
        newNode.nxt = current;
        head = newNode;
    }

    public void addAtTail(int val) {
        Node current = head;
        if (current == null) {
            head = new Node(val);
            return;
        }
        for (; current.nxt != null; current = current.nxt) {
        }
        Node newNode = new Node(val);
        newNode.nxt = null;
        current.nxt = newNode;
    }

    public void addAtIndex(int index, int val) {
        if (index == 0) {
            addAtHead(val);
            return;
        }
        Node newNode = new Node(val);
        Node current = head;
        for (int i = 0; i < index - 1 && current != null; i++) {
            current = current.nxt;
        }
        if (current == null)
            return;
        newNode.nxt = current.nxt;
        current.nxt = newNode;
    }

    public void deleteAtIndex(int index) {
        if (head == null) {
            return;
        }
        Node temp = head;
        if (index == 0) {
            head = temp.nxt;
            return;
        }
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.nxt;
        }
        if (temp == null || temp.nxt == null) {
            return;
        }
        Node nxt = temp.nxt.nxt;
        temp.nxt = nxt;
    }
}