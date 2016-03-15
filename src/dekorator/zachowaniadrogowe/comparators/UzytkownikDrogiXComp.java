package dekorator.zachowaniadrogowe.comparators;

import dekorator.zachowaniadrogowe.UzytkownikDrogi;

import java.util.Comparator;

/**
 * Created by Marta Pawlik on 24.01.2016.
 */
public class UzytkownikDrogiXComp implements Comparator<UzytkownikDrogi> {

    @Override
    public int compare(UzytkownikDrogi o1, UzytkownikDrogi o2) {
        return o1.getX() - o2.getX();
    }
}
