import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        ArrayList <Integer> list1 = new ArrayList<Integer>(100);
            list1.add(1);
            list1.add(34);
            list1.add(23);
            list1.add(76);
            list1.add(-365);
            list1.add(1);
            list1.add(88);
            
            list1.trimToSize();
        System.out.println(list1);
            list1.add(23);
        System.out.println(list1);    
        
    }
}
