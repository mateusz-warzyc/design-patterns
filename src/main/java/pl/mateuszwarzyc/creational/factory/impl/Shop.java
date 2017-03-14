package pl.mateuszwarzyc.creational.factory.impl;

/**
 * Created by Coffee13.
 */
public class Shop extends Website {
    @Override
    public void createWebsite() {
        pages.add(new CartPage());
        pages.add(new ItemPage());
        pages.add(new SearchPage());
    }
}
