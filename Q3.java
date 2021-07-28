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
public class Q3 
{
    static int sum=0;
static int staticvar(int[] b,int m,int d)
 {
    for(int i=0;i<d;i++)
   {
    if(b[i]==m)
        sum=sum+1;
    }
return sum;
}
static int nonstaticvar(int[] b,int m,int d)
{
    int sum1=0;
    for(int i=0;i<d;i++)
   {
    if(b[i]==m)
        sum1=sum1+1;
   }
    return sum1;
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
      System.out.println("\nEnter the number to be counted:");
      int k=in.nextInt();
      Q3 obj=new Q3();
      System.out.println("\nno of times "+k+"present in THE  ARRAY using static variable:"+Q3.staticvar(a,k,n));
      System.out.println("\nno of times "+k+"present in THE  ARRAY using non static variable:"+Q3.nonstaticvar(a,k,n));
     } 
}
