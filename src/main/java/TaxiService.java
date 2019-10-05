public class TaxiService {
    public float calculateTheCost(float tripDistanceKm) {
        int landingCost = 60;
        int costKm = 20;
        float costOfTrip = tripDistanceKm * costKm + landingCost;
        return costOfTrip;
    }
}
