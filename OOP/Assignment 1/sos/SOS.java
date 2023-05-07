package sos;


public class SOS { // calling for classes and methods 

    public static void main(String[] args) {
        
       
        
        System.out.println("WELCOME TO BERJAYA PANTAI AGENCY");
        System.out.println();
        
        Tourism t = new Tourism();  // calling classes
        t.setName();
        t.setIc();
        t.setNo();
        t.setAdd();
        
        
        TravelPlace p = new TravelPlace();
        p.runTravelPlace(); // calling a method from another class using its object
        
        TravelPackage pkg = new TravelPackage();
        pkg.TravelPackage();
        t.setD();
        
        
        TravelInsurance i = new TravelInsurance();
        i.TravelInsurance();
      
        t.CalculateIns();
        t.CalculatePrice( );
        t.display();
        
    }
    
}
