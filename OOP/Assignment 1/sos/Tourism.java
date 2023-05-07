
package sos;

import java.util.Scanner;



public class Tourism { // parent class
    
   static TravelPlace p = new TravelPlace(); // creating objects of the classes, p(object),TravelPlace(class)
   static TravelPackage pkg = new TravelPackage();
   static TravelInsurance i = new TravelInsurance();
    
    String name,address,ic,no;
    static String hotelname;
    static int duration, no_ppl;
    static double hotelrate, insrate;
    static double InsCost;
   
   
    
     Scanner s = new Scanner (System.in);  
     
 
     
    void setName()
    {
        System.out.print("Enter Your Name: ");
        name=s.next();
    }
    void setIc()
    {
       System.out.print("Enter Your IC: ");
        ic = s.next(); 
    }
    void setNo()
    {
        System.out.print("Enter Your Phone Number: ");
        no = s.next(); 
    }
    void setAdd()
    {
        System.out.print("Enter Your Address: ");
        address =s.next(); 
    }
  void setD ()
    {
        System.out.print("Enter Duration of Trip: ");
        duration = s.nextInt ();
    }
  
    
    int getD ()
    {
       return duration; 
    }

    String getName()
    {
       return name;
    }
    String getIc()
    {
       return ic;
    }
    String getNo()
    {
        return no;
    }
    String getAdd()
    {
        return address;
    }
    
   
   public double CalculateIns()
   {
       return InsCost = duration*insrate*no_ppl;
   }
    
   public double CalculatePrice ()
    {
       return duration*hotelrate*no_ppl + CalculateIns();
    }
    
    
     void display ()
    {
        System.out.println();
        System.out.println("Name                        : "+name);
        System.out.println("IC                          : "+ic);
        System.out.println("Number of People            : "+no_ppl);
        System.out.println("Place                       : "+hotelname);
        System.out.println("Duration of Trip            : "+duration);
        System.out.println("Total Insurance Cost        : RM "+InsCost);
        System.out.println("Total Cost include Insurance: RM "+CalculatePrice());
    }
}
    
