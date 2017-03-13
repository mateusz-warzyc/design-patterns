package pl.mateuszwarzyc.creational.singleton.example;

/**
 * Created by Coffee13.
 */
public class SingletonExample {

    public static void main(String[] args) {
        Runtime singletonRuntime = Runtime.getRuntime();
        singletonRuntime.gc();
        System.out.println(singletonRuntime);

        Runtime anotcherRuntime = Runtime.getRuntime();
        System.out.println(anotcherRuntime);

        if(singletonRuntime == anotcherRuntime) {
            System.out.println("This is the same object");
        }

    }
}
