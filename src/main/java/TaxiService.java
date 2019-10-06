public class TaxiService {
    public float calculateTheCost(float tripDistanceKm) {
        int landingCost = 60;
        int costKm = 20;
        float costOfTrip = tripDistanceKm * costKm + landingCost;
        return costOfTrip;
    }

    public float calculateDiscount(float costOfTrip) {
        int maxDiscount = 100;
        int sumForDiscount = 1000;
        float sumDiscount = 0;
        if (costOfTrip >= sumForDiscount) {
          sumDiscount = costOfTrip*5/100;
        }
        if (sumDiscount>maxDiscount) {
            sumDiscount=maxDiscount;
        }
        return sumDiscount;
    }
}
