
package assign2;


public class Hospitalization implements IndividualInsurance, FamilyInsurance{
    
    double monthlyrate;
    
    MyInsurance m = new MyInsurance();
 
   
     public void RateMonthlyIndv(int age)
     {
         if (age <= 18)
         {
            monthlyrate = 60.99; 
         }
         else if (age >= 19 && age<60)
         {
             monthlyrate = 106.99;
         }
         else if (age >= 60 && age <= 80)
         {
             monthlyrate = 503.99;
         }
         else
         {
             System.out.println("Invalid Age!");
             System.exit(0);
         }
         
         System.out.println("Current Monthly Fee                             : RM "+monthlyrate);
         System.out.print("Current Annual Fee                              : RM ");
         System.out.format("%.2f", monthlyrate*12);
  
     }
     
      public void StarterfeeIndv ()
      {
          System.out.print("\nTotal Insurance for First Year (incl. Entry Fee): RM ");          
          System.out.format("%.2f", (monthlyrate*12+100),"\n");         
      }
      
      public void CalcNewRateIndv(int newage)
      {
          newage = m.getAge() +1;
          if (newage <= 18)
         {
            monthlyrate = 60.99; 
         }
         else if (newage >= 19 && newage<60)
         {
             monthlyrate = 106.99;
         }
         else if (newage >= 60 && newage <= 80)
         {
             monthlyrate = 503.99;
         }
         else
         {
             System.out.println("Invalid Age!");
             System.exit(0);
         }
        
          System.out.println("\nMonthly Fee for Next Year                       : RM "+monthlyrate);
      }
      
      double sumrate=0;
      public void RateMonthlyFam(int age)
      { 
 
          if (age <= 18)
         {
            monthlyrate = 57.99; 
            sumrate += monthlyrate;
         }
         else if (age >= 19 && age<60)
         {
             monthlyrate = 100.99;
             sumrate += monthlyrate;
         }
         else if (age >= 60 && age <= 80)
         {
             monthlyrate = 477.99;
             sumrate += monthlyrate;
         }
         else
         {
             System.out.println("\nInvalid Age!..");
             System.exit(0);
         }  
        
          System.out.println("Person of Age "+age+" will have a rate of      : RM "+monthlyrate*0.95);
          
      }
      
      public double getSumrate()
      {
          return sumrate;
      }
      public void StarterfeeFam ()
      {
          System.out.print("\nTotal fee for First Year (incl. Entry Fee): RM ");
          System.out.format("%.2f", (sumrate*12+100));
      }   
     
}
