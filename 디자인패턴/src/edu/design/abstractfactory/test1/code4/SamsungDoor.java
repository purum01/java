package edu.design.abstractfactory.test1.code4;

import edu.design.abstractfactory.test1.code1.Door;

public class SamsungDoor extends Door {
    protected void doClose() {
        System.out.println("close Samsung Door");
    }
    protected void doOpen() {
        System.out.println("open Samsung Door");
    }
}