//Day 13_1: 𝐒𝐩𝐥𝐢𝐭 𝐋𝐢𝐧𝐤𝐞𝐝 𝐋𝐢𝐬𝐭 𝐢𝐧𝐭𝐨 𝐊 𝐏𝐚𝐫𝐭𝐬 - 𝐍𝐢𝐫𝐚𝐣'𝐬 𝐓𝐚𝐬𝐤 𝐃𝐢𝐬𝐭𝐫𝐢𝐛𝐮𝐭𝐢𝐨𝐧
import java.util.*;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class SplitLinkedList {
    public static List<List<Integer>> splitListToParts(ListNode head, int k) {
        List<List<Integer>> result = new ArrayList<>();
        int total = 0;
        ListNode curr = head;
        
        
        while (curr != null) {
            total++;
            curr = curr.next;
        }

        int partSize = total / k;
        int extra = total % k;

        curr = head;
        for (int i = 0; i < k; i++) {
            List<Integer> part = new ArrayList<>();
            int currentSize = partSize + (extra-- > 0 ? 1 : 0);
            for (int j = 0; j < currentSize; j++) {
                part.add(curr.val);
                curr = curr.next;
            }
            result.add(part);
        }
        return result;
    }

    public static void main(String[] args) {
        // Example: 5 10 15 20, k=2
        ListNode head = new ListNode(5);
        head.next = new ListNode(10);
        head.next.next = new ListNode(15);
        head.next.next.next = new ListNode(20);

        int k = 2;
        List<List<Integer>> parts = splitListToParts(head, k);
        for (List<Integer> part : parts) {
            System.out.println(part);
        }
    }
}
