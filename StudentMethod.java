class Student
{
int rollno;
String name;
int marks;
void setStudent(int rollno,String n,int m)
{
this.rollno=rollno;
this.name=n;
marks=m;
}
void displayStudent()
{
System.out.println("Rollno="+rollno);
System.out.println("Name="+name);
System.out.println("Marks="+marks);
}
}
class ExecuteStudent
{
public static void main(String args[])
{
Student s1;
Student s2;
s1=new Student();
s2=new Student();
s1.setStudent(101,"raju",500);
s2.setStudent(102,"radha",550);
s1.displayStudent();
s2.displayStudent();
}
}