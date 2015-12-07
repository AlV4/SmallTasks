package shapes.coffeeshop;

import java.util.Arrays;

public class CoffeShop {
    private Ingredient[]standartIngredients = new Ingredient[7];

    public CoffeShop() {
    }

    public void shopInit(){
        standartIngredients[0] = Ingredient.componentCreator("Water", 50, 0);
        standartIngredients[1] = Ingredient.componentCreator("Milk", 50, 0.1);
        standartIngredients[2] = Ingredient.componentCreator("Sugar", 5, 0.1);
        standartIngredients[3] = Ingredient.componentCreator("Coffee", 5, 2);
        standartIngredients[4] = Ingredient.componentCreator("Black tea", 5, 1);
        standartIngredients[5] = Ingredient.componentCreator("Green tea", 5, 1.1);
        standartIngredients[6] = Ingredient.componentCreator("Tea with bergamot", 5, 1.2);

    }

    public void addNewStandartIngredient(Ingredient i){
        if(i != null){
            int position = standartIngredients.length;
            Ingredient[] newIngredients = new Ingredient[standartIngredients.length + 1];
            newIngredients = Arrays.copyOf(standartIngredients, newIngredients.length);
            newIngredients[position] = i;
            standartIngredients = newIngredients;
            System.out.println("You successfully added a new ingredient "+ i.toString()+"!");
            return;
        }
        System.out.println("You need create ingredient first!");
    }

    public Drink blackCoffee(int sugar){
        Drink drink = new Drink();
        while (sugar > 0){
            drink.addjustIngredient(standartIngredients[2]);
            sugar--;
        }
        drink.setName(StandartDrinks.BLACK_COFFEE.toString());
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[3]);
        drink.finishPreparing();
        System.out.println(drink.toString());
        return drink;
    }

    public Drink coffeeWithMilk(int sugar){
        Drink drink = new Drink();
        while (sugar > 0){
            drink.addjustIngredient(standartIngredients[2]);
            sugar--;
        }
        drink.setName(StandartDrinks.COFFEE_WITH_MILK.toString());
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[3]);
        drink.addjustIngredient(standartIngredients[1]);
        drink.finishPreparing();
        System.out.println(drink.toString());
        return drink;
    }

    public Drink americano(int sugar){
        Drink drink = new Drink();
        while (sugar > 0){
            drink.addjustIngredient(standartIngredients[2]);
            sugar--;
        }
        drink.setName(StandartDrinks.AMERICANO.toString());
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[3]);
        drink.finishPreparing();
        System.out.println(drink.toString());
        return drink;
    }

    public Drink capuccino(int sugar){
            Drink drink = new Drink();
        while (sugar > 0){
            drink.addjustIngredient(standartIngredients[2]);
            sugar--;
        }
            drink.setName(StandartDrinks.CAPUCCINO.toString());
            drink.addjustIngredient(standartIngredients[0]);
            drink.addjustIngredient(standartIngredients[3]);
            drink.addjustIngredient(standartIngredients[1]);
            drink.addjustIngredient(standartIngredients[1]);
            drink.finishPreparing();
            System.out.println(drink.toString());
            return drink;

    }

    public Drink mocaccino(int sugar){
        Drink drink = new Drink();
        while (sugar > 0){
            drink.addjustIngredient(standartIngredients[2]);
            sugar--;
        }
        drink.setName(StandartDrinks.MOCACCINO.toString());
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[3]);
        drink.addjustIngredient(standartIngredients[1]);
        drink.addjustIngredient(standartIngredients[1]);
        drink.finishPreparing();
        System.out.println(drink.toString());
        return drink;
    }

    public Drink blackTea(int sugar){
        Drink drink = new Drink();
        while (sugar > 0){
            drink.addjustIngredient(standartIngredients[2]);
            sugar--;
        }
        drink.setName(StandartDrinks.BLACK_TEA.toString());
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[4]);
        drink.finishPreparing();
        System.out.println(drink.toString());
        return drink;
    }

    public Drink greenTea(int sugar){
        Drink drink = new Drink();
        while (sugar > 0){
            drink.addjustIngredient(standartIngredients[2]);
            sugar--;
        }
        drink.setName(StandartDrinks.GREEN_TEA.toString());
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[5]);
        drink.finishPreparing();
        System.out.println(drink.toString());
        return drink;
    }

    public Drink teaWithBergamot(int sugar){
        Drink drink = new Drink();
        while (sugar > 0){
            drink.addjustIngredient(standartIngredients[2]);
            sugar--;
        }
        drink.setName(StandartDrinks.BLACK_TEA.toString());
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[0]);
        drink.addjustIngredient(standartIngredients[6]);
        drink.finishPreparing();
        System.out.println(drink.toString());
        return drink;
    }

   public Ingredient[] getStandartIngredients() {
        return standartIngredients;
    }
}
