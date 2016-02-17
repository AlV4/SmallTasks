package service;

public abstract class AbstractBird implements Service{
    protected double weight;
    protected int amount;
    protected double price;
    private String name;

    public AbstractBird(){}

    public AbstractBird(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "{ Bird: "+ getClass().getSimpleName() + ", name: " + name +", amount: " + amount +
               ", weight: " + weight + ", price: " + price + " }";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}