package hu.petrik.ingatlanoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

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
        return realEstateList.stream().count();
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
