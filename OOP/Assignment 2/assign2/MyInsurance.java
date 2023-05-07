
package assign2;

import java.util.Scanner;


public class MyInsurance {

    private static int age, agechild,newage; // to be pass value 
    static int amount,choice;
    private static int [] agelist = new int[50];
    
    public static void main(String[] args) {
       
        MyInsurance m = new MyInsurance();// to be able to call a non static method in a static method
        System.out.println("-----------------------------------------------------");
        System.out.println(" \t\tWELCOME TO MYINSURANCE!");
        System.out.println("-----------------------------------------------------");
        
        Scanner s=new Scanner (System.in);
        System.out.println("\nChoose which Package you want: ");
        System.out.println("[1]Individual Plan          [2]Family Package");
        System.out.print("Selection: ");
        int packages = s.nextInt();
        
         
        
        if (packages == 1)// Individual 
        {

          
          System.out.println("\nChoose your Preferred Plan: ");
          System.out.println("[1]Hospitalization Plan           [2]Critical Illness Plan");
          System.out.println("  - RM 150,000 Annual Limit         - RM 300,000 Annual Lifetime Limit");
          System.out.println("  - Entry Age up to 80 years old    - Entry Age up to 80 years old");
          System.out.print("Selection: ");
          int plan = s.nextInt();
          
          System.out.println("\nAre you a First Timer?");
          System.out.println("[1]Yes        [2]No");
          System.out.print("Selection: ");
          choice = s.nextInt();
          
          System.out.print("\nEnter Age: ");
           age = s.nextInt();
          
          
          
         System.out.println("\nYour Age                                        : "+age+ " years old");
         
         
          
          if (plan == 1)// Hospitalization Plan
          {
              IndividualInsurance i = new Hospitalization ();

               
               if(choice == 1)
               {
                    
                    i.RateMonthlyIndv(age);
                    i.StarterfeeIndv();
                    
               }
               else if (choice == 2)
               {                                     
                   i.RateMonthlyIndv(age);                   
               }
               
               i.CalcNewRateIndv(newage);
          }
          else if (plan == 2) // Critical Illness Plan
          {
             IndividualInsurance i = new CriticalIllness ();
                           
               if(choice == 1)
               {                   
                   i.RateMonthlyIndv(age);
                   i.StarterfeeIndv();                   
               }
               else if (choice == 2)
               {                                      
                   i.RateMonthlyIndv(age);
                  
               }
               
                i.CalcNewRateIndv(newage);
          }
              System.out.println("\n\n\tThank You!!");
        }
        
        else if (packages == 2)// Family
        {

          System.out.println("\nChoose your Preferred Plan: ");
          System.out.println("[1]Hospitalization Plan                  [2]BabyCare Plan");
          System.out.println("  - RM 150,000 Annual Limit/person         - RM 100,000 Annual Limit/person");
          System.out.println("  - Entry Age up to 80 years old           - Entry Age up 0-5 years old for children");
          System.out.println("  - 5% Discount for Family Plan            - Entry Age up 18-45 years old for mothers");
          System.out.println("                                           - Only for one mother and one child");
          System.out.print("Selection: ");
          int plan = s.nextInt();
          
          System.out.println();
          
          System.out.println("\nAre you a First Timer?");
          System.out.println("[1]Yes        [2]No");
          System.out.print("Selection: ");
          choice = s.nextInt();
          
          System.out.println();
          
          if (plan == 1) // Hospitalization plan
          {
              
               System.out.print("\nEnter Number of People You want to register: ");
               amount = s.nextInt();
               
              for (int i=0; i<amount; i++)
             {
              System.out.print("Enter Age: ");
               agelist[i] = s.nextInt();
               m.setAgeList(agelist[i], i);
             }
              
              System.out.println();
              
              FamilyInsurance f = new Hospitalization ();
              
              for (int i=0; i<amount; i++)
              {
              f.RateMonthlyFam(agelist[i]);
              }
              
              
             System.out.print("Total Monthly Fee                         : RM ");
             System.out.format("%.2f", f.getSumrate());
             System.out.print("\nAnnual Fee                                : RM ");
             System.out.format("%.2f", (f.getSumrate()*12));
               
              if(choice == 1)
              {
                  f.StarterfeeFam();
              }
          }
          
          else if (plan == 2) // BabyCare Plan
          {
              System.out.print("Enter Age of Child: ");
               agechild = s.nextInt();
              
              System.out.print("Enter Age of Mother: ");
              int a = s.nextInt();
              m.setAge(a);
              
              FamilyInsurance f = new BabyCare ();
              
              
              f.RateMonthlyFam(age);
              
             System.out.print("Total Monthly Fee                         : RM ");
             System.out.format("%.2f", f.getSumrate());
             System.out.print("\nAnnual Fee                                : RM ");
             System.out.format("%.2f", (f.getSumrate()*12));
             
              if(choice == 1)
              {
                  f.StarterfeeFam();
              }
          }
          
            System.out.println("\n\n\tThank You!!");
        }
        
    }
    
    void setAgeList(int age, int i)
    {
        this.agelist[i]=age;
    }
    int getAgelist()
    {
        return age;
    }
    
    
    public void setAgeChild(int age)
    {
        this.agechild=age;
    }
    
    public int getAgeChild()
    {
        return agechild;
    }
    
    
    void setAge(int age)
    {
        this.age=age;
    }
    int getAge()
    {
        return age;
    }
    
    
   
            
}
