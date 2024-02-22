import java.util.Scanner;

public class double_deletion {
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

    public void deletion() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("linked list not exist");
            } else {
                System.out.println("enter 1 to delete item at beginning, enter 2 at end, enter 3 to specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        head.prev = null;
                        break;

                    case 2:
                        Node temp1 = tail;
                        temp1 = tail.prev;
                        temp1.next = null;
                        tail = temp1;
                        break;

                    case 3:
                        System.out.println("enter position");
                        p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr = temp2.next;
                        for (int i = 0; i < (p - 1); i++) {
                            temp2 = ptr;
                            ptr = ptr.next;
                        }
                        temp2.next = ptr.next;
                        ptr.next.prev = temp2;
                        break;

                }
            }
            System.out.println("enter 0 to delete another item");
            n = sc.nextInt();

        } while (n == 0);
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
        double_deletion l1 = new double_deletion();
        l1.creation();
        l1.deletion();
        l1.traverser();
    }

}
