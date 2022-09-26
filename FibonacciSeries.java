package Basics;
import java.util.Scanner;
public class FibonnaicSeries{
public static void main(String[] args) {
int f1=0,f2=1,f3,i=0,n;
 System.out.println("Enter The Limit Number ");
 Scanner s = new Scanner(System.in);
n=s.nextInt();
 System.out.print(f1+ " " +f2);
while(i<=n) {
f3=f1+f2;
 System.out.print(" "+f3);
i++;
f1=f2;
f2=f3;
 }
}
}
