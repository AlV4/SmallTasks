package service;

public class Eagle extends AbstractBird {

    private Eagle(int amount){
        super("Eagle", amount);
    }


    public Eagle(String name, int amount) {
        super(name, amount);
    }
}