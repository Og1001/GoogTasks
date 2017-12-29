public class LinkedList {

    class Node {
        int data;
        Node next;
    }

    Node InsertAfter(Node head, int data) {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = null;

        if (head == null) {
            return newNode;
        }
        Node prev = null;
        Node cur = head;
        while (cur != null) {
            prev = cur;
            cur = cur.next;
        }
        prev.next = newNode;
        return head;
    }

    Node InsertBefore(Node head,int x) {
        Node newNode = new Node();
        newNode.data = x;
        newNode.next = head;
        return newNode;
    }

    Node InsertNth(Node head, int data, int position) {
        Node newNode = new Node();
        newNode.data = data;
        // scenario when head is null
        if (head == null) {
            return newNode;
        }
        // scenario when we want to insert in the first element on the list
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        int count = 0;
        Node cur = head;

        // should stop the element before the position to keep track of next
        while (count < position-1) {
            cur = cur.next;
            ++count;
        }
        newNode.next = cur.next;
        cur.next = newNode;

        return head;
    }

    public static void main(String[] args) {
     LinkedList list = new LinkedList();
     list.InsertNth(null,3,0);
    }
}
