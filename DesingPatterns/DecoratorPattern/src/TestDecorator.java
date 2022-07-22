public class TestDecorator {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza = new ChickenMasala(pizza);
        pizza = new Onion(pizza);
        pizza = new Mozzarella(pizza);

        System.out.println("You're getting " + pizza.description());

    }
}
