
package sos;

import java.util.Scanner;


public class TravelPackage extends Tourism{

    Scanner s=new Scanner (System.in);

  void TravelPackage() // method
   {
       System.out.println();
       System.out.println("Packages We Provide:");
       System.out.println("[1] Honeymoon (2 pax) ");
       System.out.println("[2] Family (5 pax) ");
       System.out.println("[3] Company (n pax) ");
       System.out.print("Select Package: ");
       int choicepkg = s.nextInt();
       
       
       
       if(choicepkg == 1)
       {
           no_ppl = 2;
       }
       else if(choicepkg == 2)
       {
            no_ppl = 5;
       }
       else if(choicepkg == 3)
       {
            System.out.print("Enter Number of People: ");
            int ppl = s.nextInt();

            no_ppl = ppl;
 
       }
    
   }

}
