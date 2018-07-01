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
        
        System.out.print(list);
        System.out.println("\nLast Occurence");
        System.out.print(list.lastIndexOf(17)+" ");
        System.out.print(list.lastIndexOf(1));
        
        System.out.println("\nFirst Occurence");
        System.out.print(list.indexOf(17)+" ");
        System.out.print(list.indexOf(1));
        
    }
}
