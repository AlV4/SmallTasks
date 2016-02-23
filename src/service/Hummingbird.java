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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Hummingbird)) return false;
        if (!super.equals(o)) return false;

        Hummingbird that = (Hummingbird) o;

        if (getSecretAmount() != that.getSecretAmount()) return false;
        if (Double.compare(that.getAnotherPrice(), getAnotherPrice()) != 0) return false;
        if (Double.compare(that.getAdditionalWeight(), getAdditionalWeight()) != 0) return false;
        return !(getAnotherName() != null ? !getAnotherName().equals(that.getAnotherName()) : that.getAnotherName() != null);

    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        result = 31 * result + (getAnotherName() != null ? getAnotherName().hashCode() : 0);
        result = 31 * result + getSecretAmount();
        temp = Double.doubleToLongBits(getAnotherPrice());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getAdditionalWeight());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
