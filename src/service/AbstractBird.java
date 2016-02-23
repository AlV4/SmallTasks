package service;

public abstract class AbstractBird{
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractBird)) return false;

        AbstractBird that = (AbstractBird) o;

        if (Double.compare(that.getWeight(), getWeight()) != 0) return false;
        if (getAmount() != that.getAmount()) return false;
        if (Double.compare(that.getPrice(), getPrice()) != 0) return false;
        return !(getName() != null ? !getName().equals(that.getName()) : that.getName() != null);

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(getWeight());
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + getAmount();
        temp = Double.doubleToLongBits(getPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    public String getName() {
        return name;
    }

    @Service
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