import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        ArrayList <Object> list1 = new ArrayList<Object>()
        {{
            add(1);
            add(34);
            add(23);
            add(76);
            add(-365);
            add(1);
            add(88);
            add("aaaa");
            add(5.99);
            add(767.5);
        }};
        System.out.println(list1);
        
        ArrayList <Integer> list2 = (ArrayList<Integer>)list1.clone();
        System.out.println(list2);
        
        list1.add("sfadfgsfhgdjfgdfdsa");
        list1.remove(5.99);
        
        System.out.println(list1);
        System.out.println(list2);
    }
}
