import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class Hello {

    public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		while(S.hasNextInt())
		{
		    list.add(S.nextInt());
		}
		Collections.sort(list);
		
		System.out.println(list);
    }
}
