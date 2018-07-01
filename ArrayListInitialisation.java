import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        ArrayList <Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        ArrayList <Integer> obj = new ArrayList<Integer>()
        {{
            add(1);
            add(2);
            add(3);
        }};
        System.out.println(obj);
        ArrayList <Integer> obj1 = new ArrayList<Integer>();
        obj1.add(1);
        obj1.add(2);
        System.out.println(obj1);
    }
}
