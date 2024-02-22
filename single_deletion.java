import java.util.Scanner;

public class single_deletion {
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

    public void deletion() {
        int n;
        Scanner sc = new Scanner(System.in);
        do {
            if (head == null) {
                System.out.println("linked list not exist");
            } else {
                System.out.println("enter 1 to delete item from begining, 2 at end, 3 at specific position");
                int m = sc.nextInt();
                switch (m) {
                    case 1:
                        Node temp = head;
                        temp = temp.next;
                        head = temp;
                        break;

                    case 2:
                        Node temp1 = head;
                        Node ptr = temp1.next;
                        while (ptr.next != null) {
                            temp1 = ptr;
                            ptr = ptr.next;
                        }
                        temp1.next = null;
                        break;

                    case 3:
                        System.out.println("enter position");
                        int p = sc.nextInt();
                        Node temp2 = head;
                        Node ptr1 = temp2.next;
                        for (int i = 0; i < (p - 1); i++) {
                            temp2 = ptr1;
                            ptr1 = ptr1.next;

                        }
                        temp2.next = ptr1.next;
                        break;
                }
            }
            System.out.println("do you want to delete more if yess then enter 1");
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
        single_deletion l1 = new single_deletion();
        l1.creation();
        l1.deletion();
        l1.traverser();
    }

}
