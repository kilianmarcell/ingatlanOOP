package hu.petrik.ingatlanoop;

public class Main {

    public static void main(String[] args) {
        RealEstates r = new RealEstates("realestatetransactions.csv");
        System.out.println(r.getSalesNumber() + " db");
        System.out.println(r.getBiggestRealEstate());
        System.out.println(r.getSummary());
        System.out.println(r.getCountOfRealEstateWithoutSize());
        System.out.println(r.isSaleRealEstateInCity("SACRAMENTO"));
        System.out.println(r.isSaleRealEstateInCity("Budapest"));
        System.out.println(r.getCountOfSalesInCity("SACRAMENTO"));
        System.out.println(r.getSalesInCity("SACRAMENTO"));
        for (String city:r.getSortedCities()) {
            System.out.println(city);
        }
    }
}
