package pl.mateuszwarzyc.creational.builder.examples;

/**
 * Created by Coffee13.
 */
public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder();
        builder.append("This is a ");
        builder.append("example ");
        builder.append("of a ");
        builder.append("builder!!!");

        System.out.println(builder.toString());


    }
}
