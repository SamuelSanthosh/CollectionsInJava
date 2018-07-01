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
        }};
        
        boolean b = list.contains(23);
        System.out.println(b);
        list.remove(new Integer(23));
        System.out.println(list);
    }
}
