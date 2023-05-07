
package assign2;


public class BabyCare extends MyInsurance implements FamilyInsurance {
    
    double monthlyrate, monthlyrateChild;
    double sumrate=0;
    int agechild;
    public void RateMonthlyFam(int age)
    {
         MyInsurance m = new MyInsurance();
        
        agechild = super.getAgeChild();
        if (agechild <= 5)
        {
            monthlyrateChild = 78.99;
            sumrate += monthlyrateChild;
        }
        else
        {
            System.out.println("\nInvalid Age for Child!..");
            System.exit(0);
        }
        
        if (age >= 18 && age <=45)
        {
            monthlyrate = 51.99;
            sumrate += monthlyrate;
        }
        else
        {
            System.out.println("\nInvalid Age for Mother!..");
            System.exit(0);
        }
        
        System.out.println("\nMother of Age "+age+" will have a rate of      : RM "+monthlyrate);
        System.out.println("Child of Age "+agechild+" will have a rate of        : RM "+monthlyrateChild);
    }
    
     
    public void StarterfeeFam ()
      {
          System.out.print("\nTotal fee for First Year (incl. Entry Fee): RM ");
          System.out.format("%.2f", (sumrate*12+100));
      }
    
    public double getSumrate()
     {
         return sumrate;
     }
}
