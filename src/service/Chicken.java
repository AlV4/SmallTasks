package service;

public class Chicken extends AbstractBird {
    private String privateField = "some private field";
    public Chicken(){

    }

    public Chicken(String name, int amount){
        setName(name);
        setAmount(amount);
    }

    public Chicken(String name, int amount, double price){
        setName(name);
        setAmount(amount);
        setPrice(price);
    }
    public Chicken(String name, int amount, double price, double weight){
        setName(name);
        setAmount(amount);
        setPrice(price);
        setWeight(weight);
    }
}
