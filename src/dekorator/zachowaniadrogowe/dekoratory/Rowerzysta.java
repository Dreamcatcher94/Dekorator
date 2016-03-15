package dekorator.zachowaniadrogowe.dekoratory;

import dekorator.zachowaniadrogowe.UzytkownikDrogi;

/**
 * Created by Marta Pawlik on 24.01.2016.
 */
public class Rowerzysta extends TypeDecorator {

    public Rowerzysta(UzytkownikDrogi user) {
        super(user);
    }

    @Override
    public String getType() {
        return "Jestem rowerzysta!";
    }

    @Override
    public char getMark() {
        return 'R';
    }

    @Override
    public int getSpeed() {
        return 2;
    }

    @Override
    public void przemiescUzytkownika() {
        super.wykonajKrok(getSpeed());
    }
}
