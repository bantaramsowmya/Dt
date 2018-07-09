import java.util.*;
class Ascii
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char ch;
String s;
s=sc.nextLine();
ch=s.charAt(0);
System.out.println("Ascii="+(int)ch);
}
}