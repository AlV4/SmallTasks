package shapes.coffeeshop;

public class AbstractComponent {

    private String name;
    private int weight;
    private double pricePerGr;
    private double price;

    public AbstractComponent() {
    }

    public AbstractComponent(String name, int weight, double pricePerGr) {
        this.name = name;
        this.weight = weight;
        this.pricePerGr = pricePerGr;
        priceCalculation();
    }



    public void priceCalculation(){
        price = weight * pricePerGr;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getPricePerGr() {
        return pricePerGr;
    }

    public void setPricePerGr(double pricePerGr) {
        this.pricePerGr = pricePerGr;
    }

    @Override
    public String toString() {
       return name + " " + price + " ";
    }
}
