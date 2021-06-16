package DecoratorTest;

import com.company.Products.Product;
import com.company.TeslaAndSpaceX.EngineTesla;
import com.company.TeslaAndSpaceX.PaintJobTesla;
import com.company.TeslaAndSpaceX.PlainProduct;
import com.company.TeslaAndSpaceX.SelfDrivingTesla;
import org.junit.Test;

public class TeslaDecoratorTest {

    @Test
    public void getDecoratorTest(){
        Product basicTesla = new EngineTesla(new PaintJobTesla(new SelfDrivingTesla(new PlainProduct())));

        System.out.println(basicTesla.getDescription());

        System.out.println("Price: " + basicTesla.getPrice());
    }
}
