import java.util.Scanner;
class Patterns
{
public static void main(String[] args)
{
/*1.Scanner s=new Scanner(System.in);
System.out.println("Enter no of rows:");
int rows =s.nextInt();

for(int i=1;i<=rows;i++)
{
    for(int j=1;j<=rows;j++)
       {
            System.out.print("*");
       }
 System.out.println();
 }
}
}
output:
Enter no of rows:
4
****
****
****
****
*/

/*2.Scanner s=new Scanner(System.in);
System.out.println("Enter no of rows:");
int rows =s.nextInt();

for(int i=0;i<rows;i++)
{
    for(int j=1;j<rows;j++)
       {
            System.out.print(1+i);
       }
 System.out.println();
 }
}
}
output:
Enter no of rows:
6
11111
22222
33333
44444
55555
66666*/

/*3.Scanner s=new Scanner(System.in);
System.out.println("Enter no the rows:");
int rows=s.nextInt();

for(int i=1;i<=rows;i++)
{
    for(int j=1;j<=rows;j++)
       {
            System.out.print(j);
       }
 System.out.println();
 }
}
}
output:
Enter no the rows:
6
123456
123456
123456
123456
123456
123456
*/

/*4.Scanner s=new Scanner(System.in);
System.out.println("Enter no the rows:");
int rows=s.nextInt();
int n=1;
for(int i=1;i<=rows;i++)
{
    for(int j=1;j<=rows;j++)
       {
            System.out.print(n+" ");
            n=n+2;
       }
 System.out.println();
 }
}
}
output:
Enter no the rows:
5
1 3 5 7 9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 47 49
*/



/*5.Scanner s=new Scanner(System.in);
System.out.println("Enter no the rows:");
int rows=s.nextInt();
int n=1;
for(int i=1;i<=rows;i++)
{
    for(int j=1;j<=rows;j++)
       {
            System.out.print(n++ +" ");
          
       }
 System.out.println();
 }
}
}
output:
Enter no the rows:
5
1 2 3 4 5
6 7 8 9 10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
*/



/*6.Scanner s=new Scanner(System.in);
System.out.println("Enter no the rows:");
int rows=s.nextInt();

for(int i=1;i<=rows;i++)
{
    for(int j=0;j<=rows;j++)
       {
            System.out.print(j%2==0?"0":"1");
       }
 System.out.println();
 }
}
}
output:
Enter no the rows:
5
10101
10101
10101
10101
10101*/


/*7.Scanner s=new Scanner(System.in);
System.out.println("Enter no the value:");
int value=s.nextInt();
int i,j,k;

for(i=1;i<=value;i++)
{
    for(j=0;j<=value-i;j++)
       {
            System.out.print(" ");
       }
   for(k=1;k<=i;k++)
{
System.out.print("*"  +  " ");
}
 System.out.println();
 }
}
}
output:
Enter no the value:
5
     *
    * *
   * * *
  * * * *
 * * * * *
*/

/*8.Scanner s=new Scanner(System.in);
System.out.println("Enter no the value:");
int value=s.nextInt();
int i,j,k;

for(i=1;i<=value;i++)
{
    for(j=0;j<=value-i;j++)
       {
            System.out.print(" ");
       }
   for(k=1;k<=i;k++)
{
System.out.print((2*k)  +  " ");
}
 System.out.println();
 }
}
}
output:
Enter no the value:
5
     2
    2 4
   2 4 6
  2 4 6 8
 2 4 6 8 10
*/


/*9.Scanner s=new Scanner(System.in);
int a=s.nextInt();
int n=1;
for(int i=1;i<=a;i++)
{
System.out.println();
 for(int j=0;j<=a;j++)
 {
     System.out.print(n + " ");
      n++;  

if(n==10)
{
n=1;
}
}
System.out.println();
}
}
}
output:
6

1 2 3 4 5 6 7

8 9 1 2 3 4 5

6 7 8 9 1 2 3

4 5 6 7 8 9 1

2 3 4 5 6 7 8

9 1 2 3 4 5 6
*/


/*10.Scanner s=new Scanner(System.in);
System.out.println("Enter the value:");
int a=s.nextInt();
int i,j;
for(i=0;i<=a;i++)
{
for(j=0;j<i;j++)
{
System.out.print("*");
}
System.out.println(i);
}
}
}
output:
Enter the value:
6
0
*1
**2
***3
****4
*****5
******6*/




















