

package sos;

import java.util.Scanner;


public class TravelPlace extends Tourism {
    
   Scanner s = new Scanner (System.in);
   
   
   void runTravelPlace() // methods
   {   
      
    System.out.println(); 
    System.out.println("Travel Places We Provide: ");
    System.out.println("[1] Langkawi");
    System.out.println("[2] Perhentian Island");
    System.out.println("[3] Pangkor Island");
    System.out.println("[4] Tioman Island");
    System.out.print("Select Destination: ");

    int choiceplace = s.nextInt();
    
    System.out.println();
    
  
    if (choiceplace == 1)
     {
         System.out.println("Select Hotel We Provide: ");
         System.out.println("[1] Berjaya Langkawi Resort (RM 134/person)");
         System.out.println("[2] The Ritz-Carlton, Langkawi (RM 575/person)");
         System.out.print("Option: ");
         int choicehotel = s.nextInt();
         
         if (choicehotel == 1)
         {
             hotelname = "Berjaya Langkawi Resort";
             hotelrate = 134;
         }
         else if (choicehotel == 2)
         {
             hotelname = "The Ritz-Carlton, Langkawi";
             hotelrate = 575;
         }
         
     }
    else if (choiceplace == 2)
     {
         System.out.println("Select Hotel We Provide: ");
         System.out.println("[1] Alunan Resort (RM 218/person)");
         System.out.println("[2] MIMPI Perhentian Resort (RM 182/person)");
         System.out.print("Option: ");
         int choicehotel = s.nextInt(); 
         if (choicehotel == 1)
         {
             hotelname = "Alunan Resort";
             hotelrate = 218;
         }
         else if (choicehotel == 2)
         {
             hotelname = "MIMPI Perhentian Resort";
             hotelrate = 182;
         }
     }
    else if (choiceplace == 3)
     {
         System.out.println("Select Hotel We Provide: ");
         System.out.println("[1] Pangkor Sandy Beach Resort (RM 87/person)");
         System.out.println("[2] Nipah Guesthouse Pangkor (RM 166/person)");
         System.out.print("Option: ");
         int choicehotel = s.nextInt();  
         
         if (choicehotel == 1)
         {
            hotelname = "Pangkor Sandy Beach Resort";
            hotelrate = 87; 
         }
         else if (choicehotel == 2)
         {
             hotelname = "Nipah Guesthouse Pangkor";
             hotelrate = 166;
         }
     }
    else if (choiceplace == 4)
     {
         System.out.println("Select Hotel We Provide: ");
         System.out.println("[1] Tunamaya Beach & Spa Resort (RM 243/person)");
         System.out.println("[2] Aman Tioman Beach Resort (RM 116/person)");
         System.out.print("Option: ");
         int choicehotel = s.nextInt(); 
         
         
         if (choicehotel == 1)
         {
            hotelname = "Tunamaya Beach & Spa Resort";
            hotelrate = 243;
         }
         else if (choicehotel == 2)
         {
            hotelname = "Aman Tioman Beach Resort";
            hotelrate = 116;
         }
     }
    
   }
  
}
