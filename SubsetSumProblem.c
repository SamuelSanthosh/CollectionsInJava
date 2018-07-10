#include<stdio.h>
#include <stdlib.h>
#include<stdbool.h>
bool findSubset(int a[],int N,int sum)
{
    if(sum==0) // base case
        return true;
    if(N==0 && sum!=0) // base case
        return false;
    if(a[N-1]>sum)//checks last element if greater ignore it
        return findSubset(a,N-1,sum);
    else//checks sum by either including or excluding the last element
        return findSubset(a,N-1,sum)||findSubset(a,N-1,sum-a[N-1]);
}
int main()
{
    int N,sum;
    scanf("%d",&N);
    int a[N],solution[N];
    for(int i=0;i<N;i++)
        scanf("%d",&a[i]);
    scanf("%d",&sum);
    if(findSubset(a,N,sum)==true)
        printf("Subset Found");
    else
        printf("Subset Not Found");
}
