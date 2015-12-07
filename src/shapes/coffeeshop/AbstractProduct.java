package shapes.coffeeshop;

import java.util.Arrays;

public abstract class AbstractProduct {

    private String name;
    private AbstractComponent[] ingredients;
    private double price;

    public AbstractProduct() {
        productInit();
    }

    private void productInit() {
        ingredients = new AbstractComponent[100];
    }

    public void finishPreparing(){
        ingredients = Arrays.copyOf(ingredients, firstEmptyPlace());
        priceCalculation();
    }

    private void priceCalculation(){
        for (AbstractComponent ingredient:ingredients){
            if(ingredient!=null){
                price+=ingredient.getPrice();
            }
        }
    }

    public void addjustIngredient(AbstractComponent i) {
            ingredients[firstEmptyPlace()] = i;
    }

    private int firstEmptyPlace() {
            for (int i = 0; i < ingredients.length; i++) {
                if (ingredients[i] == null) {
                    return i;
                }
            }
           return ingredients.length;
    }

    @Override
    public String toString() {
        return "=========< " + name + ". Ing: " + Arrays.toString(ingredients) + " PRICE: " + price + " >==========";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public AbstractComponent[] getIngredients() {
        return ingredients;
    }
}
