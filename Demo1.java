import java.util.Scanner;
class Demo1
{
 static int add(int a,int b)
{
return a+b;
}
 static void printTable(int a)
{
for(int i=0;i<=10;i++)
{
System.out.println(a+" * "+i+" = "+a*i);
}
}
public static void main(String agrs[])
{
Scanner s=new Scanner(System.in);
int n1=s.nextInt();
int n2=s.nextInt();
int res=Demo1.add(n1,n2);
System.out.println(res);
Demo1.printTable(n1);
System.out.println();
Demo1.printTable(n2);
}
}

