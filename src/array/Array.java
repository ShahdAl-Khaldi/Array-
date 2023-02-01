package array;

import java.util.Scanner;

public class Array {

    public static void main(String[] args) {
       
//       Scanner s =new Scanner (System.in);
//       System.out.println("Enter Size of Array");
//       int size;
//      size=s.nextInt();
//       
//      double[]salaries = new double[size];
//        

//----------------------------------------------//




//       Scanner s =new Scanner (System.in);
//        int a=0,sum1 =0;
//    do{
//        System.out.println("input the number to sum");
//        a=s .nextInt();
//        sum1+=a;
//            System.out.println("the sum is "+sum1);
//    }
//    while (sum1<=100);


//---------------------------------//


 /*
String []names = new String [2] ;
Scanner s = new Scanner (System.in) ;
for (int i = 0; i < names.length; i++)
{
   System.out.println ("plaese enter name to reverse:");
   String word= s.nextLine ();
 names[i]=word;
}
         {
             for (int i = names.length-1; i >=0; i--)
            System.out.println(names[i]); 
            
        }
         */
 /*
Scanner s = new Scanner (System.in);
System.out.println("Enter size of array");
int size = s.nextInt();
int numbers []=new int [size];
System.out.println("Enter "+size+" array elements");
int max = Integer.MIN_VALUE;
for(int i =0;i<numbers.length;i++){
numbers [i] = s.nextInt();
if(numbers [i]>max)
max = numbers [i];
}
 int second = Integer.MIN_VALUE;
for(int i =0;i<numbers.length;i++){
if(numbers[i]!=max && numbers[i]>second)
second = numbers [i];
  }
System.out.println(second+"is second largest element");*/
 /*
 int arr []= new int[]{2, 4, 1, 5, 3};
        int x = 1;
        System.out.println("Array Before : ");  
        for (int i = 0; i < arr.length; i++) {  
            System.out.print(arr[i] + " ");  
        } 
        for(int i = 0; i < x; i++){  
            int j, firstNum;  
            firstNum = arr[0];  
            for(j = 0; j < arr.length-1; j++){    
                arr[j] = arr[j+1];  
            }
            arr[j] = firstNum;  
        }
        System.out.println();  
        System.out.println("Array After: ");  
        for(int i = 0; i< arr.length; i++){  
            System.out.print(arr[i] + " ");  
        }  
        System.out.println(" "); */ 
 /*
        int arr[] = {4, 2, 3, 8, 9};
        int position = 0;
        for (int i = position; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        System.out.print("Array = [");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i]+",");
        }
        System.out.println("]");
 */
 
 
 
// 
// int arr[] = {4, 2, 3, 8, 9};
// Scanner s =new Scanner (System.in);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println(" ");
//        System.out.println("Enter the nu. of delete");
//        int position = s.nextInt();
//        for (int i = position; i < arr.length - 1; i++) {
//            arr[i] = arr[i + 1];
//        }
//        System.out.print("Array = [");
//        for (int i = 0; i < arr.length - 1; i++) {
//            System.out.print(arr[i]+",");
//        }
//        System.out.println("]");




//
// 
//Scanner s= new Scanner(System.in);
//        System.out.println("Input number of rows of matrix ");
//        int matrix=s.nextInt();
//        System.out.println("Input number of columns of matrix");
//        int columns=s.nextInt();   
//   
//     int [][]firstMatrix=new int [matrix][columns];
//     int [][]secondMatrix=new int [matrix][columns];
//     int [][]result=new int [matrix][columns];
//     
//     
//    System.out.println("Input elements of first matrix");
//        for (int i = 0; i < matrix; i++) {
//            for (int j = 0; j < columns; j++) {
//        firstMatrix[i][j]=s.nextInt();
//        }
//        }
//      
//          System.out.println("Input the elements of second matrix");
//        for (int i = 0; i < matrix; i++) {
//            for (int j = 0; j < columns; j++) {
//           secondMatrix[i][j]=s.nextInt();
//        }
//        }
//      
//       
//                for (int i = 0; i < matrix; i++) {
//                    for (int j = 0; j < columns; j++) {
//                         result[i][j]=firstMatrix[i][j]+secondMatrix[i][j];
//                    }
//            
//        }
//            System.out.println("Sum of the matrices ");
//            for (int i = 0; i < matrix ; i++) {
//                for (int j = 0; j <  columns; j++) {
//                    System.out.print(result[i][j]+"\t");}
//                System.out.println();
//        }
//        
// 
 
 
//
// int[]num={2, 3, 1, 7, 9, 5, 11, 3, 5};
// int max=Integer.MIN_VALUE;
// int min =Integer.MAX_VALUE;
//        for (int i = 0; i < num.length; i++) {
//            if(num[i]>max)
//                max=num[i];
//            else if(num[i]<min)
//                min=num[i];
//        }
//      System.out.println("max "+max);
//     System.out.println("min "+min);
//    int difference=max-min;
//System.out.println("The maximum difference between two elements of the said array elements = "+difference);
//
//

    }
 
 
 
 
 
 
 
 
 
 
 
}
