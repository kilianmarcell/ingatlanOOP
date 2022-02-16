package hu.petrik.ingatlanoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class RealEstates {
    private List<RealEstate> realEstateList;

    public RealEstates(String fileName) {
        realEstateList = new LinkedList<>();

        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            br.readLine();
            String line = br.readLine();
            while (line != null) {
                realEstateList.add(new RealEstate(line));
                line = br.readLine();
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    public long getSalesNumber() {
        return realEstateList.stream()
                .count();
    }

    public RealEstate getBiggestRealEstate() {
        return realEstateList.stream()
                .max(Comparator.comparingInt(ingatlan -> ingatlan.getSqFt()))
                .get(); //legnagyobb ingatlan alapterülete
    }

    public int getBiggestRealEstateFt() {
        return this.realEstateList.stream()
                .map(ingatlan -> ingatlan.getSqFt())
                .max(Integer::compareTo)
                .get();
    }

    public long getSummary() {
        return realEstateList.stream()
                .mapToInt(R -> R.getPrice())
                .sum(); //ingatlanok árának összeadása
    }

    public long getCountOfRealEstateWithoutSize() {
        return realEstateList.stream()
                .filter(i -> i.getSqFt() == 0)
                .count(); //azok az ingatlanok amelyeknek nincs mérete
    }

    public boolean isSaleRealEstateInCity(String city) {
        return realEstateList.stream()
                .anyMatch(i -> i.getCity().equals(city));
    }

    public long getCountOfSalesInCity(String city) {
        return realEstateList.stream()
                .filter(ingatlan -> ingatlan.getCity().equals(city))
                .count();
    }

    public List<RealEstate> getSalesInCity(String city) {
        return realEstateList.stream()
                .filter(ingatlan -> ingatlan.getCity().equals(city))
                .collect(Collectors.toList());
    }

    public List<String> getSortedCities() {
        return realEstateList.stream()
                .map(ingatlan -> ingatlan.getCity())
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<RealEstate> getMostExpensiveRealEstate(int number) {
        return realEstateList.stream()
                .sorted(Comparator.comparingInt(RealEstate::getPrice).reversed())
                .limit(number)
                .collect(Collectors.toList());
    }

    public List<RealEstate> getCheapestRealEstate(int number) {
        return realEstateList.stream()
                .sorted(Comparator.comparingInt(RealEstate::getPrice))
                .limit(number)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        String s = "";
        for (RealEstate r: realEstateList) {
            s += r + "\n";
        }
        return s;
    }
}
