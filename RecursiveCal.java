class RecMethod
{
int i=0;
void m1()
{
i++;
System.out.println(i);
if(i==5)
{
return;
}
m1();
}
}
public class RecursiveCal 
{
public static void main(String[] args) 
{
RecMethod r=new RecMethod();
r.m1();
}
}