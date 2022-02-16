package hu.petrik.ingatlanoop;

public class Main {

    public static void main(String[] args) {
        RealEstates r = new RealEstates("realestatetransactions.csv");
        System.out.println(r.getSalesNumber() + " db");
        System.out.println(r.getBiggestRealEstate());
        System.out.println(r.getSummary());
        System.out.println(r.getCountOfRealEstateWithoutSize());
    }
}
