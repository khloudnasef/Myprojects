
package covidvaccine;

import java.util.Scanner;


public class mRNA_V extends Vaccine{
    
    Scanner s=new Scanner (System.in);
    private static double storage;
    private static int orderUnit;
    double price = 0;
    
    mRNA_V(int choiceDev)
    {
        if (choiceDev == 1)
        {
            storage = -70;
        }
        else if (choiceDev == 2)
        {
            storage = -50;
        }
        else if (choiceDev == 3)
        {
            storage = 4;
        }
        else if (choiceDev == 4)
        {
            storage = 5;
        }
        else if (choiceDev == 5)
        {
            storage= -70 ;  
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
        
        if (super.getDevelepor()== "Pfizer BioNTech")
        {
            price = 19.50;
        }
        else if (super.getDevelepor()== "Moderna")
        {
            price = 25.50;
        }
        else if (super.getDevelepor()== "ARCov(Walvax)")
        {
            price = 16.00;
        }
        else if (super.getDevelepor()== "CureVac")
        {
            price = 11.80;
        }
        else if (super.getDevelepor()== "Sanofi-GSK")
        {
            price = 11.00;
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
    
    public void Check_Storage()
    {
        String developer[]={"Pfizer BioNTech", "Moderna", "ARCov(Walvax)", "CureVac", "Sanofi-GSK"};
        double storage[]={-70, -50, 4, 5, -70};
        String origin[]={"Germany", "USA", "China", "Germany", "French"};
       
        System.out.println("\nVaccine / Origin / Storage Temprature");
        System.out.println("---------------------------------------------------------");
   
        for (int v = 0; v<5; v++)
        {
            if(storage[v] <= -70)
            { 
                System.out.println(developer[v]+" / "+origin[v]+" / "+storage[v]);
            }
        }
        
    }
}
