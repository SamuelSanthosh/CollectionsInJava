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
            add(1);
            add(88);
            add(9);
            add(17);
            add(17);
            add(9);
            add(17);
            add(91);
            add(27);
            add(1);
            add(17);
        }};
        
        System.out.print(list1);
        
        ArrayList <Integer> list2 = new ArrayList<Integer>()
        {{
            add(1);
            add(34);
            add(23);
            add(76);
            add(-365);
            add(1);
            add(88);
            add(9);
            add(17);
            add(17);
            add(9);
            add(17);
            add(91);
            add(27);
            add(1);
            add(17);
        }};
        
        ArrayList <Integer> list3 = new ArrayList<Integer>();
        
        for(int i:list1)
        {
            list3.add(list2.contains(1) ? 1 : 0);
        }
        
        System.out.println(list3);
    }
}
