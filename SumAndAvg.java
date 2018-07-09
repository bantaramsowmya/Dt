import java.util.*;
class SumAndAvg
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int i;
int m[]=new int[5];
int sum=0;
float avg=0f;
for(i=0;i<5;i++)
{
System.out.println("enter marks");
m[i]=sc.nextInt();
//System.out.println(m[i]);
sum=sum+m[i];
avg=sum/5;
}
System.out.println("total = "+sum);
System.out.println(avg);
}
}

