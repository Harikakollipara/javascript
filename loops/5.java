import java.util.Scanner;
class larger
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
System.out.println("Enter 3 number:");
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
if (a >= b && a >= c)
System.out.println(a + " is the largest number.");
else if (b >= a && b >= c)
System.out.println(b + " is the largest number.");
else
System.out.println(c + " is the largest number.");
}
}
output:
Enter 3 number:
10
20
15
20 is the largest number.
