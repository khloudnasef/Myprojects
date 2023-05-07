
package covidvaccine;


abstract class Vaccine {
    
    private static String developer;
    private static String  Origin_country ;
    
    CovidVaccine vac = new CovidVaccine();
    
    public String getDevelepor ()
    {
        return developer;
    }
    public String getOrigin ()
    {
        return Origin_country;
    }
    
    public void setDevelepor (String developer)
    {
       this.developer = developer;
    }
    
    public void setOrigin (String Origin_country)
    {
       this.Origin_country = Origin_country;
    }
    
    
    public void display()//polymorphism
    {

        System.out.println("\nYour Name               : "+vac.getName());
        System.out.println("Your Phone Number       : "+vac.getPhone());
    }
    
    abstract double callPrice(); // abstract method
}
