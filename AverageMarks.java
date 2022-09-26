package Basics;
import java.util.Scanner;
public class AverageMarksOfStudent{
public static void main(String[] args) {
int m1,m2,m3,average;
String name;
Scanner s =new Scanner(System.in);
// letter can be also taken as char name=s.next().charAt(0);
name=s.next();
char c =name.charAt(0);
m1=s.nextInt();
m2=s.nextInt();
m3=s.nextInt();
average=(m1+m2+m3)/3;
System.out.println(c);
System.out.println(average);
}
}
