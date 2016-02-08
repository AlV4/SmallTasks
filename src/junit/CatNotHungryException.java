package junit;

public class CatNotHungryException extends RuntimeException {

    public CatNotHungryException(String message) {
        super(message);
    }
}