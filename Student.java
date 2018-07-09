class Student
{
int rollno;
String name;
int marks;
}
class ExecuteStudent
{
public static void main(String args[])
{
Student s1;
Student s2;
s1=new Student();
s2=new Student();
s1.rollno=101;
s1.name="sowmya";
s1.marks=80;
s2.rollno=102;
s2.name="swetha";
s2.marks=90;
System.out.println(s1.rollno);
System.out.println(s1.name);
System.out.println(s1.marks);
System.out.println(s2.rollno);
System.out.println(s2.name);
System.out.println(s2.marks);
}
}