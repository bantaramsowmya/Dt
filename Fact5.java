class Fact5
{
int i=0;
int fact=1;
void m()
{
i++;
fact=fact*i;
if(i==5)
{
System.out.println(fact);
return;
}
m();
}
}
public class Factorial {

public static void main(String[] args) {
Fact5 f=new Fact5();
f.m();
}
}
