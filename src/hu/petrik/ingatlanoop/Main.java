package hu.petrik.ingatlanoop;

public class Main {

    public static void main(String[] args) {
        RealEstates r = new RealEstates("realestatetransactions.csv");
        System.out.println(r.getSalesNumber() + " db");
    }
}
