import java.util.*;
class LeapOrNot
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int a;
System.out.println("enter a num");
a=sc.nextInt();
if(a%4==0)
{
System.out.println("leap");
}
else
{
System.out.println("not a leap");
}
}
}
