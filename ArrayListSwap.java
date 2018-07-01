import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        ArrayList <Integer> list = new ArrayList<Integer>()
        {{
            add(1);
            add(34);
            add(23);
            add(76);
            add(-365);
            add(1);
            add(88);
        }};
        
        System.out.print(list);
        
        Collections.swap(list,2,3);
        System.out.println("\nAfter Swap");
        System.out.println(list);
    }
}
