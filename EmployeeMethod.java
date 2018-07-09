class Employee
{
int empid;
String name;
int empsal;
void setEmployee(int i,String n,int s)
{
empid=i;
name=n;
empsal=s;
}
void displayEmployee()
{
System.out.println("Empid="+empid);
System.out.println("Name="+name);
System.out.println("Empsal="+empsal);
}
}
class ExecuteEmployee
{
public static void main(String args[])
{
Employee e1;
Employee e2;
e1=new Employee();
e2=new Employee();
e1.setEmployee(111,"raju",660000);
e2.setEmployee(112,"radha",770000);
e1.displayEmployee();
e2.displayEmployee();
}
}
