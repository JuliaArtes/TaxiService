public class Main {
    public static void main(String[] args) {
        TaxiService taxiService = new TaxiService();
        float tripThisDistanceKm = 100;
        float costOfThisTripRu = taxiService.calculateTheCost(tripThisDistanceKm);
        System.out.println(costOfThisTripRu);
    }
}
