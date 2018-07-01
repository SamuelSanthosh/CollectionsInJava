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
        
        list1.addAll(list2);
        Collections.sort(list1,Collections.reverseOrder());
        System.out.println(list1);
        
    }
}
