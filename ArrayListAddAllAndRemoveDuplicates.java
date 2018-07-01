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
        
        
        ArrayList <Integer> list2 = new ArrayList<Integer>()
        {{
            add(1);
            add(34);
            add(23);
            add(76);
            add(-365);
            add(1);
            add(88);
        }};
        
        list1.addAll(list2);
        System.out.println(list1);
        
        for(int i=0;i<list1.size();i++)
        {
            for(int j=i+1;j<list1.size();j++)
            {
                if(list1.get(i).equals(list1.get(j)))
                {
                    list1.remove(j);
                    j--;
                }
            }
        }
        
        System.out.println(list1);
    }
}
