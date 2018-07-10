import java.util.*;
class FactN
{
Scanner sc=new Scanner(System.in);
int i=0;
int fact=1;
int n=sc.nextInt();
void m()
{
i++;
fact=fact*i;
if(i==n)
{
System.out.println(fact);
return;
}
m();
}
}
public class FactUser 
{
public static void main(String[] args) 
{
FactN f= new FactN();
f.m();
}
}
