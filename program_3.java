/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package online;

/**
 *
 * @author www
 */
import java.util.*;
public class program_3 {
    public static void main(String[] args)  {
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
          
         List<Integer> t = new ArrayList<Integer>();
          List<Integer> t1 = new ArrayList<Integer>();
           List<Integer> t2 = new ArrayList<Integer>();
            List<Integer> t3 = new ArrayList<Integer>();
         
        for (int i= a; i <=b; i++) {
            if(i%3==0 || i%5==0)
            {
             t.add(i);
                System.out.println(t);
            }   
        }
        System.out.println("");
        for (int i = a; i <=b; i++) {
             if(i%3==0 && i%5==0)
            {
                t1.add(i);
                System.out.println(t1);
            }
    }
        System.out.println("");
           for (int i = a; i <=b; i++) {
           if(i%3==0 )
            {
                t2.add(i);
                System.out.println(t2);
            }
    }
           System.out.println("");
                for (int i = a; i <=b; i++) {
               if(i%5==0)
            {
                t3.add(i);
                    System.out.println(t3);
            }
    }
}
}
