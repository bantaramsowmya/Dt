class Fibonaci
{
public static void main(String args[])
{
int v1,v2,v3,i;
v1=0;
v2=1;
System.out.println(v1);
System.out.println(v2);
for(i=2;i<7;i++)
{
v3=v1+v2;
System.out.println(v3);
v1=v2;
v2=v3;
}
}
}