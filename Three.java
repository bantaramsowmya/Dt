import java.util.*;
class Three
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int x;
int y;
int z;
x=sc.nextInt();
y=sc.nextInt();
z=sc.nextInt();
if(x>y&&x>z)
{
System.out.println("Great="+x);
}
else if(y>z&&y>x)
{
System.out.println("Great="+y);
}
else
{
System.out.println("Great="+z);
}
}
}
 