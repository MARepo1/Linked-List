// I got some help from this and used a video that was similar to this concept, but instead they used ListNodes as there method argument
/*
In this program, you need to merge two sorted linked lists 
and return it as a new list. The new list should be made by
splicing together the nodes of the first two lists.

Example 1:
input:1->2->4, 1->3->4
output:head-->1-->1-->2-->3-->4-->4-->null

Please complete the following program to fullfil the function.
*/
import java.util.*;
public class MergeProblem
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      //first list
      System.out.println("First list");
      LinkedList llist1 = new LinkedList();
      llist1.head = new ListNode(input.nextInt());
      llist1.head.next = new ListNode(input.nextInt());
      llist1.head.next.next = new ListNode(input.nextInt());
      //second list
      System.out.println("Second list");
      LinkedList llist2 = new LinkedList();
      llist2.head = new ListNode(input.nextInt());
      llist2.head.next = new ListNode(input.nextInt());
      llist2.head.next.next = new ListNode(input.nextInt());
      
      LinkedList sortedList = new LinkedList();
      sortedList.head = mergeTwoLists(llist1,llist2);
      System.out.println(sortedList);
   }
   public static ListNode mergeTwoLists(LinkedList llist1, LinkedList llist2)
   {
      LinkedList mergedList = new LinkedList();
		
		
		ListNode l1 = llist1.head;
		ListNode l2 = llist2.head;
		
	
		if(l1.value < l2.value)
		{
			mergedList.head = new ListNode(l1.value);
			l1 = l1.next;
		}
		else
		{
			mergedList.head = new ListNode(l2.value);
			l2 = l2.next;
		}
		
		ListNode temp = mergedList.head;
		
		while(l1 != null && l2 != null){
			
         if(l1.value < l2.value){
				temp.next = new ListNode(l1.value);
				l1 = l1.next;
			}
			else{
				temp.next = new ListNode(l2.value);
				l2 = l2.next;
			}
			
			temp = temp.next;
		}
		
	   while(l1 != null){
			temp.next = new ListNode(l1.value);
			l1 = l1.next;
			temp = temp.next;
		}
		
		while(l2 != null){
			temp.next = new ListNode(l2.value);
			l2 = l2.next;
			temp = temp.next;
		}
		
      return mergedList.head;

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
