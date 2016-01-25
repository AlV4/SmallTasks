import java.util.ArrayList;

public class PublishingOffice {
    private ArrayList<Subscriber> subscribers;
    public ArrayList<AbstractPrintingEdition> editions;
    public static final int TIMES = 0;
    public static final int DAILY = 1;
    public static final int MENS = 2;
    public static final int GEO = 3;
    public static final int COSMO = 4;

    public PublishingOffice() {
        officeInit();
    }

    private void officeInit() {
        subscribers = new ArrayList<>();
        editions = new ArrayList<>();

        NewsPaper theTimes = new NewsPaper(Titles.The_Times, 1, 5.75);
        NewsPaper daily = new NewsPaper(Titles.Daily_Telegraph, 1, 3.45);
        Magazine mens = new Magazine(Titles.Mens_Health, 1, 60.15);
        Magazine geo = new Magazine(Titles.National_Geographic, 1, 70.5);
        Magazine cosmo = new Magazine(Titles.Cosmopolitan, 1, 49.99);

        editions.add(theTimes);
        editions.add(daily);
        editions.add(mens);
        editions.add(geo);
        editions.add(cosmo);
    }

    public void subscribe(Subscriber subscriber, AbstractPrintingEdition edition) {
        subscriber.getSubsribes().add(edition);
        subscribers.add(subscriber);
    }

    public void unSubscribe(Subscriber subscriber, AbstractPrintingEdition edition) {
        subscriber.getSubsribes().remove(edition);
        if(subscriber.getSubsribes().size() == 0){
            subscribers.remove(subscriber);
        }
    }

    public void unSubscribeFromAll(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void subscribe(Subscriber subscriber, ArrayList<AbstractPrintingEdition> editions) {
        for (AbstractPrintingEdition edition : editions){
            subscriber.getSubsribes().add(edition);
        }
        subscribers.add(subscriber);
    }

    public void notifySubscribers(AbstractPrintingEdition edition){
        if (subscribers.size() > 0){
            for (Subscriber subscriber : subscribers){
                for(AbstractPrintingEdition currentEdition : subscriber.getSubsribes()){
                    if (currentEdition.equals(edition)){
                        subscriber.subscriberNotified(edition);
                    }
                }
            }
        }else {
            System.out.println("Unfortunately, there is no subscribers yet!");
        }
    }

}
