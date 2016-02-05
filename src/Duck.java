public class Duck extends AbstractBird implements Service{
    public Duck(String name, int amount) {
        super(name, amount);
    }

    @Override
    public void c() {

    }

    @Override
    public void a() {

    }

    @Override
    public String toString() {
        return getAmount() + " Duck";
    }
}
