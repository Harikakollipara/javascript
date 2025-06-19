import java.util.Scanner;
class MaleORFemale{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter gender (M Or F): ");
char gender = sc.next().charAt(0);
switch (gender) {
case 'M':
case 'm':
System.out.println("Gender:-Male");
break;
case 'F':
case 'f':
System.out.println("Gender:-Female");
 break;
default:
System.out.println("wrong Input");
 }
 }
}
output:
C:\Users\ADMIN\Desktop\loops>java 13.java
Enter gender (M Or F): m
Gender:-Male