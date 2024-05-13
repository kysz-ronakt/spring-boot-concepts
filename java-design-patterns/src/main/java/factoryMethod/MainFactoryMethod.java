package factoryMethod;

public class MainFactoryMethod {


    public static void main(String[] args) {

        Creator creator = new ConcreteMobileS23();
        Product product = creator.createProduct();

        product.build();


    }
}
