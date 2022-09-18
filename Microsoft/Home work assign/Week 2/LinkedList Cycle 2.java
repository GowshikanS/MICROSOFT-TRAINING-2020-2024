public class Solution {
public ListNode detectCycle(ListNode head) {
if(head == null || head.next == null)
return null;
ListNode slow = head;
ListNode fast = head;
ListNode entry = head;
int flag = 0;

    while(fast != null && fast.next != null){
        slow = slow.next;
        fast = fast.next.next;
        
        if(slow == fast){
            flag = 1;
            break;
        }
    }
    
    if(flag == 1){
        while(entry != slow){
            entry = entry.next;
            slow = slow.next;
        }
        return entry;
    }
    
    return null;
    
}
}
