public class Main {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();
        float tripThisDistanceKm=100;
        float costOfThisTrip=taxiService.calculateTheCost(tripThisDistanceKm);
        float discountOfThisTrip=taxiService.calculateDiscount(costOfThisTrip);
        costOfThisTrip=costOfThisTrip-discountOfThisTrip;
        System.out.println(discountOfThisTrip);
        System.out.println(costOfThisTrip);
    }
}
