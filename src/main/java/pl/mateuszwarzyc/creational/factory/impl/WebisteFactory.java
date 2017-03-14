package pl.mateuszwarzyc.creational.factory.impl;

/**
 * Created by Coffee13.
 */
public class WebisteFactory {

    public static Website getWebsite(WebsiteType siteType) {
        switch (siteType) {
            case BLOG: {
                return new Blog();
            }
            case SHOP: {
                return new Shop();
            }
            default:
                return null;
        }
    }
}
