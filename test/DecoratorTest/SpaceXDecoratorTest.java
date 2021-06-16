package DecoratorTest;

import com.company.Products.Product;
import com.company.TeslaAndSpaceX.EngineSpaceX;
import com.company.TeslaAndSpaceX.PaintJobSpaceX;
import com.company.TeslaAndSpaceX.PlainProduct;
import com.company.TeslaAndSpaceX.SelfDrivingSpaceX;
import org.junit.Test;

public class SpaceXDecoratorTest {

    @Test
    public void getDecoratorTest(){
        Product basicSpaceX = new EngineSpaceX(new PaintJobSpaceX(new SelfDrivingSpaceX(new PlainProduct())));

        System.out.println(basicSpaceX.getDescription());

        System.out.println("Price: " + basicSpaceX.getPrice());
    }
}
