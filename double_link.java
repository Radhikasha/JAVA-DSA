import java.util.Scanner;

public class double_link {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    Node head = null;
    Node tail = null;

    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;
                tail = new_node;

            } else {
                System.out.println(
                        "enter 1 to insert at beginning, enter 2 to insert at end, enter 3 for at specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head.prev = new_node;
                        head = new_node;
                        break;

                    case 2:
                        tail.next = new_node;
                        new_node.prev = tail;
                        tail = new_node;
                        break;

                    case 3:
                        System.out.println("enter position");
                        p = sc.nextInt();
                        Node temp = head;
                        Node ptr = temp.next;
                        for (int i = 0; i < (p - 1); i++) {
                            temp = ptr;
                            ptr = ptr.next;
                        }
                        new_node.prev = temp;
                        new_node.next = ptr;
                        temp.next = new_node;
                        ptr.prev = new_node;
                        break;

                }

            }
            System.out.println("if you want to add more data then press 1");
            n = sc.nextInt();
        } while (n == 1);

    }

    public void traverser() {
        Node temp = head;
        if (head == null) {
            System.out.println("linked list not exist");
        } else {
            while (temp != null) {
                System.out.println(temp.data + " ");
                temp = temp.next;
            }
        }

    }

    public static void main(String[] args) {
        double_link l1 = new double_link();
        l1.creation();
        l1.traverser();
    }

}
