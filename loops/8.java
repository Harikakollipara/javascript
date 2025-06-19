class Armstrong{
public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
System.out.print("Enter a number: ");
int number = sc.nextInt();
 int originalNumber = number;
int result = 0;
while (number != 0) {
int digit = number % 10;
result += digit * digit * digit;
 number /= 10;
}
if (result == originalNumber) {
System.out.println(originalNumber + " is an Armstrong number.");
} else {
System.out.println(originalNumber + " is not an Armstrong number.");
 }
sc.close();
}
}
Output:
Enter a number: 788
788 is not an Armstrong number.
