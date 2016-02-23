package service;

public class Hummingbird extends AbstractBird {

    private String anotherName;
    private int secretAmount;
    private double anotherPrice;
    private double additionalWeight;

    public Hummingbird() {
    }
    @Service
    private void annotationTest(){}

    public String getAnotherName() {
        return anotherName;
    }
    @Service
    public void setAnotherName(String anotherName) {
        this.anotherName = anotherName;
    }

    public int getSecretAmount() {
        return secretAmount;
    }

    public void setSecretAmount(int secretAmount) {
        this.secretAmount = secretAmount;
    }

    public double getAnotherPrice() {
        return anotherPrice;
    }

    public void setAnotherPrice(double anotherPrice) {
        this.anotherPrice = anotherPrice;
    }

    public double getAdditionalWeight() {
        return additionalWeight;
    }

    public void setAdditionalWeight(double additionalWeight) {
        this.additionalWeight = additionalWeight;
    }
}
