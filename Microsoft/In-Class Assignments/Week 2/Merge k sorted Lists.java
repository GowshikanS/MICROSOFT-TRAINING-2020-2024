class Solution {
    
    ListNode root = null;
    public ListNode mergeKLists(ListNode[] list) {
        List<Integer> ll = new ArrayList<>();
        
        root = new ListNode(0);
        
        for(int i=0;i<list.length;i++){
            ListNode current = list[i];
            while(current!=null){
                ll.add(current.val);
                current=current.next;
            }
        }
        
        ListNode current = root;
        
        Collections.sort(ll);
        
        
        for(int i=0;i<ll.size();i++){
            current.next = new ListNode(ll.get(i));
            current = current.next;
        }
        
        
        return root.next;
    }
}
