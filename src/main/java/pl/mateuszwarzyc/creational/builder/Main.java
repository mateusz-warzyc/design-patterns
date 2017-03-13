package pl.mateuszwarzyc.creational.builder;

import pl.mateuszwarzyc.creational.builder.impl.LunchOrder;

/**
 * Created by Coffee13.
 */
public class Main {

    public static void main(String[] args) {

        LunchOrder.Builder builder = new LunchOrder.Builder();
        builder.bread("chlebek").condiments("serek").dressing("1000 wysp").meat("kurczak");

        LunchOrder order = builder.build();

        System.out.println(order.getBread());
        System.out.println(order.getCondiments());
        System.out.println(order.getDressing());
        System.out.println(order.getMeat());


    }
}
