package Basics;
import java.util.Scanner;
public class BinarySearch{
public static void main(String[] args) {
int low ,mid = 0 ,high,n,k,i;
int a[]=new int[20];
 Scanner s= new Scanner(System.in);
 System.out.println("ENTER THE SIZE OF THE ARRAY");
n=s.nextInt();
 System.out.println("ENTER THE ELEMENTS INTO THE ARRAY");
for(i=0;i<n;i++) {
a[i]=s.nextInt();
 }
 System.out.println("ENTER THE ELEMENT TO BE SEARCH");
k=s.nextInt();
low=0;
high=n-1;
while(low<=high) {
mid=(low+high)/2;
if(a[mid]<k) {
low=mid+1;
 }
else if(a[mid]>k) {
high=mid-1;
 }
else
break;
 }
if(a[mid]==k) {
 System.out.println( mid+1 +" is the location of the search 
element");
 }
else {
 System.out.println("Element Not Found--Error Occured");
 }
 }
 }
