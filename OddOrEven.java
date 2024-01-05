import java.util.*;
class Chintu
{
void chintu()
int a;
{
if(a>=0)
{
System.out.println("entered number is positive");
}
else
{
System.out.println("entered number is negative");
}
}
class PositiveOrNegative
{
public static void main(String agrs[])
{
Chintu c=new Chintu();
Scanner s=new Scanner(System.in);
System.out.println("enter the value:");
int a=s.nextInt();
c.chintu();

}
}
