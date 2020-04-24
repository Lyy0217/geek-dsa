import java.util.HashSet;
import java.util.List;
import java.util.Set;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }


}

class Solution {
    public boolean hasCycle(ListNode head) {
        //1、方法1、使用set进行判重 O（n）
        if(head == null){
            return false;
        }
        Set<ListNode> set =  new HashSet<ListNode>();
        while(head != null){
            if(!set.isEmpty() && set.contains(head)){
                return true;
            }
            set.add(head);
            head = head.next;
        }
        return false;
    }
}

