package pl.mateuszwarzyc.creational.abstractFactory;

import pl.mateuszwarzyc.creational.abstractFactory.impl.CardType;
import pl.mateuszwarzyc.creational.abstractFactory.impl.CreditCard;
import pl.mateuszwarzyc.creational.abstractFactory.impl.CreditCardFactory;

/**
 * Created by Coffee13.
 */
public class Main {

    public static void main(String[] args) {

        CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(775);
        CreditCard card = abstractFactory.getCreditCard(CardType.PLATINUM);

        System.out.println(card.getClass());

        abstractFactory = CreditCardFactory.getCreditCardFactory(600);

        CreditCard card2 = abstractFactory.getCreditCard(CardType.GOLD);

        System.out.println(card2.getClass());

    }

}
