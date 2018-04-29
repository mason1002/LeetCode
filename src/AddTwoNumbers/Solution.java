package AddTwoNumbers;

/*
     Author:Mason
     2018/4/29 19:50

     Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8
    Explanation: 342 + 465 = 807.

*/
public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x, y;

            if (p != null) {
                x = p.val;
            } else x = 0;

            if (q != null) {
                y = q.val;
            } else y = 0;

            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if(carry>0){
            curr.next = new ListNode(carry);
        }


        return dummyHead.next;
    }

}
