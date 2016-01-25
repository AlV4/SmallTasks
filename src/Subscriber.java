import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Subscriber implements Observer{
    private String name;
    private String eMail;
    private String address;
    private ArrayList<AbstractPrintingEdition> subsribes = new ArrayList<>();

    public Subscriber() {
    }

    public Subscriber(String name, String eMail, String address) {
        this.name = name;
        this.eMail = eMail;
        this.address = address;
    }

    public void subscriberNotified(AbstractPrintingEdition edition){
        System.out.println(name + " notified about " + edition.getName() + "!");
    }

    public ArrayList<AbstractPrintingEdition> getSubsribes() {
        return subsribes;
    }

    public void setSubsribes(ArrayList<AbstractPrintingEdition> subsribes) {
        this.subsribes = subsribes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void update(Observable o, Object arg) {
        if(arg instanceof AbstractPrintingEdition) {
            for (AbstractPrintingEdition edition : subsribes){
                if(edition.equals(arg)){
                    System.out.println(name + " notified about " + ((AbstractPrintingEdition)arg).getName() + "!");
                }
            }
        }
    }
}
