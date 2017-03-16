package pl.mateuszwarzyc.behavioral.strategy;

import pl.mateuszwarzyc.behavioral.strategy.impl.AmexStrategy;
import pl.mateuszwarzyc.behavioral.strategy.impl.CreditCard;

/**
 * Created by Coffee13.
 */
public class Main {

    public static void main(String[] args) {

        CreditCard amexCard = new CreditCard(new AmexStrategy());

        amexCard.setNumber("379185883464283");
        amexCard.setDate("04/2020");
        amexCard.setCvv("123");

        System.out.println("Is Amex valid: " + amexCard.isValid());

    }

}
