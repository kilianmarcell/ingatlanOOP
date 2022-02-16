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

    public RealEstate(String s) {
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
        this.longitude = Double.parseDouble(dates[10]);
        this.latitude = Double.parseDouble(dates[11]);
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getBaths() {
        return baths;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public int getSqFt() {
        return sqFt;
    }

    public void setSqFt(int sqFt) {
        this.sqFt = sqFt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDateTime getSale_date() {
        return sale_date;
    }

    public void setSale_date(LocalDateTime sale_date) {
        this.sale_date = sale_date;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return String.format("%-55s %-12s %8s db %11d nm %12d$",
                String.format("%d %s %s", this.zip, this.city, this.street),
                this.type, this.beds, this.sqFt, this.price);
    }
}
