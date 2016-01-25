import java.util.ArrayList;

public class Launcher {

    public static void main(String[] args) {

        Subscriber subscriber1 = new Subscriber("First", " some eMail", "someAddress");
        Subscriber subscriber2 = new Subscriber("Second", " some eMail", "someAddress");
        Subscriber subscriber3 = new Subscriber("Third", " some eMail", "someAddress");
        Subscriber subscriber4 = new Subscriber("Fourth", " some eMail", "someAddress");
        Subscriber subscriber5 = new Subscriber("Main", " some eMail", "someAddress");

        PublishingOffice office = new PublishingOffice();

        office.subscribe(subscriber1, office.editions.get(PublishingOffice.MENS));

        ArrayList <AbstractPrintingEdition> editionArr =  new ArrayList<>();
        editionArr.add(office.editions.get(PublishingOffice.MENS));
        editionArr.add(office.editions.get(PublishingOffice.GEO));
        office.subscribe(subscriber2, editionArr);

        ArrayList<AbstractPrintingEdition> editionArr1 =  new ArrayList<>();
        editionArr1.add(office.editions.get(PublishingOffice.COSMO));
        editionArr1.add(office.editions.get(PublishingOffice.TIMES));
        editionArr1.add(office.editions.get(PublishingOffice.DAILY));
        office.subscribe(subscriber3, editionArr1);

        office.subscribe(subscriber4, office.editions.get(PublishingOffice.DAILY));

        office.subscribe(subscriber5, office.editions);

        for (AbstractPrintingEdition edition : office.editions){
            office.notifySubscribers(edition);
            System.out.println("----------------");
        }

        office.unSubscribe(subscriber3, office.editions.get(PublishingOffice.TIMES));
        office.unSubscribeFromAll(subscriber5);
        System.out.println("================================");

        for (AbstractPrintingEdition edition : office.editions){
            office.notifySubscribers(edition);
            System.out.println("----------------");
        }


    }
}
