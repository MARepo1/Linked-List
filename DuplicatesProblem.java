// I got some help on understanding the listNodes and used a similar concept to the binary problem
/*
Given a sorted linked list, delete all nodes that have duplicate
numbers, leaving only distinct numbers from the original list.In this 
program, you need to 
(1) read 5 numbers and set them in a linkedlist in order
(2) delete duplicate

Example 1:
input: 1,2,3,3,5
output: head-->1-->2-->3-->5-->null

Example 2:
input: 1,1,1,2,3
output: head-->1-->2-->3-->null

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class DuplicatesProblem
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
      
      deleteDuplicates(list);
      System.out.println(list);
   }
   public static void deleteDuplicates(LinkedList llist)
   {
      ListNode current = llist.head; 
      ListNode temp;
      
      while(current != null){
            
            int currentVal = current.value; 
            temp = current;
            
            while(temp.next != null){
                
                if(temp.next.value == currentVal){
                  temp.next = temp.next.next;
                }
                else{
                  temp = temp.next;
                }
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
