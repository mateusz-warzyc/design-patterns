package pl.mateuszwarzyc.behavioral.strategy.impl;

/**
 * Created by Coffee13.
 */
public class VisaStrategy extends ValidationStrategy {
    @Override
    public boolean isValid(CreditCard card) {
        boolean isValid = true;
        isValid = card.getNumber().startsWith("4");

        if (isValid) {
            isValid = card.getNumber().length() == 16;
        }

        if (isValid) {
            isValid = passesLuhn(card.getNumber());
        }

        return isValid;
    }
}
