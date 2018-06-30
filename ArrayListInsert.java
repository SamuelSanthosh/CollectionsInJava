import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Hello {

    public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int N = S.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for(int i=0;i<N;i++)
		{
		    list.add(S.nextInt());
		}
		
		int pos = S.nextInt();
		int value = S.nextInt();
		
		list.add(pos,value);
		
		System.out.println(list);
    }
}
