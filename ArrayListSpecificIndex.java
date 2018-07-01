import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        ArrayList <Integer> list1 = new ArrayList<Integer>()
        {{
            add(1);
            add(34);
            add(23);
            add(76);
            add(-365);
        }};
        
        ArrayList <Integer> list2 = new ArrayList<Integer>();
        list2.add(32);
        list2.add(76);
        list2.add(-23);
        
        
        System.out.print(list1+ " "+list2);
        
        System.out.println("\nSpecific Index");
        
        list1.addAll(2,list2);
        
        System.out.println(list1);
        
    }
}
