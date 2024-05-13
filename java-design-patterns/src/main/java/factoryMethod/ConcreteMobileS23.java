package factoryMethod;

public class ConcreteMobileS23 implements Creator {


    @Override
    public Product createProduct() {

        Product product = new Mobile();
        return product;

    }
}
