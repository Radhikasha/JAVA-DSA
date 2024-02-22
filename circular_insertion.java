import java.util.*;

public class circular_insertion {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data, m, n, p;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println("enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;
                new_node.next = head;
            } else {

                System.out
                        .println("enter 1 for insert item at beginning, enter 2 at end, enter 3 at specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        tail.next = head;
                        break;

                    case 2:
                        tail.next = new_node;
                        tail = new_node;
                        new_node.next = head;
                        break;

                    case 3:
                        System.out.println("enter position");
                        p = sc.nextInt();
                        Node temp1 = head;
                        for (int i = 0; i < (p - 1); i++) {
                            temp1 = temp1.next;

                        }
                        new_node.next = temp1.next;
                        temp1.next = new_node;
                        break;
                }
            }
            System.out.println("if you want to add more item then enter 1");
            n = sc.nextInt();
        } while (n == 1);

    }

    public void traverser() {
        if (head == null) {
            System.out.println("link list not exist");
        } else {
            Node temp1 = head;
            do {
                System.out.println(temp1.data + " ");
                temp1 = temp1.next;

            } while (temp1 != head);
        }
    }

    public static void main(String[] args) {
        circular_insertion l1 = new circular_insertion();
        l1.creation();
        l1.traverser();
    }
}
