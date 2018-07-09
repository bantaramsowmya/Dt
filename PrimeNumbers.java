class PrimeNumbers
{
public static void main(String args[])
{
int i;
int n;
for(i=1;i<=100;i++)
{
int count=0;
for(n=i;n<i;n++)
{
if(i%n==0)
{
count++;
}
}
if(count<=2)
{
System.out.println(i);
continue;
}
}
} 
}

