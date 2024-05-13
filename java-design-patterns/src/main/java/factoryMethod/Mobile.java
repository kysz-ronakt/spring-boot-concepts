package factoryMethod;

public class Mobile implements Product {


    @Override
    public void build() {
        System.out.println("Build mobile");
    }
}
