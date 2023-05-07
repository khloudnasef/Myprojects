
package sos;

import java.util.Scanner;


public class TravelInsurance extends Tourism {

    void TravelInsurance()
    {

        Scanner s=new Scanner(System.in);
        
        System.out.println();
        System.out.println("Insurance Covered By Allianz");
        System.out.println("Select Type of Insurance Plan To Cover: ");
        System.out.println("[1] Medical & Personal Accident (1 pax RM 4/day) ");
        System.out.println("[2] Trip Cancellation (1 pax RM 4/day)");
        System.out.println("[3] Natural Disaters(1 pax RM 4/day)");
        System.out.println("[4] All the Above (1 pax RM 10/day) ");
        System.out.print("Option: ");
        int choiceins = s.nextInt();
        
        if(choiceins == 1)
        {
           insrate = 4;
        }
        else if (choiceins == 2)
        {
           insrate = 4;
        }
        else if (choiceins == 3)
        {
           insrate= 4;
        }
        else if (choiceins == 4)
        {
           insrate = 10;
        }
    }
}
