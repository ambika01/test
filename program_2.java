import java.util.*;
public class program_2 {
     
         public static void main(String args[])
         {
 Scanner sc=new Scanner(System.in);
        System.out.println("enter size");
        int size=sc.nextInt();
        int a[][]=new int[size][size];
         int b[][]=new int[size][size];
        System.out.println("enter values");
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("input:");
         for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
                
            }
            System.out.println("");
            
        }
         System.out.println("output:");
 for(int i=1;i>=0;i--)
    {
        for(int j=1;j>=0;j--)
        {
        System.out.print(a[i][j]+" ");
        }
        System.out.println();
        
    }
        }
      
}

