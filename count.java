import java.util.Scanner;

public class count {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head = null;

    public void creation() {
        int data, n, m, p;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("enter data");
            data = sc.nextInt();
            Node new_node = new Node(data);
            if (head == null) {
                head = new_node;

            } else {
                System.out.println(
                        "enter 1 to insert at beginning, enter 2 to insert at end, enter 3 for at specific position");
                m = sc.nextInt();
                switch (m) {
                    case 1:
                        new_node.next = head;
                        head = new_node;
                        break;

                    case 2:
                        Node temp = head;
                        while (temp.next != null) {
                            temp = temp.next;
                        }
                        temp.next = new_node;
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
            System.out.println("if you want to add more data then press 1");
            n = sc.nextInt();
        } while (n == 1);

    }

    public void traverser() {
        int c = 0;
        Node temp = head;
        if (head == null) {
            System.out.println("linked list not exist");
        } else {
            while (temp != null) {
                c = c + 1;
                temp = temp.next;
            }
            System.out.println("total number are " + c);
        }

    }

    public static void main(String[] args) {
        count l1 = new count();
        l1.creation();
        l1.traverser();
    }

}
