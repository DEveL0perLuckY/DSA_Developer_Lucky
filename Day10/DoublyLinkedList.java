class Node {
    int val;
    Node nxt;
    Node prev;

    Node(int val) {
        this.val = val;
        this.nxt = null;
        this.prev = null;
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
        head.prev = newNode;
        newNode.nxt = current;
        newNode.prev = null;
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
        newNode.prev = current;
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
        if (current == null) {
            return;
        }
        if (current.nxt == null) {
            // If current node is the last node
            current.nxt = newNode;
            newNode.prev = current;
        } else {
            Node nextNode = current.nxt;
            current.nxt = newNode;
            newNode.prev = current;
            newNode.nxt = nextNode;
            nextNode.prev = newNode;
        }
    }

    public void deleteAtIndex(int index) {
        if (head == null || index < 0)
            return;

        if (index == 0) {
            head = head.nxt;
            if (head != null) {
                head.prev = null;
            }
            return;
        }

        Node current = head;
        for (int i = 0; current != null && i < index - 1; i++) {
            current = current.nxt;
        }
        if (current == null || current.nxt == null)
            return;

        Node nextNode = current.nxt.nxt;
        if (nextNode != null) {
            nextNode.prev = current;
        }
        current.nxt = nextNode;
    }
}