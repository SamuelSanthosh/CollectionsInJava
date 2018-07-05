import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      LinkedList <Integer> list = new LinkedList <Integer> ();
      list.add(12);    // Adding elements to Linked List
      list.add(34);
      list.add(56);
      list.add(67);
      list.add(2);
      
      System.out.println(list);
      
      list.addFirst(1); // Adding elements based on their positions
      list.addLast(99);
      list.add(4,45);
      
      System.out.println(list);
      
      list.removeFirst();   //Removing elements based on their positions
      list.removeLast();
      list.remove(4);
      
      System.out.println(list);
      
      System.out.println(list.get(0));// GET elements from linked list
      System.out.println(list.getFirst());
      System.out.println(list.getLast());
      
      list.set(0,11);   // SET elements in linked list
      
      System.out.println(list.get(0));
      
      System.out.println("LIST");   //Printing  the linked list contents
      for(int i=0;i<list.size();i++)
        System.out.print(list.get(i)+" ");
        
      Collections.sort(list);
      
      System.out.println("\nAfter Sorting");    //Linked list sort
      for(Integer num : list)
        System.out.print(num+" ");
        
      Collections.reverse(list);    // Linked list reverse
      System.out.println("ReverseOrder\n"+list);
      
      list.offerFirst(222);
      System.out.println(list);  // Adding element to front of linked list in java
        
      list.remove(2);
      System.out.println(list); //Removing the element from the linked list
      
      List <Integer> newlist = new ArrayList <Integer> (); // Creating a new list
      newlist.add(-123);
      newlist.add(-45);
      newlist.add(-5657);
      
      list.addAll(newlist);     // combines both the lists into a single list
      
      System.out.println(list);
      
      System.out.println(list.indexOf(-123)); // returns the index of the elements
      System.out.println(list.lastIndexOf(2));
      
      List sublist=list.subList(2,4);   //Sublist from list
      System.out.println(sublist);
      
    }
}
