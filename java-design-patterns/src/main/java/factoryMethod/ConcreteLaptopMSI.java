package factoryMethod;

public class ConcreteLaptopMSI implements Creator {
    @Override
    public Product createProduct() {

        Product product = new Laptop();


        return product;
    }
}
