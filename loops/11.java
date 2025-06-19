import java.util.Scanner;
class EvenOddWithSwitch {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
 int num = sc.nextInt();
switch (num % 2) {
 case 0:
System.out.println(num + " is even.");
 break;
case 1:
System.out.println(num + " is odd.");
break;
}
}
}
output:
C:\Users\ADMIN\Desktop\loops>java 11.java
Enter a number: 45
45 is odd.