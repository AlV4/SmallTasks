public class AbstractPrintingEdition {
    private Titles name;
    private int numberOfEdition;
    private double price;

    public AbstractPrintingEdition() {
    }

    public AbstractPrintingEdition(Titles name, int numberOfEdition, double price) {
        this.name = name;
        this.numberOfEdition = numberOfEdition;
        this.price = price;
    }

    public Titles getName() {
        return name;
    }

    public void setName(Titles name) {
        this.name = name;
    }

    public int getNumberOfEdition() {
        return numberOfEdition;
    }

    public void setNumberOfEdition(int numberOfEdition) {
        this.numberOfEdition = numberOfEdition;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
