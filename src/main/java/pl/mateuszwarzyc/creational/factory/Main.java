package pl.mateuszwarzyc.creational.factory;

import pl.mateuszwarzyc.creational.factory.impl.WebisteFactory;
import pl.mateuszwarzyc.creational.factory.impl.Website;
import pl.mateuszwarzyc.creational.factory.impl.WebsiteType;

/**
 * Created by Coffee13.
 */
public class Main {
    public static void main(String[] args) {
        Website site = WebisteFactory.getWebsite(WebsiteType.BLOG);

        System.out.println(site.getPages());

        site = WebisteFactory.getWebsite(WebsiteType.SHOP);

        System.out.println(site.getPages());

    }
}
