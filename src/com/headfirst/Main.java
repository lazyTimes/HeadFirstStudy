package com.headfirst;

public class Main {

    static class superClass{
        static {
            System.out.println("super load");
        }
    }

    static class SubClass extends superClass{
        static {
            System.out.println("sub load");
        }

        public static void test(){
            System.out.println("sdsad");
        }
    }

    public static void main(String[] args) {
	    // write your code here
        SubClass.test();
    }
}
