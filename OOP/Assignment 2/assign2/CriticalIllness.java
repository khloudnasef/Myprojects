
package assign2;


public class CriticalIllness implements IndividualInsurance{
    double monthlyrate;
    
    MyInsurance m = new MyInsurance();
    
     public void RateMonthlyIndv(int age)
     {
          if (age <= 18)
         {
            monthlyrate = 64.99; 
         }
         else if (age >= 19 && age<60)
         {
             monthlyrate = 122.99;
         }
         else if (age >= 60 && age<=80)
         {
             monthlyrate = 533.49;
         }
          else
         {
             System.out.println("\nInvalid Age!");
             System.exit(0);
         }
          
           System.out.println("Current Monthly Fee                             : RM "+monthlyrate);
           System.out.print("Current Annual Fee                              : RM ");
           System.out.format("%.2f", monthlyrate*12);
     }
     
      public void StarterfeeIndv()
      {
          System.out.print("\nTotal Insurance for First Year (incl. Entry Fee): RM ");
          System.out.format("%.2f", (monthlyrate*12+100),"\n");
      }
    
      public void CalcNewRateIndv(int newage)
      {
         newage = m.getAge() +1;
         
          if (newage <= 18)
         {
            monthlyrate = 64.99; 
         }
         else if (newage >= 19 && newage<60)
         {
             monthlyrate = 122.99;
         }
         else if (newage >= 60 && newage<=80)
         {
             monthlyrate = 533.49;
         }
          else
         {
             System.out.println("\nInvalid Age!");
             System.exit(0);
         }
          
          System.out.println("\nMonthly Fee for Next Year                       : RM "+monthlyrate);
      }
}

     