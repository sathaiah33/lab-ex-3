/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author sathaiah balaji
 */
public class Q2 
{
static void mean(double[] b,int m)
{
double sum=0;
double avg;
for(int i=0;i<m;i++)
{
sum=sum+b[i];
}
avg=sum/m;
System.out.println(" "+avg);


}

   public static void main(String[]args)
    {
      double[] a;
      int n,i;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the no of elements");
      n=in.nextInt();
      a=new double[10];
      for(i=0;i<n;i++)
      {
      System.out.print("Enter the value of element"); 
      a[i]=in.nextDouble();
      }
      System.out.println("ORIGINAL  ARRAY:");
      for(i=0;i<n;i++)
      {
      System.out.print(" "+a[i]); 
      }
      Q2 obj=new Q2();
      System.out.println("\naverage OF THE  ARRAY:");
      Q2.mean(a,n);
     } 
}
