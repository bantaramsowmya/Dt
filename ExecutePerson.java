class Student

{
    
String name;
int age;

int rollno;

int marks;

void setStudent(String n,int a,int r,int m)
{
name=n;
age=a;
rollno=r;
marks=m;
}
void displayStudent()
{
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("rollno="+rollno);
System.out.println("marks="+marks);
}
}


class Employee

{
   
String name;

int age;
    
int empId;
    
float empSal;
    
void setEmployee(String n,int a,int i,int s)
{
name=n;
age=a;
empId=i;
empSal=s;
}
void displayEmployee()
{
System.out.println("name="+name);
System.out.println("age="+age);
System.out.println("empId="+empId);
System.out.println("empSal="+empSal);
}
}
public class ExecutePerson 
{

    
public static void main(String[] args) 
{


Student s1=new Student();

Student s2=new Student();


Employee e1=new Employee();

Employee e2=new Employee();



s1.setStudent("raju",21,101,456);

s2.setStudent("radha",22,102,556);


e1.setEmployee("ramesh",26,111,67000);

e2.setEmployee("suresh",26,112,77000);

 
s1.displayStudent();
s2.displayStudent();
e1.displayEmployee();
e2.displayEmployee();   
}


}