import java.util.*;
class Max3
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a,b,c;
System.out.println("enter 3 values");
a=sc.nextInt();
b=sc.nextInt();
c=sc.nextInt();
if((a>b)&&(a>c))
{
System.out.println("big=a");
}
else if((b>c)&&(b>a))
{
System.out.println("big=b");
}
else
{
System.out.println("big=c");
}
}
}
