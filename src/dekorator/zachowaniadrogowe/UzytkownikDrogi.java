package dekorator.zachowaniadrogowe;

/**
 * Created by Marta Pawlik on 24.01.2016.
 */
public abstract class UzytkownikDrogi {

    protected int x;
    protected int y;

    public abstract int getX();
    public abstract int getY();

    public abstract String getType();
    public abstract char getMark();
    public abstract int getSpeed();

    public abstract void przemiescUzytkownika();
    public abstract void wykonajKrok(int speed);



}
