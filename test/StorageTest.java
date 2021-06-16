import com.company.CustomerOrder.OrderFactory;
import com.company.CustomerOrder.OrderFactoryImpl;
import com.company.Exceptions.CollectorFullException;
import com.company.Exceptions.FactoryNotExistException;
import com.company.Exceptions.ProductNotExistException;
import com.company.Exceptions.WrongOrderTypeException;
import com.company.Management.Manager;
import com.company.Products.AbstractFactory;
import com.company.Products.Car.CarProductFactory;
import com.company.Products.Car.Tesla;
import com.company.Products.Product;
import com.company.Products.ProductFactory;
import com.company.Products.SpaceShip.SpaceShip;
import com.company.Storage.Collector;
import com.company.Storage.Storehouse;
import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class StorageTest {
    static Collector storehouse;
    static ProductFactory carProductFactory;
    static ProductFactory spaceShipProductFactory;
    static OrderFactory orderFactory;
    private Object CarProductFactory;

    @BeforeClass
    public static void InitializationTest() throws FactoryNotExistException {
        storehouse = Storehouse.getInstance();
        carProductFactory = AbstractFactory.getProductFactory("cars");
        spaceShipProductFactory = AbstractFactory.getProductFactory("spaceship");
        orderFactory = new OrderFactoryImpl(storehouse);

        org.junit.Assert.assertNotNull(storehouse);
        org.junit.Assert.assertNotNull(carProductFactory);
        org.junit.Assert.assertNotNull(spaceShipProductFactory);
        org.junit.Assert.assertNotNull(orderFactory);
    }

    @Test
    public void createCarProductByFactoryTest() throws ProductNotExistException {
        Product expected = new Tesla(5000);
        Product actual = carProductFactory.createProduct("tesla", 5000);
        org.junit.Assert.assertEquals(expected.getDescription(), actual.getDescription());
        org.junit.Assert.assertEquals(expected.getPrice(), actual.getPrice());
    }

    @Test
    public void createSpaceShipProductByFactoryTest() throws ProductNotExistException {
        Product expected = new SpaceShip(50000);
        Product actual = spaceShipProductFactory.createProduct("spaceship",50000);
        org.junit.Assert.assertEquals(expected.getDescription(), actual.getDescription());
        org.junit.Assert.assertEquals(expected.getPrice(), actual.getPrice());
    }

    @Test
    public void addCarProductToStorageTest() throws ProductNotExistException, CollectorFullException {
        Product actual = carProductFactory.createProduct("tesla", 6000);
        storehouse.addProduct(actual);
    }

    @Test
    public void addMoonWalkerProductToStorageTest() throws ProductNotExistException, CollectorFullException {
        Product actual = spaceShipProductFactory.createProduct("moonwalker", 6000);
        storehouse.addProduct(actual);
    }

    @Test
    public void carFactorySingletonTest() {
        ProductFactory expected = carProductFactory;
        ProductFactory actual = com.company.Products.Car.CarProductFactory.getInstance();
        boolean isFactoriesEqual = expected.equals(actual);
        org.junit.Assert.assertTrue(isFactoriesEqual);
    }

    @Test
    public void createOrderTest() throws ProductNotExistException, CollectorFullException,  WrongOrderTypeException {
        int counter = 1;
        Product product = carProductFactory.createProduct("tesla", 7500);
        storehouse.addProduct(product);
        Manager manager = new Manager(orderFactory);
        orderFactory.createOrder("delivery", product);
        org.junit.Assert.assertEquals(counter, manager.getSoldProducts());
    }
}
