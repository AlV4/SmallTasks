package shapes.coffeeshop;

public class Ingredient extends AbstractComponent {

    public Ingredient() {
    }

    public Ingredient(String name, int weight, double pricePerGr){
        super(name, weight, pricePerGr);
    }

    public static Ingredient componentCreator(String name, int weight, double pricePerGr){

        return new Ingredient(name, weight, pricePerGr);
    }
}
