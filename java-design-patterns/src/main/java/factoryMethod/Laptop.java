package factoryMethod;

public class Laptop implements Product {


    @Override
    public void build() {
        System.out.println("Building laptop");
    }
}
