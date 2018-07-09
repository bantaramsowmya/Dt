import java.util.*;
class Search
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j,s;
int arr[]=new int[5];
System.out.println("enter no of elements");
j=sc.nextInt();
for(i=0;i<5;i++)
{
System.out.println("enter the elements=");
arr[i]=sc.nextInt();
}
System.out.println("enter the element for search");
s=sc.nextInt();
for(i=0;i<5;i++)
{
if(s==arr[i])
{
System.out.println("element is at location"+i);
}
if(s!=arr[i])
{
System.out.println("element not found");
}
}
}
}