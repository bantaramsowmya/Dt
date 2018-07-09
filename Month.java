import java.util.*;
class Month
{
public static void main(String args[])
{
int month;
Scanner sc=new Scanner(System.in);
month=sc.nextInt();
if(month>=2&&month<=5)
{
System.out.println("summer");
}
else 
if(month>=6&&month<=9)
{
System.out.println("rainy");
}
else
if(month>=10&&month<=12||month==1)
{
System.out.println("winter");
}
else
{
System.out.println("valid month");
}
}
}
 