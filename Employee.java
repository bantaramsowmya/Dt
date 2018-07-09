class Employee
{
int empid;
String name;
int empsal;
}
class ExecuteEmployee
{
public static void main(String args[])
{
Employee e1;
Employee e2;
e1=new Employee();
e2=new Employee();
e1.empid=111;
e1.name="suresh";
e1.empsal=670000;
e2.empid=112;
e2.name="ramesh";
e2.empsal=770000;
System.out.println(e1.empid);
System.out.println(e1.name);
System.out.println(e1.empsal);
System.out.println(e2.empid);
System.out.println(e2.name);
System.out.println(e2.empsal);
}
}
