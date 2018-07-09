import java.util.*;
class Alphabet
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
char alp;
String s1;
s1=sc.nextLine();
alp=s1.charAt(0);
if((alp>='a'&alp<='z')||(alp>='A'&&alp<='Z'))
{
System.out.println("it is a alphabet");
}
else
{
System.out.println("not a alphabet");
}
}
}

