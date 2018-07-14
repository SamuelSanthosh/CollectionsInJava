import java.util.Scanner;
public class MyClass {
    static int countNoOfOnes(int arr[],int low,int high)
    {
        if (high >= low)
        {
            int mid = low+(high-low)/2;
            if((mid == high || arr[mid+1] == 0) && arr[mid] == 1)
                return mid+1;
            if(arr[mid] == 1)
                return countNoOfOnes(arr,mid+1,high);
            return countNoOfOnes(arr,low,mid-1);   
        }
        return 1;
    }
    public static void main(String args[]) {
        Scanner S = new Scanner(System.in);
        int N = S.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = S.nextInt();
        System.out.println(countNoOfOnes(arr,0,N-1));    
    }
}
