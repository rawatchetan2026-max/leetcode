/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
          if(head == null || head.next == null || head.next.next == null) return new int[]{-1,-1};

        ListNode curr = head.next , prev = head , nex = head.next.next ;
        int arr[] = new int[2];
        int count = 2;
        ArrayList<Integer> li = new ArrayList<>();
        while(nex!=null){
            
            if(prev.val < curr.val && curr.val > nex.val) li.add(count);
            if(prev.val > curr.val && curr.val < nex.val) li.add(count);
            
            prev = curr; 
            curr = nex;
            nex = nex.next;
            count++;
        }
        if(li.size() < 2) return new int[]{-1,-1};
        int min = Integer.MAX_VALUE ;
        for(int i = 0 ; i < li.size() - 1 ; i++){
            if(li.get(i+1) - li.get(i) < min){ 
                min = li.get(i+1) - li.get(i);
            }
        }
        int max = li.get(li.size()-1) - li.get(0);
        arr[0] = min ; 
        arr[1] = max;
        return arr;
     
    }
}