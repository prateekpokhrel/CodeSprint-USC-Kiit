//Day 12_1: 𝑺𝒐𝒓𝒕 𝑳𝒊𝒏𝒌𝒆𝒅 𝑳𝒊𝒔𝒕 𝒃𝒚 𝑨𝒄𝒕𝒖𝒂𝒍 𝑻𝒆𝒎𝒑𝒆𝒓𝒂𝒕𝒖𝒓𝒆 𝑽𝒂𝒍𝒖𝒆𝒔
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedListInsertionSort {
 
    public ListNode insertionSortList(ListNode head) {
        if (head == null) return null;

        ListNode sorted = null; 
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next; 
            sorted = sortedInsert(sorted, current);
            current = next;
        }
        return sorted;
    }


    private ListNode sortedInsert(ListNode sorted, ListNode newNode) {
        if (sorted == null || newNode.val < sorted.val) {
            newNode.next = sorted;
            return newNode;
        } else {
            ListNode curr = sorted;
            while (curr.next != null && curr.next.val < newNode.val) {
                curr = curr.next;
            }
            newNode.next = curr.next;
            curr.next = newNode;
            return sorted;
        }
    }

    public void printList(ListNode head) {
        ListNode curr = head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    
    public static void main(String[] args) {
        LinkedListInsertionSort list = new LinkedListInsertionSort();
        ListNode head = new ListNode(5);
        head.next = new ListNode(4);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(7);
        head.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next = new ListNode(6);

        System.out.println("Original List:");
        list.printList(head);

        ListNode sortedHead = list.insertionSortList(head);

        System.out.println("Sorted List:");
        list.printList(sortedHead);
    }
}
