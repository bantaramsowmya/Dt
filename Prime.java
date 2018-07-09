import java.util.*;
class Prime
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,n,count=0;
n=sc.nextInt();
for(i=1;i<n;i++)
{
if(n%i==0)
{
count++;
}
}
if(count<=2)
{
System.out.println("number is prime");
}
else
{
System.out.println("not a prime");
}
}
}
