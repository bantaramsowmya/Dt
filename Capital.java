import java.util.*;
class Capital
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i,j;
String v1;
char ch[]=new char[15];
v1=sc.nextLine();
for(i=0;i<6;i++)
{
ch[i]=v1.charAt(i);
j=(int)ch[i];
if(ch[i]!='\0')
{
j=j-32;
}
System.out.print((char)j);
}
}
}




