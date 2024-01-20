// I got some help from my group
/*
Given a linked list, remove all elements from a linkedlist of 
integers that have value val. In this program, you need to 
(1) read 6 numbers, add the first 5 numbers in the linkedlist
the last one is the value of the element that you need to remove
(2) display the new linkedlist after removal

Example 1:
input:1,2,3,4,5,2
output:head-->1-->3-->4-->5-->null
Explanation: The original linkedlist is 1-->2-->3-->4-->5.
The value to remove is 2.
After removing all the nodes that value equals 2, the linkedlist is 1->3->4->5 

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class RemoveElementsProblem
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      LinkedList list = new LinkedList();
      
      list.head = new ListNode(input.nextInt());
      list.head.next = new ListNode(input.nextInt());
      list.head.next.next = new ListNode(input.nextInt());
      list.head.next.next.next = new ListNode(input.nextInt());
      list.head.next.next.next.next = new ListNode(input.nextInt());
		
      removeElements(list, input.nextInt());
      System.out.println(list);
   }
   public static void removeElements(LinkedList llist, int val)
   {
      ListNode current = llist.head;
      ListNode temp = null;
        
        while(current != null){
         
            if(current.value == val){
            
               if(temp == null) {
                  llist.head = current.next;
               } 
               else{
                  temp.next = current.next;
               }
            } 
            
            else{
               temp = current;
            }
            
	    current = current.next;
        }
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
