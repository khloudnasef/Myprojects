
package covidvaccine;

import java.util.Scanner;


public class ViralVector extends Vaccine{
    
    Scanner s=new Scanner (System.in);
    private static double storage;
    private static int orderUnit;
    double price = 0;
    
   ViralVector(int choiceDev)
  {
      if (choiceDev == 1)
        {
            storage = 6;
        }
        else if (choiceDev == 2)
        {
            storage = 4;
        }
        else if (choiceDev == 3)
        {
            storage = 17;
        }
        else if (choiceDev == 4)
        {
            storage = 18;
        }
        else if (choiceDev == 5)
        {
            storage= 8 ;
            
        }
  }
    
   
   public void setStorage (double storage)
    {
          this.storage = storage;      
    }
    
    public double getStorage()
    {
        return storage;
    }
    
    public void setOrderUnit ()
    {
          System.out.print("\nEnter the Quantity of the Vaccine you want: ");
          orderUnit = s.nextInt();
    }
    
    public int getOrderUnit()
    {
        return orderUnit;
    }

    double callPrice()
    {
        
       if (super.getDevelepor() == "AstraZeneca Oxford")
        {
            price = 4.00;
        }
        else if (super.getDevelepor() == "AstraZeneca Covax")
        {
            price = 3.50;
        }
        else if (super.getDevelepor() == "Johnson & Johnson")
        {
            price = 10.00;
        }
        else if (super.getDevelepor() == "Sputnik-V")
        {
            price = 10;
        }
        else if (super.getDevelepor() == "CanSinoBio(Convidecia)")
        {
            price = 17;
        }
        
        return price;
    }
    
     public void display()
    {
           super.display();
           System.out.println("Vaccine Developer       : "+super.getDevelepor());
           System.out.println("Origin of Country       : "+super.getOrigin());
           System.out.println("Storage Temperature     : "+getStorage()+"\u00B0");
           System.out.println("Your Quantity           : "+getOrderUnit());
           System.out.println("Vaccine Price per piece : RM "+callPrice());
           System.out.println("Total Price             : RM "+(getOrderUnit()* callPrice()));
    }  
}
