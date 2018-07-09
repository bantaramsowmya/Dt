class Hello
{
public static void main(String args[])
{
String s1="hello";
String s2="hello";
String s3=new String("world");
String s4=new String("world");
if(s1==s2)
{
System.out.println("both address are equal");
}
else
{
System.out.println("both address are not equal");
}
if(s3==s4)
{
System.out.println("both address are equal");
}
else
{
System.out.println("both address are not equal");
}
}
}