import java.util.Scanner;
public class MyClass {
    static void rotate90(int a[][])
    {
        transpose(a);
        reverseCols(a);
    }
    static void transpose(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                int t = a[j][i];
                a[j][i] = a[i][j];
                a[i][j] = t;
            }
        }
    }
    static void reverseCols(int a[][])
    {
        for(int i=0;i<a[0].length;i++)
        {
            for(int j=0,k=a[0].length-1;j<k;j++,k--)
            {
                int  t = a[j][i];
                a[j][i] = a[k][i];
                a[k][i] = t;
            }
        }
    }
    static void printMatrix(int a[][])
    {
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[0].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
       Scanner S = new Scanner(System.in);
       int R = S.nextInt();
       int C = S.nextInt();
       int a[][] = new int [R][C];
       for(int i=0;i<R;i++)
       {
            for(int j=0;j<C;j++)
            {
                a[i][j] = S.nextInt();
            }    
       }
       //int a[][] =  {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
       rotate90(a);
       printMatrix(a);
    }
}
