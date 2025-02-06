package oop;

public class App {
    public static void main(String[] args) {
        /*
         *  Explanation of the Diamond Problem
         *
         *        A
         *      /   \
         *    B       C
         *     \     /
         *      \   /
         *        D
         *
         */
        new D().print();
    }
}
interface A{
    default void print(){
        System.out.println(A.class.getName());
    }
}

interface B{
    default void print(){
        System.out.println(B.class.getName());
    }
}

class D implements A,B {

    @Override
    public void print() {
        A.super.print();
        B.super.print();
    }
}