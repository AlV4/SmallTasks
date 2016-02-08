package service;

public class Duck extends AbstractBird implements Service {
    public Duck(String name, int amount) {
        super(name, amount);
    }
}