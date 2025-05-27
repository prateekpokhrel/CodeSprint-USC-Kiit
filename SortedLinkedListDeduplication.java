//Day10_2: Sorted Linked List Deduplication
import java.util.Scanner;

public class SortedLinkedListDeduplication {
    // Node definition
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    // Linked list definition
    static class LinkedList {
        Node head;

        // Insert node at end (since input is sorted)
        void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node temp = head;
            while (temp.next != null) temp = temp.next;
            temp.next = newNode;
        }

        // Remove consecutive duplicates
        void removeDuplicates() {
            Node current = head;
            while (current != null && current.next != null) {
                if (current.data == current.next.data) {
                    current.next = current.next.next;
                } else {
                    current = current.next;
                }
            }
        }

        // Print the linked list
        void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data);
                if (temp.next != null) System.out.print(" -> ");
                temp = temp.next;
            }
            System.out.println();
        }
    }

    // Main method for user input and demonstration
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList list = new LinkedList();

        System.out.print("Enter number of nodes: ");
        int n = scanner.nextInt();

        System.out.println("Enter the node values in sorted order:");
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            list.insert(val);
        }

        System.out.println("Original List:");
        list.printList();

        list.removeDuplicates();

        System.out.println("List after removing consecutive duplicates:");
        list.printList();
    }
}