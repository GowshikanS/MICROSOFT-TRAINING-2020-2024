class Solution {

public ListNode deleteDuplicates(ListNode head) {

    if (head==null || head.next == null) return head;
    Map<Integer,Integer> hm = new HashMap<>();
    hm.put(head.val,1);
    ListNode trav = head.next;
    ListNode prev = head;
    
    while(trav.next!=null){
        
        if(hm.getOrDefault(trav.val,0) == 0){
            hm.put(trav.val,1);
            trav = trav.next;
            prev = prev.next;
        } else {
            prev.next = trav.next;
            trav = trav.next;
        }
    }
    
    if (hm.getOrDefault(trav.val,0) == 0){
        return head;
    }
    
    prev.next = null;
    return head;
}
}
