package pl.mateuszwarzyc.creational.abstractFactory.impl;

/**
 * Created by Coffee13.
 */
public abstract class CreditCard {

    protected int carNumberLenght;

    protected int cscNumber;

    public int getCarNumberLenght() {
        return carNumberLenght;
    }

    public void setCarNumberLenght(int carNumberLenght) {
        this.carNumberLenght = carNumberLenght;
    }

    public int getCscNumber() {
        return cscNumber;
    }

    public void setCscNumber(int cscNumber) {
        this.cscNumber = cscNumber;
    }
}
