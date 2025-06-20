import java.util.Scanner;
class Specific_value{
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Enter the size: ");
int n = sc.nextInt();
int arr[]= new int[n];
System.out.println("Enter the elements:");
for(int i = 0; i < n; i++) {
 arr[i] = sc.nextInt();
}
System.out.print("Enter value to check: ");
int val = sc.nextInt();
int foundIndex=-1;
for(int i = 0; i < n; ++i) {
if(arr[i]==val){
foundIndex=i;
break;
}
if(foundIndex != -1)
{
System.out.print("Contains the specific value ");
}
else{
System.out.print("Does not contains the specific value");
}
}
}
}
output:
Enter the size: 5
Enter the elements:
1
2
3
4
5
Enter value to check: 3
Does not contains the specific value
        