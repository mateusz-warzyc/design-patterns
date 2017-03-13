package pl.mateuszwarzyc.creational.singleton;

import pl.mateuszwarzyc.creational.singleton.impl.DbSingleton;

/**
 * Created by Coffee13.
 */
public class Main {

    public static void main(String[] args) {

        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotcherSingleton = DbSingleton.getInstance();

        System.out.println(anotcherSingleton);

    }
}
