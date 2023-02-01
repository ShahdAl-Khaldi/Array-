import java.util.Scanner;
public class array {
public static void main(String[] args){
 Scanner in = new Scanner ( System.in );
int array [ ]= new int [4];
int m;
boolean result;
InsertArray (array);
printArray (array);
System.out.println("Enter value to search to :");
m= in.nextInt();
result = SearchArray(array,m);
if(result==true)
System.out.println("Found");
else
System.out.println("NOT_Found");

 }

 public static void InsertArray (int a[ ]){
Scanner out = new Scanner ( System.in );
for (int i=0; i<a.length; i++){
System.out.println("Enter value of Array "+( i+1));
a[i] = out.nextInt();
}
}
public static void printArray (int a[ ]){
for (int i=0; i<a.length; i++){
System.out.println("a["+i+"]="+a[i]);
}
}
public static boolean SearchArray ( int a[ ] , int num) {
for (int i=0; i<a.length; i++){
if(a[i]==num){
return true ;
}
}
 return false;
}
}
