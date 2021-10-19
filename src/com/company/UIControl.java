package com.company;

public abstract class UIControl {
    public void enable() {
        System.out.println("Enable");
    }

    public abstract void draw();
    // abstract method can not have any body.
}
