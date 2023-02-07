package com.driver;
public class Main {
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        public String meth() {
            return "Method is overridden in Extendend class B";
        }
    }

    public static void main(String[] args) {
        B object_b = new B();
        System.out.println(object_b.meth());
        B object_bb = new B();
        System.out.println(object_bb.meth());
    }
  
}