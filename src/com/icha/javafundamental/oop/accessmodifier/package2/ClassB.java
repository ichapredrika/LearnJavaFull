package com.icha.javafundamental.oop.accessmodifier.package2;

import com.icha.javafundamental.oop.accessmodifier.package1.ClassA;

public class ClassB extends ClassA {

    @Override
    protected void methodC() {
        super.methodC();
        System.out.println("Call protected from other package");
    }
}
