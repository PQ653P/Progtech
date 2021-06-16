package SpecialTeslaBuildTest;

import com.company.SpecialProducts.SpecialTesla;
import com.company.SpecialProducts.SpecialTeslaBuilder;
import com.company.SpecialProducts.SpecialTeslaEngineer;
import org.junit.Test;

public class SpecialTeslaTest {

    @Test
    public void getSpecialTesla(){
        SpecialTeslaBuilder CTOModelS = new SpecialTeslaBuilder(); // CTO means Configure-to-Order

        SpecialTeslaEngineer teslaEngineer = new SpecialTeslaEngineer(CTOModelS);

        teslaEngineer.makeTesla();

        SpecialTesla tesla = teslaEngineer.getSpecialTesla();

        System.out.println("CTO Tesla built");

        System.out.println("Wheel Size in Inch: " + tesla.GetWheelSize());

        System.out.println("Number of Engines: " + tesla.GetNumberOfEngines());

        System.out.println("Color of the Interior: " + tesla.GetColorInInterior());

        System.out.println("Number of Seats: " + tesla.GetNumberOfSeats());

    }
}
