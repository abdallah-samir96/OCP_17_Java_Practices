package java8.interfaces;


@FunctionalInterface
public interface Executable {

    void print();

    default void log(){

    }
    static void logStatic(){

    }

}
