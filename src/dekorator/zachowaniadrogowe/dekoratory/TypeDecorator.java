package dekorator.zachowaniadrogowe.dekoratory;

import dekorator.zachowaniadrogowe.UzytkownikDrogi;

/**
 * Created by Marta Pawlik on 24.01.2016.
 */
public abstract class TypeDecorator extends UzytkownikDrogi {

    protected UzytkownikDrogi uzytkownik;

    public TypeDecorator(UzytkownikDrogi uzytkownik) {
        this.uzytkownik = uzytkownik;
    }

    @Override
    public int getY() {
        return uzytkownik.getY();
    }

    @Override
    public int getX() {
        return uzytkownik.getX();
    }

    @Override
    public void wykonajKrok(int predkosc) {
        uzytkownik.wykonajKrok(predkosc);
    }
}
