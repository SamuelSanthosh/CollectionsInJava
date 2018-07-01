import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        ArrayList <Integer> list = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        System.out.println(list);
        
        for(Integer i : list)  // Enhanced for-loop
        {
            System.out.println(i);
        }
        
        for(int i=0;i<list.size();i++) // for;loop
        {
            System.out.print(list.get(i)+" ");
        }
        
        int count=0;
        while(list.size() > count)  // while loop
        {
            System.out.println(list.get(count++)+" ");
        }
        
        Iterator itr = list.iterator(); // Iterator
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
