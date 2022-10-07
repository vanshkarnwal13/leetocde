class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode(0);
        ListNode p=l1;
        ListNode q=l2;
        ListNode temp;
        temp=l3;
        int t=0;
        while(p!=null || q!=null){
            int x=0;
            int y=0;
            if(p!=null){
                x=p.val;
            }
            if(q!=null){
                y=q.val;
            }
            int sum=t+x+y;
            t=sum/10;
            temp.next = new ListNode(sum%10);
            temp=temp.next;
            if(p!=null)
            {p=p.next;
            }
            if(q!=null)
            {q=q.next;
            }
        }
        if(t>0){
            temp.next=new ListNode(t);
        }
        return l3.next;
    }
}