// Day 13_2: 𝐒𝐨𝐫𝐭 𝐚 𝐃𝐨𝐮𝐛𝐥𝐲 𝐋𝐢𝐧𝐤𝐞𝐝 𝐋𝐢𝐬𝐭 - 𝐃𝐞𝐞𝐩𝐬𝐡𝐢𝐤𝐚'𝐬 𝐂𝐡𝐚𝐥𝐥𝐞𝐧𝐠𝐞
import java.util.*;
class DoublyNode {
    int val;
    DoublyNode prev, next;
    DoublyNode(int val) {
        this.val = val;
    }
}

public class SortDoublyLinkedList {

    public static DoublyNode sortDoublyLinkedList(DoublyNode head) {
        List<Integer> values = new ArrayList<>();
        DoublyNode curr = head;

        
        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

      
        Collections.sort(values);

        
        DoublyNode dummy = new DoublyNode(0), temp = dummy;
        for (int val : values) {
            DoublyNode node = new DoublyNode(val);
            temp.next = node;
            node.prev = temp;
            temp = node;
        }

        DoublyNode sortedHead = dummy.next;
        if (sortedHead != null) sortedHead.prev = null;
        return sortedHead;
    }

    public static void printDoublyList(DoublyNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" <-> ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        // Input: 3 8 14 20 17
        DoublyNode head = new DoublyNode(3);
        head.next = new DoublyNode(8);
        head.next.prev = head;
        head.next.next = new DoublyNode(14);
        head.next.next.prev = head.next;
        head.next.next.next = new DoublyNode(20);
        head.next.next.next.prev = head.next.next;
        head.next.next.next.next = new DoublyNode(17);
        head.next.next.next.next.prev = head.next.next.next;

        DoublyNode sortedHead = sortDoublyLinkedList(head);
        printDoublyList(sortedHead); // Output: 3 <-> 8 <-> 14 <-> 17 <-> 20
    }
}
