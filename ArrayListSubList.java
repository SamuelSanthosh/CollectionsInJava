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
        
        ArrayList <Integer> al = new ArrayList<Integer>(list.subList(1,3));
        System.out.print(al+" ");
        
        List <Integer> al1 = list.subList(2,4);
        System.out.print(al1+" ");
    }
}
