package hu.petrik.ingatlanoop;

import java.util.List;

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

        List<RealEstate> expensiveList = r.getMostExpensiveRealEstate(5);
        expensiveList.forEach(System.out::println);

        System.out.println();

        List<RealEstate> cheapList = r.getCheapestRealEstate(10);
        cheapList.forEach(System.out::println);
    }
}
