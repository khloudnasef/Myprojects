
package covidvaccine;

import java.util.Scanner;


public class CovidVaccine {

    private static String name, phone;
    
    public static void main(String[] args) {
        
     
        System.out.println("-----------------------------------------------------");
        System.out.println(" \tWELCOME TO COVID 19 PURCHASING CENTRE!");
        System.out.println("-----------------------------------------------------");
        
        
        Scanner s=new Scanner (System.in);
        System.out.println("\nChoose which Type of Vaccine you want: ");
        System.out.println("[1]mRNA                      [2]Viral Vector");
        System.out.print("Selection: ");
        int vaccineType = s.nextInt();
        
        
        if(vaccineType == 1)// mRNA-V
        {
             mRNA_V r = new mRNA_V(0);
             System.out.println("\n*DISCLAMIER*");
             System.out.println("These vaccines need to be kept at -70C\u00B0 : ");
             r.Check_Storage();
            
            mRNA_V rna[]= new mRNA_V[5];
            System.out.println("\nChoose which Vaccine Developer you want: \n");
            System.out.println("[1]Pfizer BioNTech");
            System.out.println("[2]Moderna ");
            System.out.println("[3]ARCov(Walvax)");
            System.out.println("[4]CureVac ");
            System.out.println("[5]Sanofi-GSK ");
            System.out.print("Selection: ");
            int choiceDev = s.nextInt();

            
            if(choiceDev == 1)
            {
                rna[0]= new mRNA_V(1);
                rna[0].setDevelepor("Pfizer BioNTech");
                rna[0].setOrigin("Germany");
            }
            else if(choiceDev == 2)
            {
                rna[1]= new mRNA_V(2);
                rna[1].setDevelepor("Moderna");
                rna[1].setOrigin("USA");
            }
            else if(choiceDev == 3)
            {
                rna[2]= new mRNA_V(3);
                rna[2].setDevelepor("ARCov(Walvax)");
                rna[2].setOrigin("China");
            }
            else if(choiceDev == 4)
            {
                rna[3]= new mRNA_V(4);
                rna[3].setDevelepor("CureVac");
                rna[3].setOrigin("German");
            }
            else if(choiceDev == 5)
            {
                rna[4]= new mRNA_V(5);
                rna[4].setDevelepor("Sanofi-GSK");
                rna[4].setOrigin("French");
            }
           
            
           System.out.print("\nEnter Your Name : ");
            name = s.next();
           System.out.print("Enter Your Phone Number: ");
           phone = s.next();
           rna[choiceDev-1].setOrderUnit();
           
           rna[choiceDev-1].display();
          
        }
        
        
        else if(vaccineType == 2)//Viral Vector
        {
            ViralVector v[]= new ViralVector[5];
            System.out.println("\nChoose which Vaccine Developer you want: \n");
            System.out.println("[1]AstraZeneca Oxford");
            System.out.println("[2]AstraZeneca Covax");
            System.out.println("[3]Johnson & Johnson");
            System.out.println("[4]Sputnik-V  ");
            System.out.println("[5]CanSinoBio(Convidecia)");
            System.out.print("Selection: ");
            int choiceDev = s.nextInt();
            
            ViralVector vv = new ViralVector(choiceDev);
            
            if(choiceDev == 1)
            {
                v[0]= new ViralVector(1);
                v[0].setDevelepor("AstraZeneca Oxford");
                v[0].setOrigin("UK");
               
            }
            else if(choiceDev == 2)
            {
                v[1]= new ViralVector(2);
                v[1].setDevelepor("AstraZeneca Covax");
                v[1].setOrigin("Global");
            }
            else if(choiceDev == 3)
            {
                v[2]= new ViralVector(3);
                v[2].setDevelepor("Johnson & Johnson");
                v[2].setOrigin("Netherlands");
            }
            else if(choiceDev == 4)
            {
                v[3]= new ViralVector(4);
                v[3].setDevelepor("Sputnik-V");
                v[3].setOrigin("Russia");
            }
            else if(choiceDev == 5)
            {
                v[4]= new ViralVector(5);
                v[4].setDevelepor("CanSinoBio(Convidecia)");
                v[4].setOrigin("China");
            }
            
            
           System.out.print("\nEnter Your Name : ");
           name = s.next();
           System.out.print("Enter Your Phone Number: ");
           phone = s.next();
           vv.setOrderUnit();
           
           vv.display();
         
        }
        
        
    }
    
    public String getName()
    {
        return name;
    }
    public  String getPhone()
    {
        return phone;
    }
}
