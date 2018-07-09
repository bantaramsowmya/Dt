class Biggest
{
public static void main(String args[])
{
int i;
int r[]={101,103,102,105,104};
int temp=r[0];
for(i=0;i<5;i++)
{
if(temp<r[i])
{
temp=r[i];
}
}
System.out.println("biggest="+temp);
}
}
