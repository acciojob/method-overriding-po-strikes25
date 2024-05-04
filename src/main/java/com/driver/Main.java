package com.driver;
public class Main {

    public static class A  {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        // @Override
        public String meth() {
            System.out.println(super.meth());
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        B object_b = new B();
        System.out.println(object_b.meth());
    }

}