// I used similar format to DuplicatesProblem and got some help
/*
Given a linked list, remove the n-th node from the end of the list
and return its head. In this program, you need to 
(1) read 6 numbers, add the first 5 numbers in the linkedlist
the last one is the index of the element that you need to remove
(2) display the new linkedlist after removal

Example 1:
input:1,2,3,4,5,2
output:head-->1-->2-->3-->5-->null
Explanation: The original linkedlist is 1-->2-->3-->4-->5.
The second node from the end is 4.
After removing the second node from the end, the 
linkedlist is 1->2->3->5 

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class IndexRemoveProblem
{
   public static void main(String[] args)
   {
        Scanner input= new Scanner(System.in);
        
        LinkedList list = new LinkedList();
      
        list.head = new ListNode(input.nextInt());
        list.head.next = new ListNode(input.nextInt());
        list.head.next.next = new ListNode(input.nextInt());
        list.head.next.next.next = new ListNode(input.nextInt());
        list.head.next.next.next.next = new ListNode(input.nextInt());
        
        int n = input.nextInt() ;
        
        removeNthFromEnd(list, n);
        System.out.println(list);

   }
   public static void removeNthFromEnd(LinkedList llist, int n)
   {
         ListNode current = llist.head;
         ListNode temp = llist.head;
         int remove = 5 - n;
        
         for(int i = 1; i <= remove; i++){
            temp = current;
            current = current.next;
         }
         if(n >= 5){
            llist.head = llist.head.next;
         }

         temp.next = current.next;
   }

}
class ListNode
{
   int value;
   ListNode next;
   ListNode(int v){value = v;}
}
class LinkedList
{
   ListNode head;
   public String toString()
   {
      String nodeData = "";
      ListNode ref = head;
      while(ref != null)
      {
         nodeData += ref.value + "-->";
         ref = ref.next;
      }
      return "head-->"+nodeData+"null";
   }
}
