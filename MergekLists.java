import java.util.*;
public class MergekLists  {
    ListNode head;

    class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }

    public ListNode merge (ListNode [] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeRange(lists, 0, lists.length - 1);
    }
    public ListNode mergeRange(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        int mid = l + (r - l) / 2;
        ListNode left = mergeRange(lists, l, mid);
        ListNode right = mergeRange(lists, mid + 1, r);
        return mergetwolists(left, right);
    }
    public ListNode mergetwolists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        if(list1.val<list2.val){
            list1.next=mergetwolists(list1.next,list2);
            return list1;
        } else {
            list2.next=mergetwolists(list1,list2.next);
            return list2;
        }
        

    }
    

            

        
    
}