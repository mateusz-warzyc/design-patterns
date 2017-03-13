package pl.mateuszwarzyc.creational.singleton.impl;

/**
 * Created by Coffee13.
 */
public class DbSingleton {

    private static DbSingleton instance = null;

    private DbSingleton() {
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    return new DbSingleton();
                }
            }

        }
        return instance;
    }
}
