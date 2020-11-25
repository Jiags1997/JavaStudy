package Leetcode.Day02;

public class Day02 {
    public static ListNode sortList(ListNode head){
        /*List<Integer> list =new ArrayList<>();
        ListNode p=head;
        while(p!=null){
            list.add(p.val);
            p=p.next;
        }
        Collections.sort(list);
        ListNode r=head;
        for(Integer value:list){
            r.val=value;
            r=r.next;
        }
        r=null;
        return head;

         */
        //插入排序方式
        ListNode dummy = new ListNode(0), pre;
        dummy.next = head;

        while(head != null && head.next != null) {
//            if(head.val <= head.next.val) {
//                head = head.next;
//            }
            pre = dummy;

            while (pre.next.val < head.next.val) pre = pre.next;

            ListNode curr = head.next;
            head.next = curr.next;
            curr.next = pre.next;
            pre.next = curr;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        int []arr={4,2,1,3};
        ListNode head=new ListNode(arr[0]);

        ListNode p=head;

        for (int i=1;i<arr.length;i++) {
             p.next=new ListNode(arr[i]);
             p=p.next;
             //System.out.println(head.val);
        }
        p=null;
        ListNode l=sortList(head);
        while(l!=null){
            System.out.println(l.val);
            l=l.next;
        }

    }
}
