package hu.petrik.ingatlanoop;

import java.time.LocalDateTime;

public class RealEstate {
    private String street;
    private String city;
    private int zip;
    private String state;
    private int beds;
    private int baths;
    private int sqFt;
    private String type;
    private LocalDateTime sale_date;
    private int price;
    private double latitude;
    private double longitude;

    private RealEstate(String s) {
        String[] dates = s.split(",");
        this.street = dates[0];
        this.city = dates[1];
        this.zip = Integer.parseInt(dates[2]);
        this.state = dates[3];
        this.beds = Integer.parseInt(dates[4]);
        this.baths = Integer.parseInt(dates[5]);
        this.sqFt = Integer.parseInt(dates[6]);
        this.type = dates[7];
        //this.sale_date = dates[8];
        this.price = Integer.parseInt(dates[9]);
        this.longitude = Double.parseDouble(dates[10].replace('.', ','));
        this.latitude = Double.parseDouble(dates[11].replace('.', ','));
    }
}
