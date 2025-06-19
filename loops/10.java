class Largeramong3{
public static void main(String[] args) {
 int a = 100, b = 110, c = 120;
int largest;
if (a >= b && a >= c) {
largest = a;
} else if (b >= a && b >= c) {
largest = b;
} else {
largest = c;
 }
System.out.println("Largest number is: " + largest);
    }
}
output:
Largest number is: 120