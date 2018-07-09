class A
{
int x;
String y;
}
class B
{
int rollno;
A a;
}
class C
{
public static void main(String args[])
{
B b=new B();
b.rollno=10;
b.a=new A();
b.a.x=40;
b.a.y="sowmya";
System.out.println(b.rollno);
System.out.println(b.a.x);
System.out.println(b.a.y);
}
}
