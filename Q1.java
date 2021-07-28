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
public class Q1 
{
static void reverse1(int[] a,int m)
{

int temp;

for(int i=0;i<m/2;i++)
{
 temp = a[i]; 
 a[i] = a[m - i - 1]; 
 a[m - i - 1] = temp;
}
for(int i=0;i<m;i++)
{
 System.out.print(" "+a[i]);
}

}

   public static void main(String[]args)
    {
      int[] a;
      int n,i;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter the no of elements");
      n=in.nextInt();
      a=new int[10];
      for(i=0;i<n;i++)
      {
      System.out.print("Enter the value of element"); 
      a[i]=in.nextInt();
      }
      System.out.println("ORIGINAL  ARRAY:");
      for(i=0;i<n;i++)
      {
      System.out.print(" "+a[i]); 
      }
      Q1 obj=new Q1();
      System.out.println("\nREVERSAL OF THE  ARRAY:");
      Q1.reverse1(a,n);
     } 
}
