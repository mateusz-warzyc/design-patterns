package pl.mateuszwarzyc.creational.abstractFactory.impl;

/**
 * Created by Coffee13.
 */
public class AmexGoldValidator implements Validator {

    @Override
    public boolean isValid(CreditCard creditCard) {
        return false;
    }
}
