import java.util.*;
class Char
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
String s1;
s1=sc.nextLine();
ch=s1.charAt(0);
if(ch>=97&&ch<=123)
{
System.out.println("small");
}
else if(ch>=65&&ch<=90)
{
System.out.println("capital");
}
else if(ch>='0'&&ch<='9')
{
System.out.println("numbers");
}
else
{
System.out.println("special character");
}
}
}

