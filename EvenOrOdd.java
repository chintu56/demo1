//write a java program to check whether the input is even or odd  using %operator.
import java.util.Scanner;
class EvenOrOdd
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enter the number:");
int a=s.nextInt();
if(a%2==0)
{
System.out.println("OUTPUT:");
System.out.println("EVEN");
}
else
{
System.out.println("OUTPUT:");
System.out.println("ODD");
}
}
}