#Day 12_2: 𝑨𝒂𝒓𝒂𝒗 𝒂𝒏𝒅 𝒕𝒉𝒆 𝑷𝒂𝒄𝒌𝒂𝒈𝒆 𝑪𝒐𝒍𝒐𝒓 𝑺𝒐𝒓𝒕𝒊𝒏𝒈
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def sortList(head):
    if not head or not head.next:
        return head

    # Create dummy nodes for 0s, 1s, and 2s
    zeroD = ListNode(0)
    oneD = ListNode(0)
    twoD = ListNode(0)

    # Current tails for each list
    zero = zeroD
    one = oneD
    two = twoD

    # Traverse and distribute nodes
    curr = head
    while curr:
        if curr.val == 0:
            zero.next = curr
            zero = zero.next
        elif curr.val == 1:
            one.next = curr
            one = one.next
        else:
            two.next = curr
            two = two.next
        curr = curr.next

    # Connect the three lists
    zero.next = oneD.next if oneD.next else twoD.next
    one.next = twoD.next
    two.next = None

    # The new head is after the zero dummy
    return zeroD.next

# Helper functions for testing
def create_linked_list(lst):
    head = None
    for value in reversed(lst):
        head = ListNode(value, head)
    return head

def print_linked_list(head):
    vals = []
    while head:
        vals.append(str(head.val))
        head = head.next
    print(" -> ".join(vals))

# Example usage:
head = create_linked_list([1, 2, 2, 1, 2, 0, 2, 0, 2])
print("Original List:")
print_linked_list(head)
sorted_head = sortList(head)
print("Sorted List:")
print_linked_list(sorted_head)
